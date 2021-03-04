import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieMain {

	public static void main(String[] args) {
		// ������ �Ǹ� ���� ����� Frame �� �ʿ��ϴ�.
		// JFrame�� ����� �ش�. import �ʿ�.
		JFrame frame = new JFrame();

		// setBounds -> �������� ��ġ�� �����Ѵ�.
		frame.setBounds(100, 100, 500, 320);

		// ������Ʈ ũ�⸦ ������ �ִ� ��. import �ʿ�.
		frame.setPreferredSize(new Dimension(500, 350));

		// ������Ʈ�� �׷��ֱ� ���ؼ��� �����̳ʰ� �ʿ��ϴ�. import �ʿ� -> java.awt
		Container containerPane = frame.getContentPane();
		
		// Pie ��Ʈ�� �׸��� ���� Panel
		// ������Ʈ�� �׳� ���� �� ���� �Ǵٸ� �ǳ��� ���� �����̳� ���� �����ش�.
		// DrawingPiePanel �� ��ü�� �����Ѵ�. import �ʿ�
		// ���� ���� Ŭ������ �����ؾ� �Ѵ�.
		DrawingPiePanel drawingPanel = new DrawingPiePanel();
		
		
		// containerPane�� ���Ŀ� �׷��� DrawingPiePanel�� �ٿ��ش�.
		// ���̾ƿ� ���� ���� -> BorderLayout.Center -> ����� ���̰ڴٶ�� ��
		containerPane.add(drawingPanel, BorderLayout.CENTER);
		
		// ��ư ������ ���� �ش�. import �ʿ�.
		JPanel controlPanel = new JPanel();
		
		// JPanel �� �� JButton�� ������ش�.
		// J �ٴ� �༮���� �� import ����� �Ѵ�.
		JButton button = new JButton("����ǥ Ȯ���ϱ�");
		
		// ��Ʈ�� �ǳڿ��� ��ư�� ���δ�.
		controlPanel.add(button);
		
		// ���͸� �������� ���Ʒ��翷�� ����־� controlPanel��  �ٸ������� �ٿ��ش�.
		// ���̾ƿ� -> ������������ ǥ�� ->  �Ʒ����ٰ� �����ű� ������ south
		containerPane.add(controlPanel, BorderLayout.SOUTH);
		
		// frame���� ����� �ο����ش�.
		// frameâ�� exit ��ư�� ������ �ݾ��ִ� ���
		frame.setDefaultCloseOperation(0);
		
		
		// ������ ��ü ���� -> �׸��� ���� ������ �ٸ������� �����ؼ� ���� �׸� �� �ִ� Listener
		// ������Ʈ���� ������ �־���� �Ѵ�. ������ ������ �׷����� �׸����� ����
		// Piechart�� �װ��� ������ ǥ���� �� �� �ִ� ���� drawingPanel �� �����ش�.
		// �̰͵��� ���� PieChart�� �׷��ش�.
		DrawingPie listener = new DrawingPie(30,20,10,40, drawingPanel);
		
		// ��ư�� �����ʸ� �����ϱ�
		// ��ư�� � ������ �����Ÿ� listener�� �����ش�.
		button.addActionListener(listener);
		
		// â�� ������ ���̰Բ� true�� �����Ѵ�.
		frame.setVisible(true);
	}

}
