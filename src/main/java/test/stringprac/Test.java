package test.stringprac;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(100,"Ravi","Hyderabad");
		Student s2 = new Student(102,"Rahul","Hyderabad");
		Student s3 = new Student(103,"Rakul","Hyderabad");
		
		s2.getCity().replace("Hyderabad", "Pune");
		System.out.println(s1.getCity());
		System.out.println(s2.getCity());
		System.out.println(s3.getCity());
	}
}
