package co.yedam.pilates;

public class Member {

	private int memberID;
	private String memberName;
	private String memberPhone;
	private String memberBirth;
	private Gender memberGen;

	public Member() {
		this.memberID = 100;
		this.memberName= "홍길동";
		this.memberPhone = "010";
	}

	public Member(int memberID, String memberName, String memberPhone) {
//		super();
//		this.memberID = memberID;
//		this.memberName = memberName;
//		this.memberPhone = memberPhone;
	}
	
	public Member(int memberID, String memberName, String memberPhone, String memberBirth, Gender memberGen) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberBirth = memberBirth;
		this.memberGen = memberGen;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public Gender getMemberGen() {
		return memberGen;
	}

	public void setMemberGen(Gender memberGen) {
		this.memberGen = memberGen;
	}

	public String showInfo() {
		String info = "회원ID: " + this.memberID + " 회원이름: " + this.memberName + " 연락처: " + this.memberPhone + " 생년월일: "
				+ this.memberBirth + " 성별: " + this.memberGen;
		return info;
	}
}
