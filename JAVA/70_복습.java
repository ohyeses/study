
public class Ex01_���� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		int num3 = 1;
		 
		//sum �̶�� �޼ҵ� ����
		//������ ����
		
		int result = sum(num1, num2);
		System.out.println("�� �� �� ���� : " + result + "�Դϴ�.");
		
		int result2 = sum(num1, num2, num3);
		System.out.println("�� ���� ���� : " + result2 + "�Դϴ�.");
	}

	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static int sum(int num1, int num2) {

		return num1 + num2;
	}

}
