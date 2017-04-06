package abc;

public class Text3 extends Text4{
	
	int i = 30;
	Text3(){
		print();
		i = 40;
	}
	public static void main(String[] args) {
		System.out.println(new Text3().i);
	}
	void print(){
		System.out.println(i);
	}

}

class Text4{
	int i = 10;
	Text4(){
		print();
		i = 20;
	}
	void print(){
		System.out.println(i);
	}
}
