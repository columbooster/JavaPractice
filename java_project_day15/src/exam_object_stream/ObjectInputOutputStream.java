package exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*�̸�(name)�� ����(age)�� �ʵ�� ���� Person Ŭ������ �����Ѵ�. ������, ������, ������ ���� �����ϰ� ����ڷ� �Ͽ��� �����͸� �Է¹޾�
 * �ν��Ͻ��� �����Ѵ�. �� �����͸� person.dat ���Ͽ� �����Ѵ�.
 * - person.dat ���Ͽ� Person �����͸� ���� : output �޼��� ����
 * - person.dat ���Ͽ��� �����͸� �о Person �����Ͽ� ��� : input �޼��� ����
 */

public class ObjectInputOutputStream {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String file = "person.dat";
		output(file);
		input(file);

	}

	private static void output(String file) {

		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			System.out.print("�̸� : ");
			String name = scan.nextLine();
			System.out.print("���� : ");
			int age = scan.nextInt();
			scan.nextLine();

			oos.writeObject(new Person(name, age));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	private static void input(String file) {

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				Person p = (Person) ois.readObject();
				System.out.println(p.toString());
			}
		} catch (ClassNotFoundException c) {
			System.out.println("Ŭ������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
		}

	}

}
