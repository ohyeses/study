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
					// ���� â�� ����ֱ� ���� ��ɾ� -> true(��������!)
					// false(�Ⱥ��δ�)
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
		// â�� ������� ��ġ�� �����ϴ� �κ�(x��, y��, �ʺ�, ����)
		frame.setBounds(500, 500, 486, 425);
		// â �ݱ� �ɼ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������ �Ѱ��ֱ�
				// 1. �Ѿ�� ���� �������� ��ü�� �����Ѵ�. -> join gui �� ��ü �Ѱ��ֱ�
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
		btn_join.setFont(new Font("����", Font.PLAIN, 20));
		btn_join.setBounds(261, 103, 141, 116);
		frame.getContentPane().add(btn_join);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose(); // ���� ����� �ִ� Main ȭ�� ����
				LoginGUI logingui = new LoginGUI();
				logingui.main(null);

			}
		});

		btn_login.setBackground(Color.ORANGE);
		btn_login.setFont(new Font("����", Font.PLAIN, 20));
		btn_login.setBounds(57, 104, 141, 116);
		frame.getContentPane().add(btn_login);

		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 21, 239, 53);
		frame.getContentPane().add(lblNewLabel);
	}
}
