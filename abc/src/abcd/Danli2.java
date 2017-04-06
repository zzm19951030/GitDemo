package abcd;

public class Danli2 {
	private static Danli2 da;
	private Danli2(){
		
	}
	public static Danli2 getInstance(){
		if(da==null){
			da = new Danli2();
		}
		return da;
	}
	
	public void login(){
		System.out.println("°¡¹þ¹þ");
	}
}
