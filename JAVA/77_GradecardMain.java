package ����ǥ�����;

import java.util.ArrayList;
import java.util.Scanner;

public class GradecardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Gradecard> list = new ArrayList<>();

		boolean isRun = true;
		while (isRun) {
			System.out.print("[1]����ǥ�Է� [2]����ǥ��ȸ(����) [3]����(����) [4]���� >> ");
			int choice = sc.nextInt();

			// 1. ������ ���� �Է��� �� �ֵ��� �Է¹ޱ� -> Scanner ���
			// [1]����ǥ�Է� [2]����ǥ��ȸ(����) [3]����(����)

			if (choice == 1) {
				System.out.print("�̸� >>");
				String name = sc.next();
				System.out.print("�й� >>");
				String id = sc.next();
				System.out.print("�ڹ� ���� >>");
				int Java = sc.nextInt();
				System.out.print("���̽� ���� >>");
				int Python = sc.nextInt();

				Gradecard card = new Gradecard(Java, Python, name, id);

				list.add(card);
			} else if (choice == 2) {

				// ������ ������ ���̵� �Է�
				System.out.println("�й� �Է� >> ");
				String search = sc.next();

				for (int i = 0; i < list.size(); i++) {
					// ���� ���� �Է��� search�� �̹� ������ ����� id ���� ������,
					if (search.equals(list.get(i).getId())) {

						System.out.println("�̸� : " + list.get(i).getName());
						System.out.println("�й� : " + list.get(i).getId());
						System.out.println("�ڹ� ���� : " + list.get(i).getJava());
						System.out.println("���̽� ���� : " + list.get(i).getPython());
						System.out.println("�� �հ� : " + list.get(i).getTotal());
					}
				}
			}

			else if (choice == 3) {
				// ����
				// �˻��� �й��� �����ϴ� ��� �����
				System.out.println("�й� �Է� >> ");
				String search = sc.next();

				for (int i = 0; i < list.size(); i++) {
					// ���� ���� �Է��� search�� �̹� ������ ����� id ���� ������,
					if (search.equals(list.get(i).getId())) {

						System.out.println(search + " ���� ����");
						list.remove(i);
					}
					
					System.out.println();
					
					// ���� ���� ���
					for (int j = 0; j < list.size(); j++) {
							System.out.println("�̸� : " + list.get(j).getName());
							System.out.println("�й� : " + list.get(j).getId());
							System.out.println("�ڹ� ���� : " + list.get(j).getJava());
							System.out.println("���̽� ���� : " + list.get(j).getPython());
							System.out.println("�� �հ� : " + list.get(j).getTotal());
						
					}
					
					
					
				}

			}

			else if (choice == 4) {
				isRun = false;
			}

		}
	}

}
