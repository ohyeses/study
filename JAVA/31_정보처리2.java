
public class Ex03_정보처리2 {

	public static void main(String[] args) {
		int i =3;
		int k =1;
		
		switch(i) { 
		case 0 : k=4;
		case 1 : k+=3;
		case 2 : k-=5;
		case 3 : k=0;
		case 4 : k+=3;
		case 5 : k-= 10;
		default :k--;
		}
		System.out.println(k);
	}

}
