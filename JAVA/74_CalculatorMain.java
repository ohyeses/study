import calculator.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator(50, 10);

		System.out.println(cal.sum());

		
		// cal��ü�� num1 ���� 75, num2���� 5�� �����ϼ���
		cal.setNum1(75);
		cal.setNum2(5);
		
		// cal��ü�� num1�� num2�� �� ��, ���� ��, ���� ���� ����ϼ���
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
	}

}
