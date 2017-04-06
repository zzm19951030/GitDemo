package abc;

public class Text2 extends Text1{
	{
		System.out.println("1");
	}
	Text2(){
		System.out.println("2");
	}
	static{
		System.out.println("3");
	}
	{
		System.out.println("4");
	}

	public static void main(String[] args) {
		new Text2();
	}

}

class Text1{
	Text1(){
		System.out.println("5");
	}
	static{
		System.out.println("6");
	}
}
