package cogent.com.bo;

public class EmployerBo {

	private int empId;
	private String empName;
	private String empRole;
	private long salary;
	public EmployerBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployerBo(int empId, String empName, String empRole, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.salary = salary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public long getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "EmployerBo [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", salary=" + salary
				+ "]";
	}
	
}
