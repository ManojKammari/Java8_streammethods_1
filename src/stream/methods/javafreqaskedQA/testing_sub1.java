package stream.methods.javafreqaskedQA;

public class testing_sub1 {

	private int a;
	private String b;
	private Double c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public Double getC() {
		return c;
	}
	public void setC(Double c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return "testing_sub1 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	private void dp()
	{
		System.out.println(" Inside private dp method");
	}
	
	public void ap()
	{
		System.out.println("inside public ap method");
		dp();
	}

	public static void main(String[] args) {
		testing_sub1 s1 = new testing_sub1();
		s1.setA(10);
		s1.setB("Sikkar");
		s1.setC(1700.00d);
		System.out.println(s1);
		System.out.println("************");
		s1.ap();
	}
}

