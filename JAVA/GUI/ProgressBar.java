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
		
		// ProgressBar�� �����ϴ� �κ�
		// JProgressBar�� ����µ� ���η� ����� ��.
		// Vertical -> ���� /  Horizontal -> ���� 
		JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL); 
		progressBar.setBounds(24, 96, 372, 22);
		frame.getContentPane().add(progressBar);
		
		// ������ �ְ���� �� �����Ѵ�.
		int num = 70;
		
		
		// ������ ProgressBar�� ä���� ���� �����Ѵ�.
		progressBar.setStringPainted(true); // true��� ��������� 0���� ���� ������ �� �ִ�.
		progressBar.setValue(70); // value �� �ȿ��� int �����θ� �� �� �ִ�.
		// �ۼ�Ʈ�� �����ֱ� ���ؼ� �߰������� ����� ��
		progressBar.setString(num + "%"); 
	}
}
