import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

// ���� Panel���ٰ� �׷��� �༮�� �־��ش�.
// Jpanel�� ��ӹް� import �Ѵ�.
// Jpanel�� �ִ� ��ɵ��� �����޾Ƽ� ������ ������ �� �ְ� �Ѵ�.
public class DrawingPiePanel extends JPanel {
	// ���⼭ �ϴ� �۾�? ���� ���� �޾Ƽ� PieChart�� �׷��� �Ӽ����� �������ִ� Class

	// ���� PieChart�� �׷��� ����
	int i;
	int k;
	int j;
	int l;

	// ��Ʈ�� �׷��� paint() �޼ҵ� �����
	public void paint(Graphics g) {
		// Graphics -> �׷����� ���� �� �ִ� ��. import �ʿ�
		// ���� ����� -> ��� ��ġ���� ��� ���̷� ������� ���ϱ�
		// ����, ���̴� �Լ��� ���ؼ� �����. �̹� �ִ� �Լ��� ����Ѵ�.
		g.clearRect(0, 0, getWidth(), getHeight());

		// ���� �Էµ��� ������ return ���� ���� �����Ѵ�.
		// ������Ʈ�� �׸��� ������ ������ - ���� �ȵ��� ������
		// ���߿� ��� �ϳ��� 0���� ������ 
		if ((i < 0) || (j < 0) || (k < 0) || (l < 0)) // ���� �Է��� �ȵ�����
			return; // ���� �����Ѵ�.

		// total -> ��ü ���� ��Ƶδ� ����
		// ��ü ���� 0�� ���� ���� return�� ����� �ϱ� �����̴�.
		int total = i + j + k + l;
		if (total == 0)
			return;

		// ���� ����� ������ ��� -> ��ü���� ������ ���� ���� ����(����)�� ���Ѵ�. 
		// ���� 360���̱� ������ 360���� total ������ ������.
		// 360���� ���ؼ� ���� �� i j k l �� ���� 
		// ��ü���� ������ ������� �Ǵ����� Ȯ���ؾ��Ѵ�.
		int arc1 = 360 * i / total; // 360 * i �� ���ؼ� total ������ �����ش�. 
		int arc2 = 360 * j / total;
		int arc3 = 360 * k / total;
		int arc4 = 360 * l / total;

		// ������ ���� ����
		// g (Graphic)�� ���ؼ� �÷��� ����. import �ʿ�.
		g.setColor(Color.yellow);

		
		// ������ ������ fillArc()�� ���� ����ش�.
		// fillArc() -> (x��, y��, ������, ������, ������ ���� ��, ������ ������ ��)
		// 0 ~ arc1  -> 0������ �����ؼ� i�� ������ ���� ��������.
		g.fillArc(50, 20, 200, 200, 0, arc1);

		// �ι�°
		g.setColor(Color.red);
		
		// x��, y���� �Ȱ��� -> ������Ʈ�� �Ȱ��� ��ġ���� �����ϱ� ������.
		// arc1 -> �ι�° ���� ù��° ���� �����µ����� �����ϱ� ������
		g.fillArc(50, 20, 200, 200, arc1, arc2);

		// ����°
		g.setColor(Color.blue);
		// arc1 + arc2 -> �� ���� ���� ���� ���۰�
		g.fillArc(50, 20, 200, 200, arc1 + arc2, arc3);

		// �׹�°
		g.setColor(Color.green);
		g.fillArc(50, 20, 200, 200, arc1 + arc2 + arc3, arc4);
		
		
		// ���ڻ� ����������
		g.setColor(Color.black);

		// ������ ������ �� Ȯ���� �� �ֵ��� �����ش�.
		// ���� ���� drawString(����, x ��ġ, y��ġ)
		// x ���� ��ġ�� �Ȱ��� �߰� y���� ��ġ�� �ٸ��� ���.
		g.drawString("��Ÿ�� : ���", 300, 150);
		g.drawString("�ƹ̳�� : ����", 300, 170);
		g.drawString("�̳׶� : �Ķ�", 300, 190);
		g.drawString("������ : �ʷ�", 300, 210);
		
	}

	// JPanel�� ��ӹ޴� DrawingPiePanel���� setNumber�� �������� �� �ֵ��� �����.
	public void setNumbers(int i, int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

}
