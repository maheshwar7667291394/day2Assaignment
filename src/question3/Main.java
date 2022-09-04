package question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		LinkedHashMap<String,String> tm=new LinkedHashMap<>();
		tm.put("Bihar","patna");
		
		tm.put("rajsthan","jaipur");
		tm.put("up","lakhnaw");
		tm.put("dehradun","haridwar");
	
		
		Set<Map.Entry<String, String>> keyvalue=tm.entrySet();
		for(Map.Entry<String, String> item:keyvalue) {
			System.out.println(item.getKey()+"--------"+item.getValue());
		}
	}

}
