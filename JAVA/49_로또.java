import java.util.Arrays;
import java.util.Random;

//5칸짜리 정수형 배열을 만들어주세요.
//▪ 각각 임의의 값으로 초기화 해주세요. (1~10까지)
//▪ 단, 배열에 중복된 값을 제거해주세요.
//▪ 배열에 들어있는 값을 출력해주세요
// 자바페스티벌 나옴

public class Ex12_로또 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] lotto = new int[5];
		int temp;
		
		
		// 입력부
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(5)+1;
			//i가 1일 때는 0인 값과 비교
			//i가 2일 때는 0,1인 값과 비교
			//i가 3일 때는 0,1,2인 값과 비교
			
			for (int j = 0; j<1; j++) {
				if(lotto[j] == lotto[i]) {
					i--; //i값을 감소시키면 중복일때 중복제거 할 수 있다.
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
		

		do {
			System.out.println("====로또 타임====");
			System.out.println("이번주 출력번호");

			
			// 입력부
			for (int i = 0; i < lotto.length; i++) {
				temp = lotto[i];
				if (lotto[i] == temp) {
					System.out.println("중복된 숫자입니다.");
					continue;
				} else {

					lotto[i] = rd.nextInt(9) + 1;
				}
			}
		} while (lotto.length < 6);

		// 출력부 (반복문)
		// 1차원 배열 일때만 Arrays.toString(배열이름) 사용 가능.
		System.out.println(Arrays.toString(lotto));
	}

}
