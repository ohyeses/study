package Ex_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JoinGUI {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_id;
	private JTextField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinGUI window = new JoinGUI();
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
	public JoinGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림체", Font.PLAIN, 22));
		lblNewLabel.setBounds(100, 20, 231, 44);
		frame.getContentPane().add(lblNewLabel);
		
		txt_name = new JTextField();
		txt_name.setBounds(143, 158, 202, 29);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_id = new JTextField();
		txt_id.setColumns(10);
		txt_id.setBounds(143, 97, 202, 29);
		frame.getContentPane().add(txt_id);
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(143, 217, 202, 29);
		frame.getContentPane().add(txt_pw);
		
		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(53, 161, 78, 22);
		frame.getContentPane().add(lbl_name);
		
		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setBounds(53, 104, 78, 22);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_pw = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lbl_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pw.setBounds(53, 220, 78, 22);
		frame.getContentPane().add(lbl_pw);
		
		JButton btn_join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_id.getText(); // 가지고 온 값을 변수에 저장.
				String name = txt_name.getText(); // 가지고 온 값을 변수에 저장.
				String pw = txt_pw.getText(); // 가지고 온 값을 변수에 저장.
				
				System.out.println("아이디 : " + id);
				System.out.println("이름 : " + name);
				System.out.println("비밀번호 : " + pw);
				// 현재 띄워져 있는 frame을 닫아주는 명령어!
				frame.dispose(); //창을 닫겠다.
				
				
				// 넘어가고 싶은 화면의 객체를 만들어준 다음,
				// frame을 띄워주는 main() 부터 실행한다
				Main m = new Main();
				m.main(null);
				

				
				
			}
		});
		
//		btn_join.addAncestorListener(listener);
		
		btn_join.setBounds(140, 272, 142, 34);
		frame.getContentPane().add(btn_join);
	}
}
