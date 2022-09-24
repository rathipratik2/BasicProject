package Basicjava;

import java.io.FileInputStream;

public class ExceptionTryAndCatch {

	public static void main(String[] args) {
		
	try
	{
		//FileInputStream pr = new FileInputStream("d:/abc.txt");//checked exception
		int a=100, b=0,c; //unchecked exeption
		c=a/b;
		System.out.println(c);
		
		System.out.println("hello pratik");
		/*if exception is occured then try ke niche ka code execute nhi karenga
        direct catch block ka code exicute honga*/ 
		//if exception is not occured then catch block  ka code execute nhi karenga
	}
	catch(Exception e)
	{
		e.printStackTrace(); //it provide exception name , description and stack trace(line number) most use 
		//System.out.println(e);it provide exception name , description
		//System.out.println("sonu");
	}
	System.out.println("hello java");
	int a=100, b=2,c;
	c=a/b;
	System.out.println(c);
	}

}
