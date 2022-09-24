package Basicjava;

public class practice {

	public static void main(String[] args) {
		String st= "rathi";
		String str = "pratik";
		String rev = "";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);  
		
		StringBuffer pr = new StringBuffer();
		st=st+pr.reverse();
		System.out.println(st);
		
		  
	}

}
