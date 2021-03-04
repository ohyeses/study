import java.util.Arrays;

public class Ex02_String메소드 {

	public static void main(String[] args) {
		String str = "집에 가고 싶어요";
		//System.out.println(str.charAt(8));
		
		//'요'를 출력하고 싶어요
		//index 몇 번일까요? 8
		
		// 스트링 배열로 리턴.
		String[] array = str.split(" "); //""는 전부 쪼갬. " "는 띄어쓰기 기준으로 나눠주세요.
		
		System.out.println(Arrays.toString(array));
		
		for (int i=0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
