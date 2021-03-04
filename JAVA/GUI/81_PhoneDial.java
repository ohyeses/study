package Phone;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PhoneDial {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_age;
	private JTextField txt_number;
	
	ArrayList<InfoVO> list = new ArrayList<>(); 
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneDial window = new PhoneDial();
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
	public PhoneDial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC5F0\uB77D\uCC98 \uB4F1\uB85D");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(24, 10, 148, 39);
		frame.getContentPane().add(lblNewLabel);
		
		
		ImageIcon img = new ImageIcon("img/phone.jpg");
		Image img2 = img.getImage();
		Image image = img2.getScaledInstance(240, 180, Image.SCALE_SMOOTH);
		
		ImageIcon result = new ImageIcon(image);
		
		JLabel lbl_phone_img = new JLabel(result);
		lbl_phone_img.setBounds(34, 71, 240, 180);
		frame.getContentPane().add(lbl_phone_img);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984 :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(276, 73, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uB098\uC774 :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(276, 137, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uC5F0\uB77D\uCC98 :");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(276, 208, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txt_name = new JTextField();
		txt_name.setBounds(337, 70, 186, 21);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_age = new JTextField();
		txt_age.setBounds(337, 134, 186, 21);
		frame.getContentPane().add(txt_age);
		txt_age.setColumns(10);
		
		txt_number = new JTextField();
		txt_number.setColumns(10);
		txt_number.setBounds(337, 205, 186, 21);
		frame.getContentPane().add(txt_number);
		
		JButton btn_save = new JButton("\uC800\uC7A5");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txt_name.getText(); // 가지고 온 값을 변수에 저장.
				int age = Integer.parseInt(txt_age.getText()); // 가지고 온 값을 변수에 저장.
				String number = txt_number.getText(); // 가지고 온 값을 변수에 저장.
				
//				System.out.println("이름 : " + id);
//				System.out.println("나이 : " + age);
//				System.out.println("연락처 : " + number);
				
				InfoVO info = new InfoVO(name, age, number);
				
				list.add(info);
				
				for (int i = 0; i< list.size(); i++) {
					System.out.println("이름 : " + list.get(i).getName());
					System.out.println("나이 : " + list.get(i).getAge());
					System.out.println("연락처 : " + list.get(i).getNumber());
				}
				
				
			}
		});
		btn_save.setBounds(337, 260, 97, 23);
		frame.getContentPane().add(btn_save);
		
		JButton btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_name.setText(null);
				txt_age.setText(null);
				txt_number.setText(null);
			}
		});
		btn_cancel.setBounds(426, 260, 97, 23);
		frame.getContentPane().add(btn_cancel);
	}
}
