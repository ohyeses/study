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
	
	// 다른 클래스들 사이에서 정보를 주고받기 위해서는 메인메서드가 필요하다.
	// 하지만 main() 이 두 개라면 각각 따로따로 실행이 돼서 하나는 필요가 없게된다.
	// 그래서 MyPage에는 main() 를 없앤다.
	// ==> 메인이 없으니 MyPage에서 실행시켜도 실행 안됨.
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
	
	
	// MyPage의 생성자. -> 리턴타입 X
	// 생성자 매개변수 -> 로그인한 모든 정보를 모아놓은 것 MemberVO
	public MyPage(MemberVO vo) {
		
		initialize(vo); // 생성자로 받아온 MemberVO를 initialize() 한테도 넘겨준다.
		
		frame.setVisible(true); // main()에서 삭제되었던 창을 띄워주는 코드를 추가한다.
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	// initialize() -> 실제로 생성하는 공간
	// 빨간줄? initialize()에 MemberVo vo를 매개변수로 받게한다.
	private void initialize(MemberVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_id = new JLabel(vo.getId()); // vo에서 id를 가져온 값을 JLabel에 표시한다.
		lbl_id.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_id.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_id.setBounds(12, 24, 386, 54);
		panel.add(lbl_id);
		
		JLabel lbl_pw = new JLabel(vo.getPw()); // vo에서 pw를 가져온 값을 JLabel에 표시한다.
		lbl_pw.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_pw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pw.setBounds(12, 115, 386, 54);
		panel.add(lbl_pw);
		
		JLabel lbl_name = new JLabel(vo.getName()); // vo에서 name을 가져온 값을 JLabel에 표시한다.
		lbl_name.setFont(new Font("굴림", Font.PLAIN, 15));
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name.setBounds(12, 201, 386, 54);
		panel.add(lbl_name);
		
		JLabel lbl_age = new JLabel(vo.getAge() + " "); // vo 에서 age를 가져온다.
		lbl_age.setFont(new Font("굴림", Font.PLAIN, 15));			//getAge() 가 int 타입이라 String 타입으로 변환시 에러 난다. 
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);		// getAge()에 문자를 더해주면 문자가 된다. ->  숫자 + 문자 = 문자
		lbl_age.setBounds(12, 287, 386, 54);
		panel.add(lbl_age);
	}

}
