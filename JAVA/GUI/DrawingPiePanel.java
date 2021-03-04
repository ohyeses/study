import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

// 실제 Panel에다가 그려줄 녀석을 넣어준다.
// Jpanel을 상속받고 import 한다.
// Jpanel에 있는 기능들을 물려받아서 실제로 동작할 수 있게 한다.
public class DrawingPiePanel extends JPanel {
	// 여기서 하는 작업? 실제 값을 받아서 PieChart를 그려줄 속성들을 정리해주는 Class

	// 실제 PieChart에 그려질 값들
	int i;
	int k;
	int j;
	int l;

	// 차트를 그려줄 paint() 메소드 만들기
	public void paint(Graphics g) {
		// Graphics -> 그래픽을 입힐 수 있는 것. import 필요
		// 원형 만들기 -> 어느 위치에서 어느 높이로 만들건지 정하기
		// 넓이, 높이는 함수를 통해서 만든다. 이미 있는 함수를 사용한다.
		g.clearRect(0, 0, getWidth(), getHeight());

		// 값이 입력되지 않으면 return 해줄 값을 설정한다.
		// 파이차트를 그릴때 비율을 따지고 - 값이 안들어가기 때문에
		// 넷중에 어느 하나라도 0보다 작으면 
		if ((i < 0) || (j < 0) || (k < 0) || (l < 0)) // 값이 입력이 안됐으면
			return; // 값을 리턴한다.

		// total -> 전체 합을 담아두는 변수
		// 전체 합이 0이 됐을 때도 return을 해줘야 하기 때문이다.
		int total = i + j + k + l;
		if (total == 0)
			return;

		// 값이 제대로 들어왔을 경우 -> 전체에서 각각의 값에 대한 비중(비율)을 구한다. 
		// 원은 360도이기 때문에 360에서 total 값으로 나눈다.
		// 360도에 대해서 봤을 때 i j k l 의 값이 
		// 전체에서 비중이 어느정도 되는지를 확인해야한다.
		int arc1 = 360 * i / total; // 360 * i 에 대해서 total 값으로 나눠준다. 
		int arc2 = 360 * j / total;
		int arc3 = 360 * k / total;
		int arc4 = 360 * l / total;

		// 각각의 색상 지정
		// g (Graphic)를 통해서 컬러를 세팅. import 필요.
		g.setColor(Color.yellow);

		
		// 지정한 값들을 fillArc()를 통해 띄워준다.
		// fillArc() -> (x축, y축, 반지름, 반지름, 반지름 시작 각, 반지름 끝나는 각)
		// 0 ~ arc1  -> 0도부터 시작해서 i의 비중을 구한 값까지만.
		g.fillArc(50, 20, 200, 200, 0, arc1);

		// 두번째
		g.setColor(Color.red);
		
		// x축, y축은 똑같음 -> 파이차트가 똑같은 위치에서 시작하기 때문에.
		// arc1 -> 두번째 값은 첫번째 값이 끝나는데부터 시작하기 때문에
		g.fillArc(50, 20, 200, 200, arc1, arc2);

		// 세번째
		g.setColor(Color.blue);
		// arc1 + arc2 -> 두 값을 더한 값이 시작값
		g.fillArc(50, 20, 200, 200, arc1 + arc2, arc3);

		// 네번째
		g.setColor(Color.green);
		g.fillArc(50, 20, 200, 200, arc1 + arc2 + arc3, arc4);
		
		
		// 글자색 검은색으로
		g.setColor(Color.black);

		// 각각의 데이터 값 확인할 수 있도록 보여준다.
		// 범례 지정 drawString(내용, x 위치, y위치)
		// x 축의 위치는 똑같이 뜨고 y축의 위치는 다르게 뜬다.
		g.drawString("비타민 : 노랑", 300, 150);
		g.drawString("아미노산 : 빨강", 300, 170);
		g.drawString("미네랄 : 파랑", 300, 190);
		g.drawString("섬유질 : 초록", 300, 210);
		
	}

	// JPanel을 상속받는 DrawingPiePanel에서 setNumber을 물려받을 수 있도록 만든다.
	public void setNumbers(int i, int j, int k, int l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

}
