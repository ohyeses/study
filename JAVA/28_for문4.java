import java.util.Scanner;

public class Ex05_for��4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ű����κ��� ���� �Է¹޾� ��� ���ϱ�
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num / 2; i++) { //����ū ����� num��/2
			// num�� 1�� ������ �� �������� 0�̶�� 1�� num�� ���
			// num % ??? ==0 -> ???�� num�� ���
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println(num);

	}
}
