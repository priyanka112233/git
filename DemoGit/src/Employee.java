
public class Employee {
	private int ampId;
	private String empNme;
	private String empSal;

	public Employee(int ampId, String empNme, String empSal) {
		super();
		this.ampId = ampId;
		this.empNme = empNme;
		this.empSal = empSal;
	}

	public int getAmpId() {
		return ampId;
	}

	public void setAmpId(int ampId) {
		this.ampId = ampId;
	}

	public String getEmpNme() {
		return empNme;
	}

	public void setEmpNme(String empNme) {
		this.empNme = empNme;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

}
