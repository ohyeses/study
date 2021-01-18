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
	private MemberVO vo = null; // �⺻���� null�� �ʱ�ȭ. ������ �� �ְ� �������� ���ֱ�.

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
		lbl_title.setFont(new Font("����", Font.PLAIN, 20));
		lbl_title.setBounds(12, 10, 386, 43);
		panel.add(lbl_title);

		JLabel lbl_id = new JLabel("\uC544\uC774\uB514");
		lbl_id.setFont(new Font("���� ���", Font.PLAIN, 18));
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setBounds(12, 77, 128, 43);
		panel.add(lbl_id);

		JLabel lbl_pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lbl_pw.setFont(new Font("���� ���", Font.PLAIN, 18));
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
				// txt_id, txt_pw �� �ִ� ���� ������� id �� ����ش�.
				String id = txt_id.getText();
				String pw = txt_pw.getText();

				// �α��� �����ϴ� ����� ������ �ִ� DAO �� �ҷ��ͼ� �����Ѵ�.
				DAO dao = new DAO();

				// login() ����Ÿ���� MemberVO�� �޾��ش�.
				vo = dao.login(new MemberVO(id, pw)); // id�� pw�� ��Ƽ� MemberVO ��ü ������ ���� login()�� �Ű������� �Ѱ��� vo�� ����Ѵ�.

				// �α��� ���� �� �ؽ�Ʈ �ʵ带 �����ش�.
				txt_id.setText(""); // null ������ �ȵȴ�.
				txt_pw.setText("");

				// ȸ�������ý��� �̸��� �ٲ��ش�.
				// id + ȯ���մϴٷ� �ٲ��ش�.
				// id �� ���� �������ֳ�? MemberVO

				// �� ���� ���̵�, ��й�ȣ���� �α��� ������ �������.
				// NullPointException -> dao.login()�� �ߴµ� vo �� ä������ �ʾҴ�.
				if (vo != null) { // vo�� null�� �ƴҶ��� ����Ѵ�.
					lbl_title.setText(vo.getId() + "�� ȯ���մϴ�!"); // id�� VO�� ���� ������ ������ �ؽ�Ʈ�� �����ش�.
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
			// ���������� ��ư�� Ŭ������ �� ��Ÿ���� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {
				// �α����� ������ ������ MyPage�� �̵��ϴ� ���
				// btn_login �����ʿ��� MemberVo vo ��ü�� ���������� ����� -> �α��������� ����ִ� vo ������ ���������� ��������
				// ������Ѵ�.

				// vo�� ������� �ʴٸ� ���������� ��ư�� Ŭ������ �� MyPage�� �̵��ϱ�.
				if (vo != null) { // vo�� null�� �ƴϾ��� ���� �̵�

					// �α����� ������ ������ ������������ �̵�
					MyPage myPage = new MyPage(vo);

					// ����â �ݾ��ֱ�
					frame.dispose();
				}
			}
		});
		btn_mypage.setBounds(12, 358, 386, 43);
		panel.add(btn_mypage);
	}
}
