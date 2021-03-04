import java.util.ArrayList;

public class Main {

	// Ŭ���� : ����ڰ� ������� �ϴ� ��ü�� ������ �����ϴ� ���赵
	//		�ʵ�(�Ӽ�)�� �޼ҵ带 ������ �ִ�.
	//		Ŭ������ ������ �������� �ʴ´�! -> ���踸 ���� -> main() �ȵ�.
	// ��ü : ���赵�� ���ؼ� ������ ��������� ��ü (�ν��Ͻ�)
	//		 ������ �����Ͽ� ��ü�� ����� ���� ��
	
	// ���ϸ� ���� �����!
	// Ÿ��(String), �̸�(String), ����(int), ������(int)
	// ���� 4������ �ʵ带 ���� Pokemon Ŭ���� �����!
	public static void main(String[] args) {
		//pokemon �����
		// ��ü�� �����ϴ� Ű���� ? -> new Ű����
		
		// ��ü�� �����ϴ� ����
		// 1. ��ü�� �����ϱ� -> Ŭ������ + ��ü(����)��;
		// 2. ��ü�� = new Ŭ������();
		
//		Pokemon p1;
//		p1 = new Pokemon();
		
		// 1~2 �ܰ踦 ���ÿ� �����ϴ� ���
		// ��ü�� ������ �� ��ȣ�Ǿ� �ִ� �ʵ忡 �ʱⰪ�� ������ �� �ֶǷ�
		// �����ڸ� ����Ѵ�!
		Pokemon p1 = new Pokemon("��ī��", "����", 100, 100000);
		
		// �ڹ��� �ڷ��� -> �⺻, ���۷���(����)
		// ������ �ڷ��� : �����(Ŭ����) ������ ���� ������ Ÿ��
		// -> null ���̳� �ּҰ� ���� �ִ�.
		
		
		// Pokemon Ŭ������ �����ϴ� ���
		// 1. �ܺο��� ������ �� �ִ� �༮�� ����� �ش�. -> getter()
		// 2. pokemon Ŭ������ �ִ� getter() �� ���ο� �ִ� �ʵ忡 �����ϵ��� �����ش�.
//		p1.name = "��ī��";
//		p1.type = "����";
//		p1.lv = 100;
//		p1.power = 100000;
//		
		
		
		// getter�� setter �޼ҵ� ����� -> pokemon Ŭ������ �����ϱ�@!
		// getter() -> name, type, lv, power
		// setter() - > lv, power
		
		
		System.out.println("p1�� �̸� : " + p1.getName());
		System.out.println("p1�� Ÿ�� : " + p1.getType());
		System.out.println("p1�� ���� : " + p1.getLv());
		System.out.println("p1�� �̸� : " + p1.getPower());
		
		// ���� ���ϴ� ���ο� ���ϸ� �����ϱ�
		
		Pokemon p2 = new Pokemon("���̸�", "��", 50, 350);
		
//		p2.name = "��ġ����";
//		p2.type = "����";
//		p2.lv = 1;
//		p2.power = 100;
		//p1.setter(100);
		
		System.out.println("p2�� �̸� : " + p2.getName());
		System.out.println("p2�� Ÿ�� : " + p2.getType());
		System.out.println("p2�� ���� : " + p2.getLv());
		System.out.println("p2�� �Ŀ� : " + p2.getPower());
		
		// Collection�� ���� ����
		// ArrayList(���� ����Ʈ)
		// ArrayList<��ü Ÿ��> list = new ArrayList<��ü Ÿ��>();
		
		System.out.println();
		System.out.println("list ���� �� Ȯ���ϱ�");
		
		// ���۷����� ������ -> �ּҰ��� ���´� -> ��ü Ÿ���̴�@!
		// ����� ����Ʈ
		// <> -> ���׸� ���(Ÿ��)
		ArrayList<Pokemon> list = new ArrayList<>();

//		-add() : �����͸� �߰��ϴ� ���
//		-set(): �����͸� �����ϴ� ���
//		-get(): ����Ʈ�� �ִ� �����͸� �������� ���
//		-remove():�����͸� �����ϴ� ���
		
		// List�� ������ �߰��ϱ� -> add()
		list.add(p1);
		list.add(p2);
		
		// List�� ����� ������ Ȯ���ϱ� -> get()
		// �Ϲ� �迭�� ����Ҷ� �迭�� ���̸� �˱� ���� �� �༮ -> length
		// ArrayList(���� ����Ʈ)�� ���̸� �˱� ���ؼ� ���� �༮ -> .size()
		for (int i=0; i< list.size(); i++) {
		System.out.println(list.get(i).getName());
		System.out.println(list.get(i).getType());
		System.out.println(list.get(i).getLv());
		System.out.println(list.get(i).getPower());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getName());
		}
		
		// Pokemon Ÿ���� p3 �����ϱ�!
		// "���ϱ�", "��", 50, 30
		Pokemon p3 = new Pokemon("���α�", "��", 50, 30);
		
		// ��ī��, ���̸�, ��ī��, ���α� -> ��ī��, ���α�, ���̸�, ��ī��
		// ���ϴ� ��ġ�� add()�ϴ� ��� -> .add(��ġ, ������)
		list.add(1, p3);
		
		// ���ϴ� ������ �� �����ϱ�! -> remove()
		list.remove(2);

	}

}
