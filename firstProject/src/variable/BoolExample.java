package variable;

public class BoolExample {
	public static void main(String[] args) {
		boolean existOrNot = true;
		int notExist = 10;
		
		existOrNot = notExist != 50;
		
		if (!existOrNot) {
			System.out.println("존재하는 값입니다.");
		}
		
		System.out.println(Byte.MAX_VALUE);
		if(Byte.MAX_VALUE < 200) {
			System.out.println("참입니다.");
		}
		
		System.out.println(Long.MAX_VALUE);
		
		System.out.println("end of prog.");
	}
}
