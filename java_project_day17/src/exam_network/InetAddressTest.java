package exam_network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress itan = InetAddress.getByName("www.naver.com");
		InetAddress itad = InetAddress.getByName("www.daum.net");

		System.out.println("ȣ��Ʈ��� IP : " + itan.toString());
		System.out.println("ȣ��Ʈ�� : " + itad.getHostName());
		System.out.println("IP : " + itad.getHostAddress());

		InetAddress ina[] = InetAddress.getAllByName("www.naver.com");
		for (int i = 0; i < ina.length; i++) {
			System.out.println(ina[i]);
		}
		System.out.println();

		InetAddress ital = InetAddress.getLocalHost();
		System.out.println("���� ȣ��Ʈ��� IP : " + ital);
		System.out.println("���� ��ǻ�� �̸� : " + ital.getHostName());
		System.out.println("���� ��ǻ�� IP�ּ� : " + ital.getHostAddress());

	}

}
