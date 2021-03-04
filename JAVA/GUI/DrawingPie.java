import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener�� ���ؼ� �׷����� ����� ���� �ϹǷ�
// ActionListener �������̽��� �Բ� ������ ��� �Ѵ�. -> implement �ʿ�.
public class DrawingPie implements ActionListener{
	
	// �Ű������� ������ �� �ֵ��� �ʵ� �����
	int i,j,k,l;
	DrawingPiePanel drawingPanel;
	
	// �����ʸ� ���� �۵��Ǵ� �༮?
	// ����� �Ϸ��� implement�� ������Ѵ�.
	
	// main���� ���� �Ѱ� �޴� ������ �����
	// �Ű����� 4���� DrawingpiePanel�� �޴´�.
	public DrawingPie(int i, int j, int k, int l, DrawingPiePanel drawingPanel) {
		// �Ű��������� �����ִ� �ʵ忡 ������ �� �ֵ��� �ʱ�ȭ -> this
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.drawingPanel = drawingPanel;
		
	}
	
	// �޼ҵ� ����� -> ����� ���� ��ư�� ������ ������ ����ؼ� ���Ӱ� �׷��ִ� ����� �Ѵ�.
	// �׷��ֱ⸸ �ϴ� �༮�̶� ���� ������ �ʿ� ����.
	// ActionEvent �Ű����� -> ��� �̺�Ʈ�� �Ű������� �� �� ���� e ��� ǥ���Ѵ�. import �ʿ�
	public void actionPerformed (ActionEvent e) {
		// �ǳ��� �׸� �� �ѹ��� �����Ѵ�.
		drawingPanel.setNumbers(i,j,k,l);
		
		// ȣ�� �� ������ ���� ����ִ� ������ ������ ���Ӱ� �׷��ش�.
		drawingPanel.repaint();
	}
	

}
