
public class º°Âï±â3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("**");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (5 - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
