import java.util.Scanner;

public class Ex06_login {

	public static void main(String[] args) {
		String id = "Hello";
		String password = "1234";
		Scanner sc = new Scanner(System.in);

		String id2;
		String password2;

		// �α����� �������� ��쿡 ����Է�
		// �α����� �����ϸ� ���α׷� ����
		
		/*
		do {
			System.out.print("���̵� �Է����ּ��� : ");
			id2 = sc.next();
			System.out.print("��й�ȣ�� �Է����ּ��� : ");
			password2 = sc.next();

			if (!id.equals(id2) & !password.equals(password2)) {

				System.out.println(id2 + password2);
			}
		} while (id.equals(id2) && password.equals(password2));
		System.out.println("�α��� ����!");
		*/

		while (true) {
			System.out.print("���̵� �Է����ּ��� : ");
			id2 = sc.next();
			System.out.print("��й�ȣ�� �Է����ּ��� : ");
			password2 = sc.next();
			
			if(id.equals(id2) && password.equals(password2)) {
				System.out.println("�α��� ����!");
				break;
			}
			else {
				System.out.println("���̵�� ����� �߸��Ǿ����ϴ�.");
			}
		}
	}
}
