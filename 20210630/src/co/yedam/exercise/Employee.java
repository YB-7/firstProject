package co.yedam.exercise;

public class Employee {
	// 필드(사원) 정의
	// 사원번호
	// 이름
	// 이메일
	// 급여
	// 부서
	private int empID;

	private String empName;

	private String empMail;
	private int empSalary;
	private String empDepart;

	// 생성자
	public Employee() {
		
	}
	
	public Employee(int empID, String empName, String empMail) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empMail = empMail;
	}
	
	public Employee(int empID, String empName, String empMail, int empSalary, String empDepart) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empMail = empMail;
		this.empSalary = empSalary;
		this.empDepart = empDepart;
	}
	
	// 메소드 정의
	// get, set
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public void showInfo() {
		System.out.println("사원번호: " + this.empID + " 이름: " + this.empName + " 이메일: " + this.empMail);
	}
} // end of class
