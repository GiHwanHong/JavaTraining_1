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
		ml.add("트랜스 포머");
		ml.add("스타워즈");
		ml.add("매트릭스");
		ml.add(0,"터미네이터");
		ml.add(2,"아바타");
		
		Collections.sort(ml);
		printList(ml);
		
		Collections.reverse(ml);
		printList(ml);
		
		int index = Collections.binarySearch(ml, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소 입니다.");
	}
	

}
