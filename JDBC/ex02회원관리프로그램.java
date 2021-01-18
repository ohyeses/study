package JDBC;

import java.util.ArrayList;
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
				// insert() �޼ҵ��� ����Ÿ���� int�� int�� �޾��ش�.
				
				
//				MemberVO vo = new MemberVO(id, pw, name, age); // �Է¹��� id pw name age�� �����ڷ� �־��ְڴ�
				
				// insert �޼ҵ� �Ű������� Membervo�� �־��ش�.
				// ����ڿ��� �����͸� �Է¹��� vo�� �ٸ������� ������ �ʱ� ������
				// �ߺ����� ������ �ʴ� �ֵ��� ���� ���� ���� �����ִ°� ����. -> ������ ���ÿ� �Ű������� �־��� �� �ִ�.
				int result = dao.insert(new MemberVO(id, pw, name, age)); 
				
				
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
				
				
				// �����ڸ� �����ε� �Ͽ� �Ű����� 2���� �޵��� �Ѵ�.
				MemberVO vo = new MemberVO(id,pw);
				MemberVO resultVO = dao.login(vo); // login() �Ű������� vo�� �ٲ۴�.
				
				
				// ���̵� : id
				// �н����� : pw
				// �̸� : name
				// ���� : age		<-- �̷��� ����Ϸ��� ���?
				
				// ���̵� �н����� �̸� ���� �� resultVO�� ������ ������
				// ���̵� ���������� ���� getter/setter ����� �־��� ���� �̿��� �����Ѵ�.
				
				// �α��� ������ ���� �� ��� -> resultVO�� null�� �ƴҶ��� ���
				// resultVO�� null �϶� ����ϸ� �������.
				if (resultVO != null) {
					System.out.println("���̵� : " + resultVO.getId());
					System.out.println("��й�ȣ : " + resultVO.getPw());
					System.out.println("���̵� : " + resultVO.getId());
					System.out.println("���̵� : " + resultVO.getId());
				}
				
				
			}
			else if (input == 3) {
				// ��� ȸ�� ������ ����!!
				// select * from bigdatamember;
				
				// ���̵� ��й�ȣ �̸� ����
				// 123	123	  123 123
				// 40   40    40  40
				System.out.println("===ȸ����������===");
				
				// id pw name age�� �ϳ��� ���� �� �ִ� MemberVO
				// MemberVo�� �ϳ��� ���� �� �ִ� ����� ��ü�迭�� ���� �� �ְڴ�.
				// ��ü �迭�� �������� �迭�� ������ �ֱ� ������ ArrayList��� ���� ��ü�� �̿��� ������.
				// dao�� ����� allSelect() �޼ҵ带 ����Ѵ�.
				ArrayList<MemberVO> list = dao.allSelect();
				
				// ArrayList ��� ���
				// ArrayList�� ���� ���� - > size()
				// list.get(i) == MemberVO
				// list.get(i).getId() -> i��° ��ü���� id�� �������ڴ�.
				for(int i = 0; i< list.size(); i++) {
					System.out.println(list.get(i).getId() + "\t"
				+ list.get(i).getPw() + "\t"  + list.get(i).getName()
				+ "\t" +  list.get(i).getAge());
					
					
				}
				
			}
			else if (input == 4) {
				// ���̵�, �н����� �н����� Ȯ�� �Է��� �޴´�.
				System.out.println("===ȸ��Ż��===");
				
				System.out.print("���̵� �Է� >>");
				String id = sc.next();
				
				System.out.print("�н����� �Է� >>");
				String pw = sc.next();
				
				System.out.print("�н����� Ȯ�� �Է� >>");
				String checkPw = sc.next();
				
				// id�� pw�� �� �� �� �࿡ �ִ� �����Ͷ�� �� ���� �������ִ� ����
				if (pw.equals(checkPw)) { // ���� �н������ �н�����Ȯ���� �������� ����
					// dao�� delete() �޼ҵ带 ����Ѵ�.
					// �Ű������� MemberVo�� id pw �ΰ��� �ǳ��ش�.
					// row -> ������ ���� ���� ����
					// delete�� �ϰ��� ������ ���� ���� ������ �����´�.
					int row = dao.delete(new MemberVO(id,pw)); 
					
					if (row > 0) {
						System.out.println("ȸ��Ż�� ����!");
					} else {
						System.out.println("ȸ��Ż�� ����!");
					}
				
				}
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