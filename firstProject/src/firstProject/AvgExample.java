package firstProject;

public class AvgExample {
	public static void main(String[] args) {
		// ����, ����, ���� 0 ~ 100
		int kor, math, eng;
		// ����: 85, ����: 88, ���� 83
		kor = 75;
		math = 88;
		eng = 83;
		// �հ�, ���
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		// �л��̸�: ������
		String name = "������";
		
		System.out.println(name + "�� �����հ�� " + sum + ", ����� " + avg + " �Դϴ�.");
	}
}
