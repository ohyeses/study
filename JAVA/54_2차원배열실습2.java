
public class Ex03_2차원배열실습2 {

	public static void main(String[] args) {
		   // 5행 5열의 2차원 array라는 배열
	      int[][] array = new int[5][5];

	      // 1~25까지 초기화

	      // 입력부
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

