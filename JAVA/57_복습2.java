
public class Ex01_복습2 {
	//다이아몬드
	public static void main(String[] args) {
		// 입력부
		  int[][] array = new int[5][5];
	      
	      int cnt = 1;
	      
	      for(int i = 0; i < array.length; i++) {
	         
	         int startNumber = Math.abs(i-2);
	         int endNumber = Math.abs(i-2) * (-1) + 4;
	         
	         for(int j = startNumber; j <= endNumber; j++) {
	            array[i][j] = cnt++;
	         }
	      }
	      
	      for(int i = 0; i < array.length; i++) {
	         for(int j = 0; j < array[i].length; j++) {
	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
	      }
	      

	}

}
