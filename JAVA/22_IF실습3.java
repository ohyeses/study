import java.util.Scanner;

public class Ex07_IF�ǽ�3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����Ʈ���� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ͺ��̽� ���� : ");
		int num3 = sc.nextInt();
		System.out.print("���α׷��� ��� Ȱ�� : ");
		int num4 = sc.nextInt();
		System.out.print("�����ý��� ���� ���� : ");
		int num5 = sc.nextInt();

		int Scoresum = num1 + num2 + num3 + num4 + num5;

		if (num1 < 8 || num2 < 8 || num3 < 8 || num4 < 8 || num5 < 8) {
			System.out.println("���հ��Դϴ�.");
		} else {
			// ���� �ڵ尡 �Դٴ°�
			// �� ������ 8�� �̻� �¾Ҵٴ� ��

			if (Scoresum >= 60) {
				System.out.println("�հ��Դϴ�");
			}
			else {
				System.out.println("���հ��Դϴ�");
			}

		}
	}
}
