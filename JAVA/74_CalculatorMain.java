import calculator.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator(50, 10);

		System.out.println(cal.sum());

		
		// cal객체의 num1 값은 75, num2값은 5로 수정하세요
		cal.setNum1(75);
		cal.setNum2(5);
		
		// cal객체의 num1과 num2를 뺀 값, 곱한 값, 나눈 값을 출력하세요
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
	}

}
