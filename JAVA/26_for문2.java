import java.util.Scanner;

public class Ex03_for��2 {
	public static void main(String[] args) {
		// 1.1~100���� 3�� ��� ���

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 2.1~100���� 3�� ����̸鼭 5�� ��� ���
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		// 3.�Ѱ��� �ڿ����� �Է� �޾� �� ���� ����� ���ʷ� 10�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(x * i + "\t");
		}
		
		System.out.println();
		//4. for���� ����Ͽ� ������2���� ����ϼ���

		for(int i=1; i<10; i++) {
			// System.out.println("2"+"*"+ i+"="+ 2*i );
			// ������
			// \t \n
			System.out.printf("2*%d=2*%d\n",i,2*i);
		}

		
		
	}
}
