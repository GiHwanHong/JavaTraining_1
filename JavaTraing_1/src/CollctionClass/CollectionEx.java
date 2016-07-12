package CollctionClass;

import java.util.*;

public class CollectionEx {

	static void printList(LinkedList<String> l) {

		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String e = it.next();
			String sp;
			if (it.hasNext())
				sp = "->";
			else
				sp = "\n";
			System.out.print(e + sp);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> ml = new LinkedList<String>();
		ml.add("Ʈ���� ����");
		ml.add("��Ÿ����");
		ml.add("��Ʈ����");
		ml.add(0,"�͹̳�����");
		ml.add(2,"�ƹ�Ÿ");
		
		Collections.sort(ml);
		printList(ml);
		
		Collections.reverse(ml);
		printList(ml);
		
		int index = Collections.binarySearch(ml, "�ƹ�Ÿ") + 1;
		System.out.println("�ƹ�Ÿ�� " + index + "��° ��� �Դϴ�.");
	}
	

}
