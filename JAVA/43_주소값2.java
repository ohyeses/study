
public class Ex06_주소값2 {

	public static void main(String[] args) {
		// 문자열을 담는 배열
		String [] drink = {"솔의 눈", "데자와", "아침햇살", "실론티"};
		String [] snack = {"뿌셔뿌셔딸기맛", "건빵", "파맛 첵스"};
		
		System.out.println(drink[1]);
		System.out.println(snack[1]);
		
		System.out.println("drink의 주소 : " + drink);
		System.out.println("snack의 주소 : "+ snack);
		
		
		snack = drink;
		snack[1] = "뽀빠이";
		System.out.println("drink의 주소 : " + drink);
		System.out.println("snack의 주소 : "+ snack);
		
		System.out.println(snack[1]);
		System.out.println(drink[1]); //왜?

	}

}
