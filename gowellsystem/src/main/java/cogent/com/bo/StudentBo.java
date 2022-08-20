package cogent.com.bo;

public class StudentBo {

	private int sno;
	private String sname;
	private String rollNo;
	private String emailId;
	private String mobileNumber;

	public StudentBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBo(int sno, String sname, String rollNo, String emailId, String mobileNumber) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.rollNo = rollNo;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	@Override
	public String toString() {
		return "StudentBo [sno=" + sno + ", sname=" + sname + ", rollNo=" + rollNo + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
