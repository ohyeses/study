
public class Ex06_�ּҰ�2 {

	public static void main(String[] args) {
		// ���ڿ��� ��� �迭
		String [] drink = {"���� ��", "���ڿ�", "��ħ�޻�", "�Ƿ�Ƽ"};
		String [] snack = {"�ѼŻѼŵ����", "�ǻ�", "�ĸ� ý��"};
		
		System.out.println(drink[1]);
		System.out.println(snack[1]);
		
		System.out.println("drink�� �ּ� : " + drink);
		System.out.println("snack�� �ּ� : "+ snack);
		
		
		snack = drink;
		snack[1] = "�Ǻ���";
		System.out.println("drink�� �ּ� : " + drink);
		System.out.println("snack�� �ּ� : "+ snack);
		
		System.out.println(snack[1]);
		System.out.println(drink[1]); //��?

	}

}
