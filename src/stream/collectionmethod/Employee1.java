package stream.collectionmethod;

public class Employee1 {
	private String name;
	private String dept;
	private int sal;
	public Employee1(String name, String dept, int sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
	

}
