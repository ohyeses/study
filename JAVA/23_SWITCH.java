import java.util.Scanner;

public class Ex08_SWITCH {

	public static void main(String[] args) {
		//Ű����κ��� ���ڸ� �Է� �޾�
		//3,4,5��� ���� 6,7,8�̶�� ������
		//9,10,11d�̶�� ������ 12,1,2��� �ܿ��� ����Ͻÿ�
		//��, 1~12���� ���ڸ� �Է���������
		//�߸� �Է��߽��ϴ�
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) { 
		case 1: 
		case 2: System.out.println("�ܿ�"); break;
		case 3: 
		case 4:
		case 5:System.out.println("��"); break;
		case 6:
		case 7:
		case 8:System.out.println("����"); break;
		case 9:
		case 10:
		case 11:System.out.println("����"); break;
		case 12: System.out.println("�ܿ�"); break;
		default : System.out.println("�ϳ��� �� ����"); break;
		}
	}

}
