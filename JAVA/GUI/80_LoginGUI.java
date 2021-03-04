package Ex_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField txt_id;
	
	//임의의 아이디와 패스워드를 준다.
	private String id2 = "test";
	private String pw3 = "asdf";
	private JPasswordField txt_pw;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778 ");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 10, 110, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(67, 62, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt_id = new JTextField();
		txt_id.setBounds(130, 59, 232, 21);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 :");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(67, 93, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = txt_id.getText(); // 가지고 온 값을 변수에 저장.
				String pw = txt_pw.getText(); // 가지고 온 값을 변수에 저장.
				
				
				// 로그인 버튼을눌렀을때 패스워드와 일치하는지 일치하지 않은지 콘솔로 찍기.
				// 로그인이 실패하셨습니다. 로그인이 성공하셨습니다.
				
				if(id.equals(id2) && pw.equals(pw3)) {
					System.out.println("로그인 성공!");
				}else {
					System.out.println("로그인 실패..");
				}
			
				
				
			}
		});
		btn_login.setFont(new Font("굴림", Font.BOLD, 12));
		btn_login.setBackground(SystemColor.activeCaption);
		btn_login.setForeground(Color.WHITE);
		btn_login.setBounds(172, 155, 97, 23);
		frame.getContentPane().add(btn_login);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(130, 90, 232, 18);
		frame.getContentPane().add(txt_pw);
	}
}
