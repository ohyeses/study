import java.util.Scanner;

public class Ex01_���� {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		System.out.println(" ");
		
		// �ݾ��� �Է� �޾Ƽ� int�� ���� money�� ����
		System.out.println("[1]���Ǵ�(700��) [2]ZICO(1000��) [3]���ڿ�(500��)");
		System.out.print("�޴��� ������ >> ");
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc .nextInt();
	
		//��) �ݾ� 2500�� �Է��ϰ� �޴��� 1��(���� ��)
		// ���-> �ܵ� : 1800�� <- �̷��� ���
		//�޴��� �Է� �޾� int �� ���� menu�� ����
		// �ܵ��� ������� �� ��ȭ�� ����� ��� 1000��, 500��,100��
		// 7800�� õ�� : 7��, ����� : 1��, ��� : 3��
		int menu = sc.nextInt();
		int change;
		int won1000;
		int won500;
		int won100;
		
		switch(menu) {
		case 1:
			int sol = 700;
			if(money<sol) {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� :"+ (int)money);
			} else {
				// �ܵ��� ������� �� ��ȭ�� ����� ��� 1000��, 500��,100��
				// 7800�� õ�� : 7��, ����� : 1��, ��� : 3��
				change = money - sol;
				System.out.println("[���� ��]" + "�ܵ� : "+ (int)(change));
				won1000 = change/1000;
				won500 = (int) ((change - (won1000*1000)) / 500); //(change%1000)/500
				won100 = (change%500)/100;
				System.out.println("õ�� : " + won1000 + "��");
				System.out.println("����� : " + won500 + "��");
				System.out.println("��� : " + won100 + "��");
				
			}
			break;
			
		case 2:
			int zico = 1000;
			if (money<zico) {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� :"+ (int)money);
			}else {
				System.out.println("[����]" + "�ܵ� : "+ (int)(money-zico));
			}
			break;
		case 3:
			int dezawa = 500;
			if (money<dezawa) {
				System.out.println("���� �����ؿ� �Ф�");
				System.out.println("�ܵ� :"+ (int)money);
			}else {
				System.out.println("[���ڿ�]" + "�ܵ� : "+ (int)(money-dezawa));
			}
			break;
		default:
			System.out.println("�߸������ϼ̽��ϴ�.");
			break;
		}

	}

}



/* if ������ �ۼ� 
 * if(menu==1) {
 * 		System.out.println("�ܵ� : " + (money - 700) + "��");
 * }else if(menu ==2) {
 * 		System.out.prinln("�ܵ� : " + (money - 1000) + "��");
 * }else if(menu ==3) {
 * 		System.out.prinln("�ܵ� : " + (money - 500) + "��");
 * }else {
 * 		System.out.prinln("�߸� �Է��ϼ̽��ϴ�.");
 * }
 * */
