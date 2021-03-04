import java.util.Scanner;

public class Ex06_login {

	public static void main(String[] args) {
		String id = "Hello";
		String password = "1234";
		Scanner sc = new Scanner(System.in);

		String id2;
		String password2;

		// 로그인이 실패했을 경우에 계속입력
		// 로그인이 성공하면 프로그램 종료
		
		/*
		do {
			System.out.print("아이디를 입력해주세요 : ");
			id2 = sc.next();
			System.out.print("비밀번호를 입력해주세요 : ");
			password2 = sc.next();

			if (!id.equals(id2) & !password.equals(password2)) {

				System.out.println(id2 + password2);
			}
		} while (id.equals(id2) && password.equals(password2));
		System.out.println("로그인 성공!");
		*/

		while (true) {
			System.out.print("아이디를 입력해주세요 : ");
			id2 = sc.next();
			System.out.print("비밀번호를 입력해주세요 : ");
			password2 = sc.next();
			
			if(id.equals(id2) && password.equals(password2)) {
				System.out.println("로그인 성공!");
				break;
			}
			else {
				System.out.println("아이디와 비번이 잘못되었습니다.");
			}
		}
	}
}
