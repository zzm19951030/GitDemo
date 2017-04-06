package abc;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class Demo2 {

	public static void main(String[] args) {
		try {
			simpleJson();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void simpleJson() throws JSONException {
		JSONObject object=new JSONObject();
		   object.put("one","value1");
		   object.put("two",false);
		   object.put("three",123);
		   object.put("four", 1234567890124L);
//		   Map<String,String> maps=new HashMap<String,String>();
//		   maps.put("userName", "bobo");
//		   object.put("five", maps); 
		   object.put("six",new String());
		   System.out.println(object.toString());
	}

}
