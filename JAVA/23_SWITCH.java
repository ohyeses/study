import java.util.Scanner;

public class Ex08_SWITCH {

	public static void main(String[] args) {
		//키보드로부터 숫자를 입력 받아
		//3,4,5라면 봄을 6,7,8이라면 여름을
		//9,10,11d이라면 가을을 12,1,2라면 겨울을 출력하시오
		//단, 1~12외의 숫자를 입력했을때는
		//잘못 입력했습니다
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) { 
		case 1: 
		case 2: System.out.println("겨울"); break;
		case 3: 
		case 4:
		case 5:System.out.println("봄"); break;
		case 6:
		case 7:
		case 8:System.out.println("여름"); break;
		case 9:
		case 10:
		case 11:System.out.println("가을"); break;
		case 12: System.out.println("겨울"); break;
		default : System.out.println("하나도 안 맞음"); break;
		}
	}

}
