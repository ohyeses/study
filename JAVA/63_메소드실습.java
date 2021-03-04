import java.util.Scanner;

public class Ex08_메소드실습 {

	public static void main(String[] args) {
		// num1과 num2를 아무 값으로 지정
		int num1 = 10;
		int num2 = 2;

		// isDivisor()에 매개변수 넣고 true or false 출력
		boolean divisor = isDivisor(num1, num2);
//		System.out.println(isDivisor(9, 3));
//		System.out.println(isDivisor(3, 9));
//		System.out.println(isDivisor(8, 7));
//		System.out.println(isDivisor(10, 5));

//		getDivisor(10);
//		getDivisor(16);
//		getDivisor(24);

		int num = 10;
		int result = getSumOfDivisors(num);

//		System.out.println(num + "의 약수의 합 : " + result);
//		getDivisor(num);

		int number = 6;

		boolean check = isPerfectNumber(number); // 완전수라면 true, 완전수가 아니라면 false 리턴
		// System.out.print(number + "는 완전수인가? " + check);
		
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}
	
	
	//만약 startValue가 2고, endValue가 1000이라면
	//2~1000까지 수 중에 완전수라면 result에 누적해서 추가
	//2~1000까지의 완전수 : 6 28 496
	public static void getPerfectNumber(int startValue, int endValue) {
		String result = String.format("%d~%d까지의 완전수 : ", startValue, endValue);
		
		for(int i=startValue; i<=endValue; i++) { //약수들이 다 짝수니까 i++ 를 i+=2 로 하면 연산속도 2배 빨라짐.
			if(isPerfectNumber(i)) {
				result += i + " ";
			}
		}
		
		System.out.println(result);
	}




	//만약, number가 완전수라면 result는 true로 바꿔주세요
	//완전수란, 자기 자신을 제외한 약수의 합이 다시 자기 자신이 되는 수
	//완전수가 아니라면 false 그대로
	//1부터 ~1000까지 완전 수 : 6, 28, 496
	public static boolean isPerfectNumber(int number) { {
			return ((getSumOfDivisors(number)-number)==number);
				//getsumOfDivisors(number)/2 ==number
				//getsumOfDivisors(number) == number *2
				//겟섬함수의 값 == 숫자의 두배 값

		}
	}

	public static int getSumOfDivisors(int num) {
		int result = 0;

		// result에 num의 약수의 총합이 담기도록 해주세요
		// for문
		for (int i = 1; i <= num / 2; i++) {
			if (isDivisor(num, i)) {
				result += i;
			}

		}

		// while문
//		int a=1;
//		while(a<=num/2) {
//			if(num%a ==0) {
//				result += a;
//			}
//			a++;
//		}

		return result+num;
		// return result+num;
	}

	public static void getDivisor(int num) {
		// 변수가 2개 3 개 4개 일 때 좋은 식 , %d %s
		String result = String.format("%d의 약수 : ", num);
		// result 문장을 만들어
		// for문
//		for (int i = 1; i <= num / 2; i++) {
//			if (num % i == 0) {
//				result += i + " ";
//			}
//
//		}

		// 수정
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		result += num; // 자기 자신도 약수이니까 포함해준다.

		// while문
//		int i = 1;
//		while (i <= num) {
//			if (num % i == 0) {
//				result += (i + " ");
//				
//			}
//			i++;
//		}

		System.out.println(result);

	}

	public static boolean isDivisor(int num1, int num2) {
		// num2가 num1의 약수라면 result를 true로.
		// 약수가 아니라면 result를 false로 반환
		return num1 % num2 == 0;

	}

}
