
public class Ex05_�ּҰ� {

	public static void main(String[] args) {
		// int�� �迭 intArray�� 7, 44, 13, 52, 9�� ���
		
		
		//1. ����� ������ ����
		//int[] intArray;
		//intArray = new int[5];
		
		//2. ����� ������ ���ÿ�
		// int[] intArray = new int[5];
		// intArray[0] =7;
		
		//3. �ʱ�ȭ �ϸ鼭 ����
		int intArray[] = {7,44,13,52,9}; 
		
		int [] myArray = intArray;
		
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);
		
		myArray[2] = 100;
		System.out.println(myArray[2]);
		System.out.println(intArray[2]);
	}

}
