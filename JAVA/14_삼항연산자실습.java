import java.util.Scanner;

public class Ex08_���׿����ڽǽ� {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// Ȧ������ ¦������ �Ǻ�
		// ���ǽ� ? ���๮1 : ���๮2
		System.out.println(num%2==0 ? num + "��(��) ¦���Դϴ�." :
			num + "��(��) Ȧ���Դϴ�.");
		
		
		
	}

}
