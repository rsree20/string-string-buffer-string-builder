package test;

import java.util.HashMap;

public class HmPrac {

	public void testHm(HashMap<Employee, String> hm) {
		Employee e1 = new Employee(100, "Ravi", "Hyderabad");
		
		e1.setEmpId(103);
		String code = hm.get(e1);
		System.out.println(code);
	}
	
	public void testwithString(HashMap<String, String> hms) {
		String s1 = "hyd";
		s1.replace("hyd", "");
		String code = hms.get(s1);
		System.out.println(code);
	}
}
