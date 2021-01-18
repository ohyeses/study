package JDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MyPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	// �ٸ� Ŭ������ ���̿��� ������ �ְ�ޱ� ���ؼ��� ���θ޼��尡 �ʿ��ϴ�.
	// ������ main() �� �� ����� ���� ���ε��� ������ �ż� �ϳ��� �ʿ䰡 ���Եȴ�.
	// �׷��� MyPage���� main() �� ���ش�.
	// ==> ������ ������ MyPage���� ������ѵ� ���� �ȵ�.
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MyPage window = new MyPage();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	
	
	// MyPage�� ������. -> ����Ÿ�� X
	// ������ �Ű����� -> �α����� ��� ������ ��Ƴ��� �� MemberVO
	public MyPage(MemberVO vo) {
		
		initialize(vo); // �����ڷ� �޾ƿ� MemberVO�� initialize() ���׵� �Ѱ��ش�.
		
		frame.setVisible(true); // main()���� �����Ǿ��� â�� ����ִ� �ڵ带 �߰��Ѵ�.
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	// initialize() -> ������ �����ϴ� ����
	// ������? initialize()�� MemberVo vo�� �Ű������� �ް��Ѵ�.
	private void initialize(MemberVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_id = new JLabel(vo.getId()); // vo���� id�� ������ ���� JLabel�� ǥ���Ѵ�.
		lbl_id.setFont(new Font("����", Font.PLAIN, 15));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(12, 24, 386, 54);
		panel.add(lbl_id);
		
		JLabel lbl_pw = new JLabel(vo.getPw()); // vo���� pw�� ������ ���� JLabel�� ǥ���Ѵ�.
		lbl_pw.setFont(new Font("����", Font.PLAIN, 15));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(12, 115, 386, 54);
		panel.add(lbl_pw);
		
		JLabel lbl_name = new JLabel(vo.getName()); // vo���� name�� ������ ���� JLabel�� ǥ���Ѵ�.
		lbl_name.setFont(new Font("����", Font.PLAIN, 15));
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(12, 201, 386, 54);
		panel.add(lbl_name);
		
		JLabel lbl_age = new JLabel(vo.getAge() + " "); // vo ���� age�� �����´�.
		lbl_age.setFont(new Font("����", Font.PLAIN, 15));			//getAge() �� int Ÿ���̶� String Ÿ������ ��ȯ�� ���� ����. 
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);		// getAge()�� ���ڸ� �����ָ� ���ڰ� �ȴ�. ->  ���� + ���� = ����
		lbl_age.setBounds(12, 287, 386, 54);
		panel.add(lbl_age);
	}

}
