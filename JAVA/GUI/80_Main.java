package Ex_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					// 실제 창을 띄워주기 위한 명령어 -> true(보여진다!)
					// false(안보인다)
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		// 창이 띄워지는 위치를 선정하는 부분(x축, y축, 너비, 높이)
		frame.setBounds(500, 500, 486, 425);
		// 창 닫기 옵션
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 페이지 넘겨주기
				// 1. 넘어가고 싶은 페이지의 객체를 생성한다. -> join gui 의 객체 넘겨주기
				JoinGUI joingui = new JoinGUI();
				joingui.main(null);
			}
		});
//		btn_join.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		btn_join.setBackground(Color.LIGHT_GRAY);
		btn_join.setFont(new Font("굴림", Font.PLAIN, 20));
		btn_join.setBounds(261, 103, 141, 116);
		frame.getContentPane().add(btn_join);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose(); // 현재 띄워져 있는 Main 화면 끄기
				LoginGUI logingui = new LoginGUI();
				logingui.main(null);

			}
		});

		btn_login.setBackground(Color.ORANGE);
		btn_login.setFont(new Font("굴림", Font.PLAIN, 20));
		btn_login.setBounds(57, 104, 141, 116);
		frame.getContentPane().add(btn_login);

		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 21, 239, 53);
		frame.getContentPane().add(lblNewLabel);
	}
}
