import java.util.Scanner;

public class Ex01_���� {
	public static void main(String[] args) {
		//���� ��¥�� �Է¹޾Ƽ�
		// ��¥�� ¦����� ���
		// ��¥�� Ȧ����� �߽��� ���
		System.out.print("������ ��¥�� �Է����ּ��� >>");
		Scanner sc = new Scanner(System.in);
		
		int date = sc.nextInt();
		System.out.println(date%2==0 ? "���":"�߽�");
	}
}
