import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PieMain {

	public static void main(String[] args) {
		// 실행이 되면 먼저 띄워줄 Frame 이 필요하다.
		// JFrame을 만들어 준다. import 필요.
		JFrame frame = new JFrame();

		// setBounds -> 프레임의 위치를 지정한다.
		frame.setBounds(100, 100, 500, 320);

		// 파이차트 크기를 지정해 주는 것. import 필요.
		frame.setPreferredSize(new Dimension(500, 350));

		// 파이차트를 그려주기 위해서는 컨테이너가 필요하다. import 필요 -> java.awt
		Container containerPane = frame.getContentPane();
		
		// Pie 차트를 그리기 위한 Panel
		// 파이차트를 그냥 만들 수 없어 또다른 판넬을 만들어서 컨테이너 위에 덮어준다.
		// DrawingPiePanel 로 객체를 생성한다. import 필요
		// 에러 나면 클래스를 생성해야 한다.
		DrawingPiePanel drawingPanel = new DrawingPiePanel();
		
		
		// containerPane에 이후에 그려질 DrawingPiePanel을 붙여준다.
		// 레이아웃 지정 가능 -> BorderLayout.Center -> 가운데다 붙이겠다라는 뜻
		containerPane.add(drawingPanel, BorderLayout.CENTER);
		
		// 버튼 영역을 따로 준다. import 필요.
		JPanel controlPanel = new JPanel();
		
		// JPanel 에 들어갈 JButton을 만들어준다.
		// J 붙는 녀석들은 다 import 해줘야 한다.
		JButton button = new JButton("성분표 확인하기");
		
		// 컨트로 판넬에다 버튼을 붙인다.
		controlPanel.add(button);
		
		// 센터를 기준으로 위아래양옆이 비어있어 controlPanel을  다른곳에다 붙여준다.
		// 레이아웃 -> 동서남북으로 표현 ->  아래에다가 붙힐거기 때문에 south
		containerPane.add(controlPanel, BorderLayout.SOUTH);
		
		// frame에다 기능을 부여해준다.
		// frame창에 exit 버튼이 눌리면 닫아주는 기능
		frame.setDefaultCloseOperation(0);
		
		
		// 리스너 객체 생성 -> 그리고 싶은 값들을 다른곳에다 전달해서 직접 그릴 수 있는 Listener
		// 파이차트에는 비율을 넣어줘야 한다. 비율을 가지고 그래프를 그릴꺼기 때문
		// Piechart의 네가지 종류를 표현해 줄 수 있는 값과 drawingPanel 을 보내준다.
		// 이것들을 토대로 PieChart를 그려준다.
		DrawingPie listener = new DrawingPie(30,20,10,40, drawingPanel);
		
		// 버튼에 리스너를 부착하기
		// 버튼에 어떤 동작이 감지돼면 listener을 보내준다.
		button.addActionListener(listener);
		
		// 창이 실제로 보이게끔 true값 지정한다.
		frame.setVisible(true);
	}

}
