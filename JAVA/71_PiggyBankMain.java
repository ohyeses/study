
public class PiggyBankMain {

	public static void main(String[] args) {
		
		// 기본 데이터 타입
		// 레퍼런스 데이터 타입
		// 1. 배열에 대한 레퍼런스 <-------졸공 잇낭??
		// 2. 클래스에 대한 레퍼런스
		// 3. 인터페이스에 대한 레퍼런스
		
		// 클래스명 변수명 = new 클래스명();
		
		PiggyBank pb1 = new PiggyBank();
		//pb1.money = 2000;
		pb1.deposit(20000);
		
		pb1.showMoney();
		
		//withdraw()을 이용해서
		//10000원을 인출하고
		//잔액을 출력해주세요.
		
		pb1.withdraw(10000);
		pb1.showMoney();
	}

}
