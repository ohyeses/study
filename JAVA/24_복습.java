import java.util.Scanner;

public class Ex01_복습 {

	public static void main(String[] args) {
		// 자판기 프로그램
		System.out.print("금액을 입력하세요 >> ");
		System.out.println(" ");
		
		// 금액을 입력 받아서 int형 변수 money에 저장
		System.out.println("[1]솔의눈(700원) [2]ZICO(1000원) [3]데자와(500원)");
		System.out.print("메뉴를 고르세요 >> ");
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc .nextInt();
	
		//예) 금액 2500을 입력하고 메뉴를 1번(솔의 눈)
		// 출력-> 잔돈 : 1800원 <- 이렇게 출력
		//메뉴를 입력 받아 int 형 변수 menu에 저장
		// 잔돈을 출력했을 때 주화가 몇개인지 출력 1000원, 500원,100원
		// 7800원 천원 : 7개, 오백원 : 1개, 백원 : 3개
		int menu = sc.nextInt();
		int change;
		int won1000;
		int won500;
		int won100;
		
		switch(menu) {
		case 1:
			int sol = 700;
			if(money<sol) {
				System.out.println("돈이 부족해요 ㅠㅠ");
				System.out.println("잔돈 :"+ (int)money);
			} else {
				// 잔돈을 출력했을 때 주화가 몇개인지 출력 1000원, 500원,100원
				// 7800원 천원 : 7개, 오백원 : 1개, 백원 : 3개
				change = money - sol;
				System.out.println("[솔의 눈]" + "잔돈 : "+ (int)(change));
				won1000 = change/1000;
				won500 = (int) ((change - (won1000*1000)) / 500); //(change%1000)/500
				won100 = (change%500)/100;
				System.out.println("천원 : " + won1000 + "개");
				System.out.println("오백원 : " + won500 + "개");
				System.out.println("백원 : " + won100 + "개");
				
			}
			break;
			
		case 2:
			int zico = 1000;
			if (money<zico) {
				System.out.println("돈이 부족해요 ㅠㅠ");
				System.out.println("잔돈 :"+ (int)money);
			}else {
				System.out.println("[지코]" + "잔돈 : "+ (int)(money-zico));
			}
			break;
		case 3:
			int dezawa = 500;
			if (money<dezawa) {
				System.out.println("돈이 부족해요 ㅠㅠ");
				System.out.println("잔돈 :"+ (int)money);
			}else {
				System.out.println("[데자와]" + "잔돈 : "+ (int)(money-dezawa));
			}
			break;
		default:
			System.out.println("잘못선택하셨습니다.");
			break;
		}

	}

}



/* if 문으로 작성 
 * if(menu==1) {
 * 		System.out.println("잔돈 : " + (money - 700) + "원");
 * }else if(menu ==2) {
 * 		System.out.prinln("잔돈 : " + (money - 1000) + "원");
 * }else if(menu ==3) {
 * 		System.out.prinln("잔돈 : " + (money - 500) + "원");
 * }else {
 * 		System.out.prinln("잘못 입력하셨습니다.");
 * }
 * */
