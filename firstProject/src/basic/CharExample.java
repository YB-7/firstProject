package basic;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';		//���ڸ� ���� ����
		char c2 = 65;		//10������ ����
		char c3 = '\u0041';	//16������ ����
		
		char c4 = '��';		//���ڸ� ���� ����
		char c5 = 44032;	//10������ ����
		char c6 = '\uac00';	//16������ ����
		
		int uniCode = c1;	//�����ڵ� ���
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}
}
