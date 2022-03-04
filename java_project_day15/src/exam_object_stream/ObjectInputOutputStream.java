package exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*이름(name)과 나이(age)를 필드로 가진 Person 클래스를 생성한다. 생성자, 설정자, 접근자 등을 생성하고 사용자로 하여금 데이터를 입력받아
 * 인스턴스를 생성한다. 그 데이터를 person.dat 파일에 저장한다.
 * - person.dat 파일에 Person 데이터를 저장 : output 메서드 생성
 * - person.dat 파일에서 데이터를 읽어서 Person 복원하여 출력 : input 메서드 생성
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

			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("나이 : ");
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
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (IOException e) {
		}

	}

}
