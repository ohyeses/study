import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener을 통해서 그려지는 기능을 수행 하므로
// ActionListener 인터페이스를 함께 구현해 줘야 한다. -> implement 필요.
public class DrawingPie implements ActionListener{
	
	// 매개변수를 저장할 수 있도록 필드 만들기
	int i,j,k,l;
	DrawingPiePanel drawingPanel;
	
	// 리스너를 통해 작동되는 녀석?
	// 사용을 하려면 implement를 해줘야한다.
	
	// main으로 부터 넘겨 받는 생성자 만들기
	// 매개변수 4개와 DrawingpiePanel을 받는다.
	public DrawingPie(int i, int j, int k, int l, DrawingPiePanel drawingPanel) {
		// 매개변수들을 위에있는 필드에 저장할 수 있도록 초기화 -> this
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
		this.drawingPanel = drawingPanel;
		
	}
	
	// 메소드 만들기 -> 드로잉 파이 버튼이 눌리면 감지해 계속해서 새롭게 그려주는 기능을 한다.
	// 그려주기만 하는 녀석이라 따로 리턴이 필요 없다.
	// ActionEvent 매개변수 -> 모든 이벤트는 매개변수를 쓸 때 거의 e 라고 표현한다. import 필요
	public void actionPerformed (ActionEvent e) {
		// 판넬을 그릴 때 넘버를 지정한다.
		drawingPanel.setNumbers(i,j,k,l);
		
		// 호출 될 때마다 위에 들어있는 값들을 가지고 새롭게 그려준다.
		drawingPanel.repaint();
	}
	

}
