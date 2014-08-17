
public class Condition {

	private String B,C,D,E,name1;

	public String getName() {
		return name1;
	}

	public void setName(String name1) {
		this.name1 = name1;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

	public String getE() {
		return E;
	}

	public void setE(String e) {
		E = e;
	}
	public boolean checkValid(String ds)
	{
		return this.D.equals(ds);
	}

}
