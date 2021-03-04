import java.util.Arrays;

public class Ex02_2차원배열 {

	public static void main(String[] args) {
		String[] drink = {"탄산수", "맥콜", "쿠우"};
		System.out.println(Arrays.toString(drink));
		
		String[] snack = {"브이콘", "꾀돌이", "꼬깔콘"};
		// 2차원 배열의 선언 및 생성
		
		String[][] menu = new String[2][3];
		menu[0] = drink;
		menu[1] = snack;
		
		System.out.println(menu[0]); //동일한 주소를 가지고 있다.
		System.out.println(drink); 
		System.out.println(menu[0][1]);
		System.out.println(drink[1]);
	}

}
