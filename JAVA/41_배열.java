
public class Ex04_배열 {

	public static void main(String[] args) {
		int [] numbers = new int[10];
		
		// 1번째 칸에 20, 4번째 칸에 30, 7번째 칸에 40, 10번째 칸에 50
		numbers[0] = 20;
		numbers[3] = 30;
		numbers[6] = 40;
		numbers[9] = 50;
		// numbers[10] = 50; //Index 10 out of bounds for length 10
		int a = numbers[3]+numbers[6];
		
		System.out.println(numbers[3] + numbers[6]);
		
		System.out.println(numbers[7]);
		
		System.out.println(numbers); // 레퍼런스 변숟의 주소값
		int[] intArray = {10, 20, 30, 40, 50}; 
		
		// 배열의 3번째 값을 출력해주세요
		System.out.println(intArray[2]);
		
	}

}
