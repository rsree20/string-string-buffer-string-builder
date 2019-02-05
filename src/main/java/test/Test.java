package test;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		
		
		StringBuffer sb1 = new StringBuffer("test");
		StringBuffer sb2 = new StringBuffer("test");
		
		String s3 = s1.replace("test", "rest");
		sb1.replace(0, sb1.length(), "rest");
		
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(sb1);
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put(s1, "test one");
		hm.put(s2, "test two");
		
		System.out.println(hm);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	}
}
