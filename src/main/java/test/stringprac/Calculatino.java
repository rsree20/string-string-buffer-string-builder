package test.stringprac;

import java.util.HashMap;

public class Calculatino {

	public void retriveHashMap(HashMap<Student, String> h) {
		Student key = new Student(100, "Ravi", "Hyderabad");
		
		Student obj = key.changeStudentId(102);
		Student obj2 = obj.changeName("Ravi kishore");
		
		System.out.println(obj2.getStdId());
		System.out.println(obj2.getName());
		System.out.println("------" + obj.getName());
		
		System.out.println(h.get(key));
	}
	
	public void retriveHashString(HashMap<String, String> hs) {
		String key1 = new String("ravi");
		String key2 = new String("ravi");
		
		StringBuffer sb1 = new StringBuffer("ravi");
		StringBuffer sb2 = new StringBuffer("ravi");
		
		key1.replace("ravi", "rakul");
		System.out.println(hs.get(key1));
	}
}
