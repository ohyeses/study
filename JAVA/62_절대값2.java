import java.util.Scanner;

public class Ex07_���밪2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();
		
		System.out.println(getAbsoluteValue(num1,num2));
		System.out.println(getAbsoluteValue(10,1));
		
	}
	public static int getAbsoluteValue(int num1, int num2) {
		int result = 0;
		// �� �� �� ���� ���ؼ� num1-num2 �� ���� ������� �����
		// num1 - num2 ���� ������ �״��
		// result�� ��Ƽ� result�� return
		
		if(num1-num2 < 0) {
			return (num1-num2) * -1;
		}else {
			return num1-num2;
		}
	}
}
