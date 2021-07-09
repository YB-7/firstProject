package co.yedam.api;

public class StringExample2 {
	public static void main(String[] args) {
		String birth1 = "9703041234567";
		String birth2 = "970304 1234567";
		String birth3 = "970304-2234567";
		String birth4 = "020304-3234567";
		String birth5 = "050304 4234567";

		String gen = checkGender(birth5);
		System.out.println(gen + "입니다.");
	}

	public static String checkGender(String id) {
		char gen = 0;
		if (id.length() == 13) {
			gen = id.charAt(6);
		} else {
			gen = id.charAt(7);
		}

		String gender = "";
		switch (gen) {
		case '1':
		case '3':
			gender = "남자";
			break;
		case '2':
		case '4':
			gender = "여자";
			break;
		}
		return gender;
	}
}
