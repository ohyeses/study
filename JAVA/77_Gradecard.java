package ����ǥ�����;

public class Gradecard {
	// ����ǥ �����
	// 1. ����(�ڹ�, ���̽�), �̸�, �й�, �հ� -> �ʵ� ����

	private int Java;
	private int Python;
	private String name;
	private String id;
	private int total;

	public int getJava() {
		return Java;
	}

	public int getPython() {
		return Python;
	}

	public int getTotal() {
		return total;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	// 2. �����ڸ� ���� �ʱⰪ���� ������ �� �ֵ��� ������ �����
	public Gradecard(int Java, int Python, String name, String id) {
		this.Java = Java;
		this.Python = Python;
		this.name = name;
		this.id = id;
		this.total = Java + Python;
	}

}
