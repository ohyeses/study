import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Graph_01 {

	public static void main(String[] args) {
		
		// �׷����� �� ������ ����
		double [] xData = {0.0, 1.0, 2.0};	// x�࿡ ���� ������
		double [] yData = {3.0, 5.7, 0.0}; // y�࿡ ���� ������
		
		// ��Ʈ ���� -> XYChart import �۾� �ʿ��ϴ�.
		// xData, yData�� ��Ʈ �����
		// Quickchart -> ����, x�� y�� �̸��� �Ѳ����� ������ �� �ִ�.
		XYChart chart = QuickChart.getChart("Test Chart", "xData", "yData", "y(x)", xData, yData);
		
		// ��Ʈ �����ֱ�
		// displaychart -> ���÷����� ��Ʈ�� ����ش�.
		new SwingWrapper(chart).displayChart();
	}

}
