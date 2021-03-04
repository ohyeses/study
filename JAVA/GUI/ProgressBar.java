import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressBar window = new ProgressBar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgressBar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// ProgressBar를 생성하는 부분
		// JProgressBar를 만드는데 가로로 만드는 것.
		// Vertical -> 세로 /  Horizontal -> 가로 
		JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL); 
		progressBar.setBounds(24, 96, 372, 22);
		frame.getContentPane().add(progressBar);
		
		// 변수에 넣고싶은 값 지정한다.
		int num = 70;
		
		
		// 실제로 ProgressBar에 채워질 값을 세팅한다.
		progressBar.setStringPainted(true); // true라고 지정해줘야 0에서 부터 시작할 수 있다.
		progressBar.setValue(70); // value 값 안에는 int 형으로만 들어갈 수 있다.
		// 퍼센트를 보여주기 위해서 추가적으로 만드는 것
		progressBar.setString(num + "%"); 
	}
}
