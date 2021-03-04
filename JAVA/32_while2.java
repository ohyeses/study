import java.util.Scanner;

public class Ex04_while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

System.out.print("泅犁个公霸 : ");
		int weight = sc.nextInt();
		System.out.print("格钎个公霸 : ");
		int goal = sc.nextInt();
		int i = 1;

		do {
			System.out.print(i + "林瞒 皑樊 个公霸 : ");
			int weight_loss = 0;
			weight_loss = sc.nextInt();

			weight = weight - weight_loss;
			System.out.println(weight);
			i++;

		} while (weight > goal);

	}

}
