package HashMap;

import java.util.*;

class Student{
	int id;
	String tel;
	public Student(int id, String tel){
		this.id = id;
		this.tel = tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student name and Student Object , HashMap Correction create
		HashMap<String , Student> map = new HashMap<String, Student>();
		
		// 3Student save
		map.put("Ȳ���� ", new Student(1, "010-1111-1234"));
		map.put("�ѿ���", new Student(2, "010-2222-1234"));
		map.put("�̿���", new Student(3, "010-3333-1245"));
		
		System.out.println("HashMap�� ��� ���� : " + map.size());
		
		Set<String> names = map.keySet();
		Iterator<String> it = names.iterator();
		
		while (it.hasNext()) {
			String name = it.next();
			Student st = map.get(name);
			System.out.println(name + " : " + st.id +" "+st.tel);
		}
	}
}
