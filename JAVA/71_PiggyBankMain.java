
public class PiggyBankMain {

	public static void main(String[] args) {
		
		// �⺻ ������ Ÿ��
		// ���۷��� ������ Ÿ��
		// 1. �迭�� ���� ���۷��� <-------���� �ճ�??
		// 2. Ŭ������ ���� ���۷���
		// 3. �������̽��� ���� ���۷���
		
		// Ŭ������ ������ = new Ŭ������();
		
		PiggyBank pb1 = new PiggyBank();
		//pb1.money = 2000;
		pb1.deposit(20000);
		
		pb1.showMoney();
		
		//withdraw()�� �̿��ؼ�
		//10000���� �����ϰ�
		//�ܾ��� ������ּ���.
		
		pb1.withdraw(10000);
		pb1.showMoney();
	}

}
