
public class Ex07_�迭�ǽ�1 {

	public static void main(String[] args) {
		//1. int�� �迭�� 1~10���� ���� ����ּ���.
		//2. ���� ���� ������ּ���.
		
		// �迭�� ũ�� �ٲ� �� ����.
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//3.���� �ڵ带 ������
		//1~100���� ���� ��� ���
	
		int[] arr1 = new int[101];
		for (int i=0; i<100; i++) {
			arr1[i]=i+1;
			System.out.print(arr1[i] + " ");
		}
	}

}
