package abc;

class Fu {
	static void eat(){
		System.out.println("fu eat...");
	}
	public void fu(){
		System.out.println("fu");
	}
}

class Zi extends Fu{
	static void eat(){
		System.out.println("zi eat...");
	}
	public void zi(){
		System.out.println("zi");
	}
}

public class Demo5 {
	public static void main(String[] args){
		Fu fu = new Zi();
		fu.fu();//д���
		fu.eat();//д���
		Zi zi = new Zi();
		zi.fu();//д���
		zi.eat();//д���
	}
	
}
