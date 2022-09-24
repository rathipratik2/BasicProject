package Basicjava;

public class ifelsestatement {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=100;
		
		
		if(a==b &&	 b==c)
		{
			System.out.println("all numbers are equal");
		}
	    else if((a>b) && (a>c))
		{
			System.out.println("A is largest");
		}
		else if((b>a) && (b>c))
		{
			System.out.println("b is largest");
		}
		else if(a==b)
		{
			System.out.println("A and b is largest");
		}
		else if(a==c)
		{
			System.out.println("A and c is largest");
		}
		else if(b==c)
		{
			System.out.println("b and c is largest");
		}
		else
		{
			System.out.println("c is largest");
		}

	}

}
