
public class Ex08_�迭�ǽ�2 {

	public static void main(String[] args) {
		// int�� �迭�� ����
		// 3,24,77,21,12�� �ʱ�ȭ �ϰ�

		// 2. �迭�� �� �߿���
		// Ȧ���� ���� ������ּ���

		int array[] = { 3, 24, 77, 21, 12 };
		int count = 0;
		System.out.print("array�� ����ִ� Ȧ���� ");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i]+ " ");
				count++;
			} else {
				continue;
			}

		}
		System.out.print("�̸�, " + "�� "+ count + "�� �Դϴ�.");
	}

}
