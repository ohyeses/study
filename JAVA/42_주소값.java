
public class Ex05_주소값 {

	public static void main(String[] args) {
		// int형 배열 intArray에 7, 44, 13, 52, 9값 담기
		
		
		//1. 선언과 생성을 따로
		//int[] intArray;
		//intArray = new int[5];
		
		//2. 선언과 생성을 동시에
		// int[] intArray = new int[5];
		// intArray[0] =7;
		
		//3. 초기화 하면서 생성
		int intArray[] = {7,44,13,52,9}; 
		
		int [] myArray = intArray;
		
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);
		
		myArray[2] = 100;
		System.out.println(myArray[2]);
		System.out.println(intArray[2]);
	}

}
