package test;

public class Employee {

	private int empId;
	private String name;
	private String city;
	
	public Employee(int empId, String name, String city) {
		this.empId = empId;
		this.name = name;
		this.city = city;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int hashCode() {
		return this.empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
