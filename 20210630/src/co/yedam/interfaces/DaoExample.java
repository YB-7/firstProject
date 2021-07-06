package co.yedam.interfaces;

public class DaoExample {
	public static void main(String[] args) {
		Dao dao = new OracleDao(); // 인터페이스도 일종의 부모같은 역할
		// 상속이 아닌 구현이라고 함

		dao.insert();
		dao.update();
		dao.delete();

		// 익명 class
		Dao dao2 = new Dao() {
			@Override
			public void insert() {
				System.out.println("sqlite 입력처리");
			}
			@Override
			public void update() {
				System.out.println("sqlite 수정처리");
			}
			@Override
			public void delete() {
				System.out.println("sqlite 삭제처리");
			}
		};
		
		dao2.insert();
		dao2.update();
		dao2.delete();
//		dao = new MysqlDao();
	}
}
