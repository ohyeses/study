import java.util.ArrayList;

public class Main {

	// 클래스 : 사용자가 만들고자 하는 개체의 정보를 정리하는 설계도
	//		필드(속성)와 메소드를 가지고 있다.
	//		클래스는 실제로 동작하지 않는다! -> 설계만 진행 -> main() 안들어감.
	// 객체 : 설계도를 통해서 실제로 만들어지는 실체 (인스턴스)
	//		 실제로 동작하여 실체를 만들어 내는 곳
	
	// 포켓몬 도감 만들기!
	// 타입(String), 이름(String), 레벨(int), 전투력(int)
	// 위의 4가지의 필드를 갖는 Pokemon 클래스 만들기!
	public static void main(String[] args) {
		//pokemon 만들기
		// 객체를 생성하는 키워드 ? -> new 키워드
		
		// 객체를 생성하는 과정
		// 1. 객체를 선언하기 -> 클래스명 + 객체(변수)명;
		// 2. 객체명 = new 클래스명();
		
//		Pokemon p1;
//		p1 = new Pokemon();
		
		// 1~2 단계를 동시에 진행하는 방법
		// 객체를 생성할 때 보호되어 있는 필드에 초기값을 지정할 수 있또록
		// 생성자를 사용한다!
		Pokemon p1 = new Pokemon("피카츄", "전기", 100, 100000);
		
		// 자바의 자료형 -> 기본, 레퍼런스(참조)
		// 참조형 자료형 : 사용자(클래스) 지정에 따른 데이터 타입
		// -> null 값이나 주소값 갖고 있다.
		
		
		// Pokemon 클래스에 접근하는 방법
		// 1. 외부에서 접근할 수 있는 녀석을 만들어 준다. -> getter()
		// 2. pokemon 클래스에 있는 getter() 가 내부에 있는 필드에 접근하도록 도와준다.
//		p1.name = "피카츄";
//		p1.type = "전기";
//		p1.lv = 100;
//		p1.power = 100000;
//		
		
		
		// getter와 setter 메소드 만들기 -> pokemon 클래스에 수정하기@!
		// getter() -> name, type, lv, power
		// setter() - > lv, power
		
		
		System.out.println("p1의 이름 : " + p1.getName());
		System.out.println("p1의 타입 : " + p1.getType());
		System.out.println("p1의 레벨 : " + p1.getLv());
		System.out.println("p1의 이름 : " + p1.getPower());
		
		// 내가 원하는 새로운 포켓몬 생성하기
		
		Pokemon p2 = new Pokemon("파이리", "불", 50, 350);
		
//		p2.name = "파치리스";
//		p2.type = "전기";
//		p2.lv = 1;
//		p2.power = 100;
		//p1.setter(100);
		
		System.out.println("p2의 이름 : " + p2.getName());
		System.out.println("p2의 타입 : " + p2.getType());
		System.out.println("p2의 레벨 : " + p2.getLv());
		System.out.println("p2의 파워 : " + p2.getPower());
		
		// Collection의 선언 구조
		// ArrayList(가변 리스트)
		// ArrayList<객체 타입> list = new ArrayList<객체 타입>();
		
		System.out.println();
		System.out.println("list 저장 값 확인하기");
		
		// 레퍼런스형 데이터 -> 주소값을 갖는다 -> 객체 타입이다@!
		// 선언시 임포트
		// <> -> 제네릭 기법(타입)
		ArrayList<Pokemon> list = new ArrayList<>();

//		-add() : 데이터를 추가하는 기능
//		-set(): 데이터를 수정하는 기능
//		-get(): 리스트에 있는 데이터를 가져오는 기능
//		-remove():데이터를 삭제하는 기능
		
		// List에 데이터 추가하기 -> add()
		list.add(p1);
		list.add(p2);
		
		// List에 저장된 데이터 확인하기 -> get()
		// 일반 배열을 사용할때 배열의 길이를 알기 위해 쓴 녀석 -> length
		// ArrayList(가변 리스트)의 길이를 알기 위해서 쓰는 녀석 -> .size()
		for (int i=0; i< list.size(); i++) {
		System.out.println(list.get(i).getName());
		System.out.println(list.get(i).getType());
		System.out.println(list.get(i).getLv());
		System.out.println(list.get(i).getPower());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
		}
		
		// Pokemon 타입의 p3 생성하기!
		// "꼬북기", "물", 50, 30
		Pokemon p3 = new Pokemon("꼬부기", "물", 50, 30);
		
		// 피카츄, 파이리, 피카츄, 꼬부기 -> 피카츄, 꼬부기, 파이리, 피카츄
		// 원하는 위치에 add()하는 방법 -> .add(위치, 데이터)
		list.add(1, p3);
		
		// 원하는 데이터 값 삭제하기! -> remove()
		list.remove(2);

	}

}
