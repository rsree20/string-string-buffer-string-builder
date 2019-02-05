package test;

public class Testing {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Ravi", "Hyderabad");
		Employee e2 = new Employee(101, "Raju", "Pune");
		
		e1.setEmpId(100);
		e1.setName("Raju");
		e1.setCity("Hyderabad");
		
		e2.setEmpId(101);
		e2.setName("Ravi");
		e2.setCity("Hyderabad");
		
		String updatedCity = e2.getCity().replace("Hyderabad", "Pune");
		System.out.println(updatedCity);
//		e2.setCity("Pune");
		System.out.println(e1.getCity() == e2.getCity());
		System.out.println(e1.getCity());
		System.out.println(e2.getCity());
	}
}
