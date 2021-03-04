
public class Ex01_복습 {

	public static void main(String[] args) {
		// 입력부
		int array[][] = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// array[i][j] = ????
				// cnt를 쓰지 않고 i,j를 이용해서 입력부를 만들기
				//array[i][j] = (array.length)*i +j+i;
				array[i][j] = (i*5)+(j+1);
			}
		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
	}

}
