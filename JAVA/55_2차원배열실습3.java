
public class Ex03_2�����迭�ǽ�3 {

	public static void main(String[] args) {
		// 5�� 5���� 2���� array��� �迭
		int[][] array = new int[5][5];

		// ������׷�

		// �Էº�
		int cnt = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j % 2 == 0) {
					System.out.print(array[i][4-j] + "\t"); //array[j][(array[j].length-1)-i]
				} else {
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}

}
