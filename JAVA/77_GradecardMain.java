package 성적표만들기;

import java.util.ArrayList;
import java.util.Scanner;

public class GradecardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Gradecard> list = new ArrayList<>();

		boolean isRun = true;
		while (isRun) {
			System.out.print("[1]성적표입력 [2]성적표조회(개인) [3]삭제(개인) [4]종료 >> ");
			int choice = sc.nextInt();

			// 1. 성적을 직접 입력할 수 있도록 입력받기 -> Scanner 사용
			// [1]성적표입력 [2]성적표조회(개인) [3]삭제(개인)

			if (choice == 1) {
				System.out.print("이름 >>");
				String name = sc.next();
				System.out.print("학번 >>");
				String id = sc.next();
				System.out.print("자바 점수 >>");
				int Java = sc.nextInt();
				System.out.print("파이썬 점수 >>");
				int Python = sc.nextInt();

				Gradecard card = new Gradecard(Java, Python, name, id);

				list.add(card);
			} else if (choice == 2) {

				// 개별로 나오는 아이디 입력
				System.out.println("학번 입력 >> ");
				String search = sc.next();

				for (int i = 0; i < list.size(); i++) {
					// 내가 현재 입력한 search와 이미 사전에 등록한 id 값이 같으면,
					if (search.equals(list.get(i).getId())) {

						System.out.println("이름 : " + list.get(i).getName());
						System.out.println("학번 : " + list.get(i).getId());
						System.out.println("자바 점수 : " + list.get(i).getJava());
						System.out.println("파이썬 점수 : " + list.get(i).getPython());
						System.out.println("총 합계 : " + list.get(i).getTotal());
					}
				}
			}

			else if (choice == 3) {
				// 삭제
				// 검색된 학번을 삭제하는 기능 만들기
				System.out.println("학번 입력 >> ");
				String search = sc.next();

				for (int i = 0; i < list.size(); i++) {
					// 내가 현재 입력한 search와 이미 사전에 등록한 id 값이 같으면,
					if (search.equals(list.get(i).getId())) {

						System.out.println(search + " 정보 삭제");
						list.remove(i);
					}
					
					System.out.println();
					
					// 남은 정보 출력
					for (int j = 0; j < list.size(); j++) {
							System.out.println("이름 : " + list.get(j).getName());
							System.out.println("학번 : " + list.get(j).getId());
							System.out.println("자바 점수 : " + list.get(j).getJava());
							System.out.println("파이썬 점수 : " + list.get(j).getPython());
							System.out.println("총 합계 : " + list.get(j).getTotal());
						
					}
					
					
					
				}

			}

			else if (choice == 4) {
				isRun = false;
			}

		}
	}

}
