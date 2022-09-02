package stream.methods.javafreqaskedQA;

public class products {

	private int pid;
	private String pname;
	private String pdesc;
	private String ploc;
	private double pcost;
	
	
	
	public products(int pid, String pname, String pdesc, String ploc, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
		this.ploc = ploc;
		this.pcost = pcost;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPloc() {
		return ploc;
	}
	public void setPloc(String ploc) {
		this.ploc = ploc;
	}
	public double getPcost() {
		return pcost;
	}
	public void setPcost(double pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "products [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", ploc=" + ploc + ", pcost=" + pcost
				+ "]";
	}
	
	
}
