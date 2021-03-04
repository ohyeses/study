
public class Ex03_형변환 {

	public static void main(String[] args) {
		//1. 자동형변환(묵시적 형변환)
		int a =3;
		double b = a;
		System.out.println(b);
		
		//2.강제형변환(명시적 형변환)
		double c = 73.2;
		int d = (int)c;
		
		//d를 출력
		System.out.println(d);
		
		// 상수
		final int e = 3;
		// e = 7;
		
		// 상수를 쓸 땐 변수를 대문자로 쓴다.
		final double PI = 3.141592;
		
		//문제
		int y = 10;
		y=7;
		System.out.println(y);
		
		// final 이 붙으면 상수가 되서 u변수에 7이 들어갈수가없어요
		final int u = 10;
		// u=7;
		System.out.println(u);
		

	}

}
