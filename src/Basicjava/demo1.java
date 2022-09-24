package Basicjava;

public class demo1 extends demo  {
		int i=20;
	public void show (int i)
	{
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		demo1 t = new demo1();
		t.show(30);
	}

	}


