import java.util.Arrays;

public class Ex02_2�����迭 {

	public static void main(String[] args) {
		String[] drink = {"ź���", "����", "���"};
		System.out.println(Arrays.toString(drink));
		
		String[] snack = {"������", "�ҵ���", "������"};
		// 2���� �迭�� ���� �� ����
		
		String[][] menu = new String[2][3];
		menu[0] = drink;
		menu[1] = snack;
		
		System.out.println(menu[0]); //������ �ּҸ� ������ �ִ�.
		System.out.println(drink); 
		System.out.println(menu[0][1]);
		System.out.println(drink[1]);
	}

}
