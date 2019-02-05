package test.stringprac;

import java.util.HashMap;

public class TestCalcString {

	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("ravi", "He is from Hyderabad");
		hs.put("rahul", "He is from Pune");
		hs.put("rakul", "She is from Mumbai");
		
		Calculatino c = new Calculatino();
//		c.retriveHashString(hs);
		
		
		String key1 = new String("ravi");
		String key2 = new String("ravi");
		
		StringBuffer sb1 = new StringBuffer("ravi");
		StringBuffer sb2 = new StringBuffer("ravi");
		
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
//		System.out.println(sb1.hashCode());
//		System.out.println(sb2.hashCode());
	}
}
