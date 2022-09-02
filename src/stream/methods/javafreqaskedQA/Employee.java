package stream.methods.javafreqaskedQA;

public class Employee {

	private int eid;
	private String ename;
	private int eage;
	private String edept;
	private double esal;
	private String status = "active";
	
	
	
	

	public Employee(int eid, String ename, int eage, String edept, double esal, String status) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.edept = edept;
		this.esal = esal;
		this.status = status;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", edept=" + edept + ", esal=" + esal
				+ ", status=" + status + "]";
	}
	
	
	
	
}
