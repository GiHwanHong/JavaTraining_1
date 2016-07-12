package MakeGeneric;

class GStack<T> { // Create Generic Stack, Generic Type T
	int tos;
	Object[] Stck;
	public GStack(){
		tos = 0;
		Stck = new Object[10];
	}
	public void push(T item) {
		if (tos == 10)
			return;
		Stck[tos] = item;
		tos++;
	}
	public T pop() {
		if (tos == 0)
		   return null;
		tos--;
		return (T) Stck[tos];
	}
}
public class MyStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("Seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
	    intStack.push(5);
	    
	    for(int n = 0;n<3;n++)
	    	System.out.println(intStack.pop());

	}

}
