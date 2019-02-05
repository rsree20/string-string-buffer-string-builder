package test.stringprac;

public class Student {

	private int stdId;
	private String name;
	private String city;

	public Student(int stdId, String name, String city) {
		this.stdId = stdId;
		this.name = name;
		this.city = city;

	}

	public Student changeStudentId(int stdId) {
		if(this.stdId == stdId) {
			return this;
		} else {
			return new Student(stdId, this.name, this.city);
		}
	}
	
	public Student changeName(String name) {
		if(this.name.equals(name))
			return this;
		else 
			return new Student(this.stdId, name, this.city);
	}

	

	public int getStdId() {
		return stdId;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public int hashCode() {
		return stdId;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
