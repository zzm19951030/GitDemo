package abcd;

public class Danli {
	private static Danli da = new Danli();
	private Danli(){
		
	}
	public static Danli getInstance(){
		return da;
	}
	
	public String login(){
		System.out.println("°¡¹þ¹þ");
		return "";
	}
}
