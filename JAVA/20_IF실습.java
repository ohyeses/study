import java.util.Scanner;

public class Ex05_IF실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		int price = 10000;
		float discount = 0.1f;
		if (num <= 11) {
			System.out.println("가격은 " + num * price + "원 입니다.");
		} else {
			System.out.println("가격은 " + (int) (num * price * (1-discount)) + "원 입니다.");
			//System.out.println(10000*num-(10000*num*0.1));
		}
	}

}
