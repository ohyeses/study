
public class Ex01_���� {

	public static void main(String[] args) {
		// �Էº�
		int array[][] = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// array[i][j] = ????
				// cnt�� ���� �ʰ� i,j�� �̿��ؼ� �Էºθ� �����
				//array[i][j] = (array.length)*i +j+i;
				array[i][j] = (i*5)+(j+1);
			}
		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
	}

}
