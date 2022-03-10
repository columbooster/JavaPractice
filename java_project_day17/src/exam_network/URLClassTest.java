package exam_network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLClassTest {

	public static void main(String[] args) {

		try {
			URL myURL = new URL("http://java.sun.com:80/docs/books/index.html?name=database#TOP");

			System.out.println("�������� = " + myURL.getProtocol()); // �������� = http
			System.out.println("ȣ��Ʈ��� ��Ʈ = " + myURL.getAuthority()); // ȣ��Ʈ��� ��Ʈ = java.sun.com:80
			System.out.println("ȣ��Ʈ�� = " + myURL.getHost()); // ȣ��Ʈ�� = java.sun.com
			System.out.println("��Ʈ = " + myURL.getPort()); // ��Ʈ = 80
			System.out.println("��� = " + myURL.getPath()); // ��� = /docs/books/index.html
			System.out.println("query = " + myURL.getQuery()); // query = name=database
			System.out.println("��ο� query = " + myURL.getFile()); // ��ο� query = /docs/books/index.html?name=databse
			System.out.println("ref = " + myURL.getRef()); // ref = TOP

		} catch (MalformedURLException e) {
			System.out.println("URL ERROR");
		}

	}

}
