package Basicjava;

public class sample {
	
	/*sample()
	{
		this(10);
		System.out.println("no arg con");
	}
	sample(int b)
	{
		System.out.println("para con");
	}
	public static void main(String[] args) {
		
	sample obj = new sample();
	}*/
	sample()
	{
		System.out.println("no arg con");
	}
	sample(int b)
	{
		this();
		System.out.println("para con");
	}
	public static void main(String[] args) {
		
	sample obj = new sample(10);
	}


}
