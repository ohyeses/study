package JDBC;

import java.util.ArrayList;
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
				// insert() 메소드의 리턴타입이 int니 int로 받아준다.
				
				
//				MemberVO vo = new MemberVO(id, pw, name, age); // 입력받은 id pw name age를 생성자로 넣어주겠다
				
				// insert 메소드 매개변수에 Membervo를 넣어준다.
				// 사용자에게 데이터를 입력받은 vo가 다른곳에서 쓰이지 않기 때문에
				// 중복으로 쓰이지 않는 애들은 변수 명을 구현 안해주는게 낫다. -> 생성과 동시에 매개변수로 넣어줄 수 있다.
				int result = dao.insert(new MemberVO(id, pw, name, age)); 
				
				
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
				
				
				// 생성자를 오버로딩 하여 매개변수 2개를 받도록 한다.
				MemberVO vo = new MemberVO(id,pw);
				MemberVO resultVO = dao.login(vo); // login() 매개변수를 vo로 바꾼다.
				
				
				// 아이디 : id
				// 패스워드 : pw
				// 이름 : name
				// 나이 : age		<-- 이렇게 출력하려면 어떻게?
				
				// 아이디 패스워드 이름 나이 다 resultVO가 가지고 있으니
				// 아이디를 꺼내오려면 전의 getter/setter 만들어 주었던 것을 이용해 접근한다.
				
				// 로그인 성공을 했을 만 출력 -> resultVO가 null이 아닐때만 출력
				// resultVO가 null 일때 출력하면 에러뜬다.
				if (resultVO != null) {
					System.out.println("아이디 : " + resultVO.getId());
					System.out.println("비밀번호 : " + resultVO.getPw());
					System.out.println("아이디 : " + resultVO.getId());
					System.out.println("아이디 : " + resultVO.getId());
				}
				
				
			}
			else if (input == 3) {
				// 모든 회원 정보를 보기!!
				// select * from bigdatamember;
				
				// 아이디 비밀번호 이름 나이
				// 123	123	  123 123
				// 40   40    40  40
				System.out.println("===회원정보보기===");
				
				// id pw name age를 하나로 묶을 수 있는 MemberVO
				// MemberVo를 하나로 묶을 수 있는 방법은 객체배열을 만들 수 있겠다.
				// 객체 배열은 고정적인 배열을 가지고 있기 때문에 ArrayList라는 가변 객체를 이용해 만들어보자.
				// dao의 기능중 allSelect() 메소드를 사용한다.
				ArrayList<MemberVO> list = dao.allSelect();
				
				// ArrayList 요소 출력
				// ArrayList의 개수 접근 - > size()
				// list.get(i) == MemberVO
				// list.get(i).getId() -> i번째 객체에서 id를 가져오겠다.
				for(int i = 0; i< list.size(); i++) {
					System.out.println(list.get(i).getId() + "\t"
				+ list.get(i).getPw() + "\t"  + list.get(i).getName()
				+ "\t" +  list.get(i).getAge());
					
					
				}
				
			}
			else if (input == 4) {
				// 아이디, 패스워드 패스워드 확인 입력을 받는다.
				System.out.println("===회원탈퇴===");
				
				System.out.print("아이디 입력 >>");
				String id = sc.next();
				
				System.out.print("패스워드 입력 >>");
				String pw = sc.next();
				
				System.out.print("패스워드 확인 입력 >>");
				String checkPw = sc.next();
				
				// id와 pw가 두 개 다 행에 있는 데이터라면 그 행을 삭제해주는 쿼리
				if (pw.equals(checkPw)) { // 만약 패스워드와 패스워드확인이 같을때만 실행
					// dao의 delete() 메소드를 사용한다.
					// 매개변수로 MemberVo의 id pw 두개만 건네준다.
					// row -> 영향을 받은 행의 개수
					// delete를 하고나서 영향을 받은 행의 개수를 가져온다.
					int row = dao.delete(new MemberVO(id,pw)); 
					
					if (row > 0) {
						System.out.println("회원탈퇴 성공!");
					} else {
						System.out.println("회원탈퇴 실패!");
					}
				
				}
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