import java.util.Scanner;

public class Ex04_while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

System.out.print("��������� : ");
		int weight = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();
		int i = 1;

		do {
			System.out.print(i + "���� ���� ������ : ");
			int weight_loss = 0;
			weight_loss = sc.nextInt();

			weight = weight - weight_loss;
			System.out.println(weight);
			i++;

		} while (weight > goal);

	}

}
