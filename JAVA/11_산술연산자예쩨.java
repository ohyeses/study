import java.util.Scanner;

public class Ex06_��������ڿ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1-6 ��� ������ ����
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println("�� ���� ���ϱ� : "+ (num1+num2));
		System.out.println("�� ���� ���� : "+ (num1-num2));
		System.out.println("�� ���� ���ϱ� : "+ num1*num2);
		System.out.println("�� ���� ������(��) : "+ num1/num2);
	}

}
