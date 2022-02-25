package exam_collection_set;

/*----------------- ���� ��� -----------------
 * HashSet ��� : [Ham, Butter, Cheese, Milk, Bread]
 * LinkedHashSet ��� : [Milk, Bread, Butter, Cheese, Ham]
 * TreeSet ��� : [Bread, Butter, Cheese, Ham, Milk]
 * 
 * 
 */

import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.TreeSet;

import java.util.Iterator;

public class SetInterfaceTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		//TreeSet<String> set = new TreeSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set.toString());
		
		//�ݺ���
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(Integer.valueOf(3));
		set1.add(5);
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1.toString());
		
		
	}

}
