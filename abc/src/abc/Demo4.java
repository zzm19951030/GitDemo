package abc;

public class Demo4 {
	public String str = "";
	public Demo4 d4;
	
	public Demo4(String str1){
		this.str = str1;
	}
	public void getString(String str2){
		d4 = new Demo4(str2);
	}
	
	public static void main(String[] args){
		Demo4 d = new Demo4("hello");
		d.getString("word");
		System.out.println(d.str);
	}
}
