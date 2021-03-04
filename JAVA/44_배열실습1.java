
public class Ex07_배열실습1 {

	public static void main(String[] args) {
		//1. int형 배열에 1~10까지 값을 담아주세요.
		//2. 값을 전부 출력해주세요.
		
		// 배열의 크기 바꿀 수 없음.
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//3.위의 코드를 수정해
		//1~100까지 값을 담고 출력
	
		int[] arr1 = new int[101];
		for (int i=0; i<100; i++) {
			arr1[i]=i+1;
			System.out.print(arr1[i] + " ");
		}
	}

}
