import java.util.Scanner;

public class Ex01_���� {

	public static void main(String[] args) {
		//num1 num2 ����.
		//char �� operator ��� ���� ����
		// - + * / �װ�����.
		// Cal�̶�� ���ļҵ带 ���ؼ� 3�� �Ű������� �Ѱ��ش�.
		// Scanner ��� -> ����, ������ �Է�
		// .charAt(index);
		//  next���� �Լ������� char������ �Է��� �޾��ִ� �Լ��� ã�� ����.
		// next�� ���� ���� String���� charAt�� ���� char���� �Է¹޾Ҵ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������⦡������");
		
		
		System.out.print("�����Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�����Է� : ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է� : ");
		char op = sc.next().charAt(0); //charAt�� ����ؼ� ù��°�͸� �̾ƿ´�.
		
		
		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		switch (op) { 
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = (int)(num1 / num2);
				break;
			default : 
				break;
		}
		return result;
	}

}
