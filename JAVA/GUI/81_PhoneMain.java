package Phone;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhoneMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneMain window = new PhoneMain();
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
	public PhoneMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// JLabel �̹��� �����ϱ�
		// ImageIcon Ŭ���� ��� -> import �ʿ�
		// ImageIcon -> �̹����� ������ �� �ִ� ����

		ImageIcon img = new ImageIcon("img/Main.jpg");

		// �̹��� ũ�� �����ϱ�, import �ʿ�
		Image img2 = img.getImage();
		Image image = img2.getScaledInstance(466, 292, Image.SCALE_SMOOTH);

		ImageIcon result = new ImageIcon(image);

		JLabel lbl_Img = new JLabel(result);
		lbl_Img.setBounds(53, 25, 466, 292);
		frame.getContentPane().add(lbl_Img);

		JButton btn_reg = new JButton("\uC5F0\uB77D\uCC98 \uB4F1\uB85D");
		btn_reg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose(); // ���� ����� �ִ� Main ȭ�� ����
				PhoneDial phonedial = new PhoneDial();
				phonedial.main(null);
			}
		});
		btn_reg.setFont(new Font("����", Font.BOLD, 20));
		btn_reg.setBounds(53, 327, 184, 67);
		frame.getContentPane().add(btn_reg);

		JButton btnNewButton_1 = new JButton("\uC5F0\uB77D\uCC98 \uBCF4\uAE30");
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_1.setBounds(335, 327, 184, 67);
		frame.getContentPane().add(btnNewButton_1);

	}
}
