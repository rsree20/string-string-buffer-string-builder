package test;

import java.util.HashMap;

public class HmTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Ravi", "Hyderabad");
		Employee e2 = new Employee(101, "Raju", "Pune");
		
		
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(e1, "This is charminar");
		hm.put(e2, "This is Hill station");
		
		HmPrac p = new HmPrac();
		p.testHm(hm);
		System.out.println(hm);
		
		
		HashMap<String, String> hms = new HashMap<String, String>();
		String s1 = "hyd";
		String s2 = "pune";
		hms.put(s1, "This is charminar");
		hms.put(s2, "This is Hill station");
		p.testwithString(hms);
		
	}
}
