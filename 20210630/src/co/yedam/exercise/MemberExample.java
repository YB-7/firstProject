package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberID(101);
		m1.setMemberName("Park");
		m1.setMemberPhone("010");
		System.out.println(m1.getMemberID() + "," + m1.getMemberName() + "," + m1.getMemberPhone());
//		m1 = new Member(101, "Hong", "01011111234", "0101", Gender.MEN);
//		System.out.println(m1.getMemberID());
		m1 = new Member(101, "Hwang", "01022221234");
		System.out.println(m1.getMemberID() + "," + m1.getMemberName() + "," + m1.getMemberPhone());
	} // End of main()
} // End of Class
