package Basicjava;

public class concrete extends AbstractClass {
	
	public void jitu() {
		System.out.println("jitu method");
	}
	
	public void test() {
		System.out.println("abstract class method compl");
	}
	
	public static void main(String[] args) {
		
		concrete obj = new concrete();
		obj.test();
		obj.jitu();
		obj.pr();
		obj.demo();
		
	}

}
