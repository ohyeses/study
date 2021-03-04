import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Graph_01 {

	public static void main(String[] args) {
		
		// 그래프에 들어갈 데이터 생성
		double [] xData = {0.0, 1.0, 2.0};	// x축에 대한 데이터
		double [] yData = {3.0, 5.7, 0.0}; // y축에 대한 데이터
		
		// 차트 생성 -> XYChart import 작업 필요하다.
		// xData, yData로 차트 만들기
		// Quickchart -> 범례, x축 y축 이름을 한꺼번에 지정할 수 있다.
		XYChart chart = QuickChart.getChart("Test Chart", "xData", "yData", "y(x)", xData, yData);
		
		// 차트 보여주기
		// displaychart -> 디스플레이한 차트를 띄워준다.
		new SwingWrapper(chart).displayChart();
	}

}
