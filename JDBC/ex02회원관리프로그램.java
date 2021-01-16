package JDBC;

import java.util.Scanner;

public class ex02ȸ���������α׷� {
	// MVC ���� ����
	// ������������ ���ϰ� �ϱ� ���� �����ڵ� ������ ������ �����
	// ���������� �� �� ������ ������ ���� ������ ���������� �ϱ� �����ϱ� ������ ����.
	// MVC �� Model View Controller �� ����.
	// MVC ���� �� M -> Model
	// ���ø����̼��� ���������� �� �������� ���� �մϴ�. ó���Ǵ� �˰���, DB�� ��ȣ�ۿ� (CRUD Create Read Update Delete), �ʱ�ȭ��, ������ ������ ���� ���մϴ�. 
	// MVC ���� �� View
	// ȭ�鿡 �������� �ΰ��� �������ֱ� ���� ���ҡ��� �մϴ�. �ٽ� ���� ������ �� ��ü�� �Է�, �׸��� �����ִ� ����� ����մϴ�. ����Ÿ�� ������� ����ڵ��� �� �� �ִ� ȭ���Դϴ�.  
	// MVC ���� �� Controller
	// ���� ����ԡ� ó���� ���� �����ϴ� ������ �մϴ�. ��, ����ڰ� �����͸� Ŭ���ϰ�, �����ϴ� �Ϳ� ���� "�̺�Ʈ"���� ó���ϴ� �κ��� ���մϴ�.  

	
	
	// MVC �� View �����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO(); // ��ü�� �������� ����.
		
		System.out.println("=======ȸ������ ���α׷�=======");
		// ����ڰ� 5��� ���ڸ� �Է��ϱ� ������ �ݺ��ϴ� ���α׷� -> ���� ������� �𸣴� WHILE (TRUE)
		while (true) {
			System.out.println("[1]ȸ������ [2]�α��� [3]���ȸ���������� [4]ȸ��Ż�� [5]����");
			System.out.print("��ȣ �Է� >> ");
			int input = sc.nextInt();
			
			if (input == 1) {
				// ȸ������ ���� ���̵�, �н����� �̸�, ���̸� �Է� �޴´�.
				System.out.print("���̵� �Է� >>");
				String id = sc.next();
				
				System.out.print("�н����� �Է� >>");
				String pw = sc.next();
				
				System.out.print("�̸� �Է� >> ");
				String name = sc.next();
				
				System.out.print("���� �Է� >>");
				int age = sc.nextInt();
				
				// �Է��� �� �ް��� DAO���� ���� insert()�޼��带 �ҷ��� ����Ѵ�.
				// DAO���� ���� �޼ҵ带 ����Ϸ��� ��ü�� ������ �Ѵ� -> �� ���� DAO ��ü ����
				// ȸ������, �α���, ȸ��Ż�� �� ��� ����� �޼���� �� ���ű� ����.
				// ��������� �Է¹��� id��pw�� dao�� insert() �޼ҵ��� �Ű������� �����ش�.
				// insert() �޼ҵ��� ����Ÿ���� int�� int�� �ݾ��ش�.
				int result = dao.insert(id, pw, name, age);
				
				
				// result ���� 0���� ũ�� ȸ������ ����
				if (result > 0) {
					System.out.println("ȸ������ ����!");
				} else { // �׷��� �ʴٸ�, result�� 0�̶�� ȸ������ ����
					System.out.println("ȸ������ ����!");
				}
				
				
				
			}
			else if (input == 2) {
				System.out.println("===�α���===");
				System.out.print("���̵� �Է� >>");
				String id = sc.next();
				
				System.out.print("�н����� �Է� >>");
				String pw = sc.next();
				
				// �Է��� �� �ް� ����
				// dao �� ������ �ִ� ��� �� login �ϴ� ����� ���ڴ�.
				// (id,pw,name,age)�� ȸ���� ��� �����Ͱ� ����ִ� MemberVO resultVO �� �޴´�.
				MemberVO resultVO = dao.login(id, pw); // �Ű������� id, pw�� �޴´�.
				
				
				// ���̵� : id
				// �н����� : pw
				// �̸� : name
				// ���� : age		<-- �̷��� ����Ϸ��� ���?
				
				// ���̵� �н����� �̸� ���� �� resultVO�� ������ ������
				// ���̵� ���������� ���� getter/setter ����� �־��� ���� �̿��� �����Ѵ�.
				
				// �α��� ������ ���� ���� ��� -> resultVO�� null�� �ƴҶ��� ���
				// resultVO�� null �϶� ����ϸ� �������.
				if (resultVO != null) {
					System.out.println("���̵� : " + resultVO.getId());
					System.out.println("��й�ȣ : " + resultVO.getPw());
					System.out.println("���̵� : " + resultVO.getId());
					System.out.println("���̵� : " + resultVO.getId());
				}
				
				
			}
			else if (input == 3) {
				System.out.println("===ȸ����������===");

				
				
			}
			else if (input == 4) {
				System.out.println("===ȸ��Ż��===");
				
				System.out.print("���̵� �Է� >>");
				String id = sc.next();
				
				System.out.print("�н����� �Է� >>");
				String pw = sc.next();
				
				System.out.print("�н����� Ȯ�� �Է� >>");
				String checkPw = sc.next();
			}
			else if (input == 5) {
				// 5�� �Է��ϸ� ����
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

			
		}
	}



}
