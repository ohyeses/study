package JDBC;

import java.util.Scanner;

public class ex02회원관리프로그램 {
	// MVC 패턴 배우기
	// └유지보수를 편하게 하기 위한 개발자들 끼리의 일종의 약속임
	// 유지보수를 할 때 뭔가의 패턴을 정해 높으면 유지보수를 하기 용이하기 때문에 쓴다.
	// MVC 는 Model View Controller 의 약자.
	// MVC 패턴 중 M -> Model
	// 어플리케이션이 “무엇”을 할 것인지를 정의 합니다. 처리되는 알고리즘, DB와 상호작용 (CRUD Create Read Update Delete), 초기화값, 변수의 데이터 등을 뜻합니다. 
	// MVC 패턴 중 View
	// 화면에 “무엇” 인가를 “보여주기 위한 역할”을 합니다. 다시 말해 데이터 및 객체의 입력, 그리고 보여주는 출력을 담당합니다. 데이타를 기반으로 사용자들이 볼 수 있는 화면입니다.  
	// MVC 패턴 중 Controller
	// 모델이 “어떻게” 처리할 지를 제어하는 역할을 합니다. 즉, 사용자가 데이터를 클릭하고, 수정하는 것에 대한 "이벤트"들을 처리하는 부분을 뜻합니다.  

	
	
	// MVC 중 View 만들기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO(); // 객체를 전역으로 뺀다.
		
		System.out.println("=======회원관리 프로그램=======");
		// 사용자가 5라는 숫자를 입력하기 전까지 반복하는 프로그램 -> 언제 종료될지 모르니 WHILE (TRUE)
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]모든회원정보보기 [4]회원탈퇴 [5]종료");
			System.out.print("번호 입력 >> ");
			int input = sc.nextInt();
			
			if (input == 1) {
				// 회원가입 때는 아이디, 패스워드 이름, 나이를 입력 받는다.
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				
				System.out.print("패스워드 입력 >>");
				String pw = sc.next();
				
				System.out.print("이름 입력 >> ");
				String name = sc.next();
				
				System.out.print("나이 입력 >>");
				int age = sc.nextInt();
				
				// 입력을 다 받고나서 DAO에서 만든 insert()메서드를 불러서 사용한다.
				// DAO에서 만든 메소드를 사용하려면 객체를 만들어야 한다 -> 맨 위에 DAO 객체 생성
				// 회원가입, 로그인, 회원탈퇴 등 모든 기능을 메서드로 다 뺄거기 때문.
				// 사용자한테 입력받은 id·pw를 dao의 insert() 메소드의 매개변수로 보내준다.
				// insert() 메소드의 리턴타입이 int니 int로 닫아준다.
				int result = dao.insert(id, pw, name, age);
				
				
				// result 값이 0보다 크면 회원가입 성공
				if (result > 0) {
					System.out.println("회원가입 성공!");
				} else { // 그렇지 않다면, result가 0이라면 회원가입 실패
					System.out.println("회원가입 실패!");
				}
				
				
				
			}
			else if (input == 2) {
				System.out.println("===로그인===");
				System.out.print("아이디를 입력 >>");
				String id = sc.next();
				
				System.out.print("패스워드 입력 >>");
				String pw = sc.next();
				
				// 입력을 다 받고 나서
				// dao 가 가지고 있는 기능 중 login 하는 기능을 쓰겠다.
				// (id,pw,name,age)의 회원의 모든 데이터가 들어있는 MemberVO resultVO 로 받는다.
				MemberVO resultVO = dao.login(id, pw); // 매개변수로 id, pw를 받는다.
				
				
				// 아이디 : id
				// 패스워드 : pw
				// 이름 : name
				// 나이 : age		<-- 이렇게 출력하려면 어떻게?
				
				// 아이디 패스워드 이름 나이 다 resultVO가 가지고 있으니
				// 아이디를 꺼내오려면 전의 getter/setter 만들어 주었던 것을 이용해 접근한다.
				
				// 로그인 성공을 했을 떄만 출력 -> resultVO가 null이 아닐때만 출력
				// resultVO가 null 일때 출력하면 에러뜬다.
				if (resultVO != null) {
					System.out.println("아이디 : " + resultVO.getId());
					System.out.println("비밀번호 : " + resultVO.getPw());
					System.out.println("아이디 : " + resultVO.getId());
					System.out.println("아이디 : " + resultVO.getId());
				}
				
				
			}
			else if (input == 3) {
				System.out.println("===회원정보보기===");

				
				
			}
			else if (input == 4) {
				System.out.println("===회원탈퇴===");
				
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				
				System.out.print("패스워드 입력 >>");
				String pw = sc.next();
				
				System.out.print("패스워드 확인 입력 >>");
				String checkPw = sc.next();
			}
			else if (input == 5) {
				// 5를 입력하면 종료
				System.out.println("종료하겠습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}

			
		}
	}



}
