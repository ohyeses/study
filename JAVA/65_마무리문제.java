
public class Ex01_마무리문제 {

	public static void main(String[] args) {
		int[] array = {25, 17, 32, 85, 30};
		float result = average(array);
		System.out.println("평균값은 : " + result + "입니다.");
		//리턴값은 이 배열의 모든 값들을 평균을 리턴함
	}

	//array에 들어있는 값들의 평균을 구해서 result에 저장(대입)
	public static float average(int[] array) {
		float result = 0;
		
		for(int i = 0; i<array.length; i++) {
			result += array[i];
		}
		
		
		return result/array.length;
	}

}
