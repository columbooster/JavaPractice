package exam_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import exam_network.MessengerA.MyFrame;

public class MessengerB {

	protected JTextField textField;
	protected JTextArea textArea;
	protected JScrollPane scrollPane;

	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;

	final int myPort = 6000; // ���ſ� ��Ʈ��ȣ
	final int otherPort = 5000; // �۽ſ� ��Ʈ��ȣ

	public MessengerB() throws IOException {
		new MyFrame();
		address = InetAddress.getByName("127.0.0.1");
		socket = new DatagramSocket(myPort);

	}

	// ��Ŷ�� �޾Ƽ� �ؽ�Ʈ ������ ǥ���Ѵ�.
	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet); // ��Ŷ�� �޴´�.
				// ���� ��Ŷ�� �ؽ�Ʈ ������ ǥ���Ѵ�.
				textArea.append("RECIVED: " + new String(buf) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// ���� Ŭ���� ����
	class MyFrame extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;

		public MyFrame() {
			super("MessengerB");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			textField = new JTextField(30);
			textField.addActionListener(this);

			textArea = new JTextArea(10, 30);
			textArea.setEditable(false);
			scrollPane = new JScrollPane(textArea); // ��ũ������ �߰�
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			add(textField, BorderLayout.PAGE_END);
			// add(new JScrollPane(textArea), BorderLayout.CENTER);
			add(scrollPane, BorderLayout.CENTER);
			pack();
			setVisible(true);

		}

		public void actionPerformed(ActionEvent evt) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet;

			// ��Ŷ�� �����Ѵ�
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet);
			} catch (IOException e) {
				e.printStackTrace();
			}
			textArea.append("SEND: " + s + "\n");
			textField.selectAll();

		}

	}

	public static void main(String[] args) throws IOException {

		MessengerB m = new MessengerB();
		m.process();
	}

}
