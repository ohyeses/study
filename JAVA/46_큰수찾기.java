
public class Ex09_큰수찾기 {

	public static void main(String[] args) {
		int [] array = {33,25, 22, 90, 24, 45};
		
		// 배열의 값 중 가장 큰 값을 찾아 출력하는 프로그램을 만들어주세요
		
		// 출력 결과 -> 가장 큰 값은 : 90
		int max = array[0];
		int temp = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.print("가장 큰 값은 : "+ max);
		
		for(int i=0; i<array.length; i++) {
			temp = array[i];
			if(temp >=max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
