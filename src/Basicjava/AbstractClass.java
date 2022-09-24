package Basicjava;

public abstract class AbstractClass {
	
	public static void pr()
	{
		System.out.println("static method");
	}
	public void demo()
	{
		System.out.println("demo method");
	}
	public abstract void test();
	
	public static void main(String[] args) {
		
		AbstractClass obj = new AbstractClass();
		
	}

}
