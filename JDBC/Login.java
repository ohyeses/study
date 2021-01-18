package JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private MemberVO vo = null; // 기본값인 null로 초기화. 참조할 수 있게 전역으로 빼주기.

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 468);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_title = new JLabel("\uD68C\uC6D0\uAD00\uB9AC\uC2DC\uC2A4\uD15C");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl_title.setBounds(12, 10, 386, 43);
		panel.add(lbl_title);

		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setBounds(12, 77, 128, 43);
		panel.add(lbl_id);

		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lbl_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pw.setBounds(12, 147, 128, 43);
		panel.add(lbl_pw);

		txt_id = new JTextField();
		txt_id.setBounds(152, 77, 212, 55);
		panel.add(txt_id);
		txt_id.setColumns(10);

		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(152, 147, 212, 55);
		panel.add(txt_pw);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// txt_id, txt_pw 에 있는 값을 가지고와 id 에 담아준다.
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				// 로그인 수행하는 기능을 가지고 있는 DAO 를 불러와서 생성한다.
				DAO dao = new DAO();

				// login() 리턴타입인 MemberVO로 받아준다.
				vo = dao.login(new MemberVO(id, pw)); // id와 pw만 담아서 MemberVO 객체 생성한 값을 login()의 매개변수로 넘겨줘 vo에 담게한다.

				// 로그인 성공 후 텍스트 필드를 지워준다.
				txt_id.setText(""); // null 넣으면 안된다.
				txt_pw.setText("");

				// 회원관리시스템 이름을 바꿔준다.
				// id + 환영합니다로 바꿔준다.
				// id 값 누가 가지고있나? MemberVO

				// ※ 없는 아이디, 비밀번호에서 로그인 누르면 에러뜬다.
				// NullPointException -> dao.login()을 했는데 vo 가 채워지지 않았다.
				if (vo != null) { // vo가 null이 아닐때만 출력한다.
					lbl_title.setText(vo.getId() + "님 환영합니다!"); // id를 VO로 부터 가져온 값으로 텍스트를 덮어준다.
				}

			}
		});
		btn_login.setBounds(12, 231, 386, 43);
		panel.add(btn_login);

		JButton btn_all = new JButton("\uBAA8\uB4E0\uD68C\uC6D0\uC815\uBCF4\uBCF4\uAE30");
		btn_all.setBounds(12, 297, 386, 43);
		panel.add(btn_all);

		JButton btn_mypage = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		btn_mypage.addActionListener(new ActionListener() {
			// 마이페이지 버튼을 클릭했을 때 나타나는 이벤트
			public void actionPerformed(ActionEvent e) {
				// 로그인한 정보를 가지고 MyPage로 이동하는 기능
				// btn_login 리스너에서 MemberVo vo 객체가 지역변수로 선언됨 -> 로그인정보가 담겨있는 vo 정보를 가져오려면 전역으로
				// 빼줘야한다.

				// vo가 비어있지 않다면 마이페이지 버튼을 클릭했을 때 MyPage로 이동하기.
				if (vo != null) { // vo가 null이 아니었을 때만 이동

					// 로그인한 정보를 가지고 마이페이지로 이동
					MyPage myPage = new MyPage(vo);

					// 현재창 닫아주기
					frame.dispose();
				}
			}
		});
		btn_mypage.setBounds(12, 358, 386, 43);
		panel.add(btn_mypage);
	}
}
