
public class Ex03_2�����迭�ǽ� {

	public static void main(String[] args) {
		   // 5�� 5���� 2���� array��� �迭
	      int[][] array = new int[5][5];

	      // 1~25���� �ʱ�ȭ

	      // ���η�.
	      int cnt = 1;
	      for (int j = 0; j < array.length; j++) {
	         for (int i = 0; i < array[j].length; i++) {
	            array[j][i] = cnt++;
	         }
	      }

	      for (int j = 0; j < array.length; j++) {
	         for (int i = 0; i < array[j].length; i++) {
	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
	      }


		
	}

}
