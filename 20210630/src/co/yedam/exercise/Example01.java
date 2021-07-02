package co.yedam.exercise;

public class Example01 {
	public static void main(String[] args) {
		// e1, 사원번호: 1234, 이름: 박주현, 이메일: pjh@email.com
		// 급여: 4500000, 부서: 개발부
		Employee e1 = new Employee();
		e1.setEmpID(1234);
		e1.setEmpName("박주현");
		e1.setEmpMail("pjh@email.com");
		e1.setEmpSalary(4500000);
		e1.setEmpDepart("개발부");

		e1.showInfo(); // 사원번호: 1234 이름: 박주현 이메일: pjh@email.com

		// e2, 사원번호: 1235, 이름: 홍미림, 이메일: hmr@email.com
		Employee e2 = new Employee(1235, "홍미림", "hmr@email.com");
		e2.showInfo();

		// 배열 : employees 크기 5
		Employee[] employees = new Employee[5];
		// 첫번째 위치: e1, 두번째 위치: e2
		employees[0] = e1;
		employees[1] = e2;
		// 세번째 위치: new Employee(1236, "임효인", "lhi@email.com", 5000000, "총무부");
		employees[2] = new Employee(1236, "임효인", "lhi@email.com", 5000000, "총무부");

		// 배열의 각각 요소의 값을 출력해주세요
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null) {
				employees[i].showInfo();
			}
		}
	} // end of main()
} // end of class
