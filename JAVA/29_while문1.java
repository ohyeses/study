import java.util.Scanner;

public class Ex01_while��1 {

	public static void main(String[] args) {
		//Ű����κ��� ������ �Է¹޾� 
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		//10�����϶��� ��� �Է�
		while(num<=10) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}
		
		//10�ʰ��� ����Ǿ����ϴ� ���
		System.out.println("����Ǿ����ϴ�.");
	}

}
