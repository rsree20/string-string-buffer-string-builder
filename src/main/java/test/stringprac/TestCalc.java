package test.stringprac;

import java.util.HashMap;

public class TestCalc {

	public static void main(String[] args) {
		Student s1 = new Student(100,"Ravi","Hyderabad");
		Student s2 = new Student(102,"Rahul","Hyderabad");
		Student s3 = new Student(103,"Rakul","Hyderabad");
		
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(s1, "This is Ravi");
		hashMap.put(s2, "This is Rahul");
		hashMap.put(s3, "This is Rakul preet");
		
		Calculatino c = new Calculatino();
		c.retriveHashMap(hashMap);
	}
}
