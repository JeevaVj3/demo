package ArrayList;

public class Employee {
	private String name;
	private int id;
	private int age;
	private int Salary;
	private int experence;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getExperence() {
		return experence;
	}
	public void setExperence(int experence) {
		this.experence = experence;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee(String name, int id, int age, int salary, int experence, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		Salary = salary;
		this.experence = experence;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", Salary=" + Salary + ", experence="
				+ experence + ", gender=" + gender + "]";
	}
	
}
