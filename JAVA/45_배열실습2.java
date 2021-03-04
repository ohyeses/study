
public class Ex08_배열실습2 {

	public static void main(String[] args) {
		// int형 배열의 값을
		// 3,24,77,21,12로 초기화 하고

		// 2. 배열의 값 중에서
		// 홀수인 값만 출력해주세요

		int array[] = { 3, 24, 77, 21, 12 };
		int count = 0;
		System.out.print("array에 들어있는 홀수는 ");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i]+ " ");
				count++;
			} else {
				continue;
			}

		}
		System.out.print("이며, " + "총 "+ count + "개 입니다.");
	}

}
