
public class Ex03_2�����迭�ǽ�2 {

	public static void main(String[] args) {
		   // 5�� 5���� 2���� array��� �迭
	      int[][] array = new int[5][5];

	      // 1~25���� �ʱ�ȭ

	      // �Էº�
	      int cnt = 1;
	      for (int j = 0; j < array.length; j++) {
	         for (int i = 0; i < array[j].length; i++) {
	            array[j][i] = cnt++;
	         }
	      }

	      for (int j = 0; j < array.length; j++) {
	         for (int i = 0; i < array[j].length; i++) {
	            System.out.print(array[j][i] + "\t");
	         }
	         System.out.println();
	      }


		}
		
	}

