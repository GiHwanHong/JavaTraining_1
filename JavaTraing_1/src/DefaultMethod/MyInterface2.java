package DefaultMethod;

public interface MyInterface2 {
	default void method1(){
		System.out.println("Method() in MyInterface2");
	}
	static void staticMethod(){
		System.out.println("staticMethod() in MyInterface2");
	}
}
