
public class Ex04_�迭 {

	public static void main(String[] args) {
		int [] numbers = new int[10];
		
		// 1��° ĭ�� 20, 4��° ĭ�� 30, 7��° ĭ�� 40, 10��° ĭ�� 50
		numbers[0] = 20;
		numbers[3] = 30;
		numbers[6] = 40;
		numbers[9] = 50;
		// numbers[10] = 50; //Index 10 out of bounds for length 10
		int a = numbers[3]+numbers[6];
		
		System.out.println(numbers[3] + numbers[6]);
		
		System.out.println(numbers[7]);
		
		System.out.println(numbers); // ���۷��� ������ �ּҰ�
		int[] intArray = {10, 20, 30, 40, 50}; 
		
		// �迭�� 3��° ���� ������ּ���
		System.out.println(intArray[2]);
		
	}

}
