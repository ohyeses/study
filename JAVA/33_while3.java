import java.util.Scanner;

public class Ex05_while3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int i = 1;
		
		
		//무한반복문 실행 X
		while (true) {
			System.out.print(i + "주차 감량 몸무게 : ");
			int weight_loss = 0;
			weight_loss = sc.nextInt();

			weight = weight - weight_loss;
			System.out.println(weight);
			i++;

		}

	}

}
