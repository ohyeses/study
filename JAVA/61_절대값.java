import java.util.Scanner;

public class Ex06_���밪 {

	public static void main(String[] args) {
		// Ű����κ��� ���� ���� �ϳ� �Է�
		// num �̶�� ������ ����
		// -5��� ���� ������ 5��� ������ ���
		// getAbsoluteValue(num)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt(); 
		System.out.println(getAbsoluteValue(num));
		System.out.println(getAbsoluteValue(6));
		System.out.println(Math.abs(-7));

	}									//Alt + shift + r
	public static int getAbsoluteValue(int num) {	
		if (num < 0) {
			return num  = num * -1;
		}else {
			return num;
		}
	}
	
	
}
