import java.util.Scanner;

public class Ex08_�޼ҵ�ǽ� {

	public static void main(String[] args) {
		// num1�� num2�� �ƹ� ������ ����
		int num1 = 10;
		int num2 = 2;

		// isDivisor()�� �Ű����� �ְ� true or false ���
		boolean divisor = isDivisor(num1, num2);
//		System.out.println(isDivisor(9, 3));
//		System.out.println(isDivisor(3, 9));
//		System.out.println(isDivisor(8, 7));
//		System.out.println(isDivisor(10, 5));

//		getDivisor(10);
//		getDivisor(16);
//		getDivisor(24);

		int num = 10;
		int result = getSumOfDivisors(num);

//		System.out.println(num + "�� ����� �� : " + result);
//		getDivisor(num);

		int number = 6;

		boolean check = isPerfectNumber(number); // ��������� true, �������� �ƴ϶�� false ����
		// System.out.print(number + "�� �������ΰ�? " + check);
		
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}
	
	
	//���� startValue�� 2��, endValue�� 1000�̶��
	//2~1000���� �� �߿� ��������� result�� �����ؼ� �߰�
	//2~1000������ ������ : 6 28 496
	public static void getPerfectNumber(int startValue, int endValue) {
		String result = String.format("%d~%d������ ������ : ", startValue, endValue);
		
		for(int i=startValue; i<=endValue; i++) { //������� �� ¦���ϱ� i++ �� i+=2 �� �ϸ� ����ӵ� 2�� ������.
			if(isPerfectNumber(i)) {
				result += i + " ";
			}
		}
		
		System.out.println(result);
	}




	//����, number�� ��������� result�� true�� �ٲ��ּ���
	//��������, �ڱ� �ڽ��� ������ ����� ���� �ٽ� �ڱ� �ڽ��� �Ǵ� ��
	//�������� �ƴ϶�� false �״��
	//1���� ~1000���� ���� �� : 6, 28, 496
	public static boolean isPerfectNumber(int number) { {
			return ((getSumOfDivisors(number)-number)==number);
				//getsumOfDivisors(number)/2 ==number
				//getsumOfDivisors(number) == number *2
				//�ټ��Լ��� �� == ������ �ι� ��

		}
	}

	public static int getSumOfDivisors(int num) {
		int result = 0;

		// result�� num�� ����� ������ ��⵵�� ���ּ���
		// for��
		for (int i = 1; i <= num / 2; i++) {
			if (isDivisor(num, i)) {
				result += i;
			}

		}

		// while��
//		int a=1;
//		while(a<=num/2) {
//			if(num%a ==0) {
//				result += a;
//			}
//			a++;
//		}

		return result+num;
		// return result+num;
	}

	public static void getDivisor(int num) {
		// ������ 2�� 3 �� 4�� �� �� ���� �� , %d %s
		String result = String.format("%d�� ��� : ", num);
		// result ������ �����
		// for��
//		for (int i = 1; i <= num / 2; i++) {
//			if (num % i == 0) {
//				result += i + " ";
//			}
//
//		}

		// ����
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num, i)) {
				result += i + " ";
			}
		}
		result += num; // �ڱ� �ڽŵ� ����̴ϱ� �������ش�.

		// while��
//		int i = 1;
//		while (i <= num) {
//			if (num % i == 0) {
//				result += (i + " ");
//				
//			}
//			i++;
//		}

		System.out.println(result);

	}

	public static boolean isDivisor(int num1, int num2) {
		// num2�� num1�� ������ result�� true��.
		// ����� �ƴ϶�� result�� false�� ��ȯ
		return num1 % num2 == 0;

	}

}
