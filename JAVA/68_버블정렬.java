import java.util.Arrays;

public class Ex03_버블정렬 {

	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 5;
//		int temp = 10;
//		
//		temp = num1;
//		num1 = num2;
//		num2= temp;
//
//		System.out.println("num1의 값: " + num1);
//		System.out.println("num2의 값: " + num2);
		// index 번호 : 0 1 2 3 4
		int[] array = { 45, 7, 12, 82, 25 };
		
		for(int j=1; j<array.length; j++) {
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

//		if(array[0] > array[1]) {
//			int temp = array[0];
//			array[0] = array[1];
//			array[1] = temp;
//		}
//		
//		if(array[1] > array[2]) { 
//			//array[1] 값과 array[2] 값을 치환
//			int temp = array[1];
//			array[1] = array[2];
//			array[2] = temp;
//		}
//		
//		if(array[2] > array[3]) { 
//			//array[1] 값과 array[2] 값을 치환
//			int temp = array[2];
//			array[2] = array[3];
//			array[3] = temp;
//		}
//		
//		if(array[3] > array[4]) { 
//			//array[1] 값과 array[2] 값을 치환
//			int temp = array[3];
//			array[3] = array[4];
//			array[4] = temp;
//		}
//		// 반복문으로 수정
//		for(int i=0; i<array.length -1; i++) {
//			if(array[i] > array[1]) {
//				int temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(array));
//		

		// Bubble Sort에서 Step 2.
//		if (array[0] > array[1]) {
//			int temp;
//			temp = array[0];
//			array[0] = array[1];
//			array[1] = array[0];
//		} ··· 계속

		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] > array[1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		// Bubble Sort에서 Step 3.
		for (int i = 0; i < array.length - 3; i++) {
			if (array[i] > array[1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}

		}

	}
}
