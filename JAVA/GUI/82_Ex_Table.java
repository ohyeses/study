import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;

public class Ex_Table {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_num;
	private JTable table;
	/**
	 * @wbp.nonvisual location=200,-1
	 */
	private final JTextPane textPane = new JTextPane();
	private JButton btn_remove;
	private JTextField txt_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex_Table window = new Ex_Table();
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
	public Ex_Table() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// 임의의 테이블 값을 생성
		String[] col = {"이름", "연락처"};
		String[][] data = {{"채수민", "010-8011-4068"},
				{"최태양", "010-1111-2222"}};
		// 만일 데이터의 내용이 문자열과 정수형이 섞여있다면 Object 형태의 배열 생성
		
		
		
		// 실제 테이블에 값을 넣어줄 DefaultTableModel 생성하기
		// DefaultTableModel(행에 들어갈 내용, 컬럼명)
		DefaultTableModel model = new DefaultTableModel(data, col);
		
		
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(-16, 21, 57, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(165, 21, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt_name = new JTextField();
		txt_name.setBounds(53, 18, 116, 21);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_num = new JTextField();
		txt_num.setColumns(10);
		txt_num.setBounds(234, 18, 116, 21);
		frame.getContentPane().add(txt_num);
		
		JButton btn_add = new JButton("\uCD94\uAC00");
		btn_add.setFont(new Font("굴림", Font.PLAIN, 11));
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트 필드에 입력된 값 가져오기
				String name = txt_name.getText();
				String num = txt_num.getText();
				
				// 텍스트 필드가 빈칸일 때 경고창 띄워주기 ->  JOptionPane
				if (name.equals("") || num.equals("")) {
					JOptionPane.showMessageDialog(txt_name, "값을 입력하세요.");
					
				} else {
					// 만약에 텍스트필드에 값이 있다면 Table에 추가하기
					// getModel() :  테이블이 가지고있는 데이터를 담고 있는 객체인 테이블 모델을 리턴해주는 메소드
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					
					// 테이블의 한 행에 들어갈 내용들을 배열로 묶어 행에 추가하기
					String [] data = {name, num};//일차원으로 만드는 이유 한줄로 넣어주기 위해서.
					model.addRow(data);
					
					// 추가 이후에 텍스트 필드 빈칸으로 초기화
					txt_name.setText(null);
					txt_num.setText(null);
				}
			}
		});
		btn_add.setBounds(365, 17, 57, 23);
		frame.getContentPane().add(btn_add);
		
		
		// 테이블 생성을 위한 ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 89, 410, 203);
		frame.getContentPane().add(scrollPane);
		
		
		
		// 테이블에 값 부여하기
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		btn_remove = new JButton("\uC81C\uAC70");
		btn_remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// getSelectedRow() : 테이블에서 선택된 셀의 row값을 int형으로 반환을 해주는 메소드
				int row = table.getSelectedRow();
				
				if(row >= 0) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.removeRow(row);
				} else {
					// 선택이 안됐을 경우 경고창 띄워주기 -> 팝업 -> JOptionPane
					JOptionPane.showMessageDialog(table, "삭제할 행을 선택해주세요.");
				}
				
				System.out.println(row);
			}
		});
		btn_remove.setBounds(165, 306, 97, 23);
		frame.getContentPane().add(btn_remove);
		
		JComboBox comboBox = new JComboBox(col);
		comboBox.setBounds(12, 46, 57, 23);
		frame.getContentPane().add(comboBox);
		
		txt_search = new JTextField();
		txt_search.setBounds(81, 46, 271, 21);
		frame.getContentPane().add(txt_search);
		txt_search.setColumns(10);
		
		JButton btn_search = new JButton("\uAC80\uC0C9");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 콤보 박스의 값 알아오기
				String field = (String)comboBox.getSelectedItem();
				String search = txt_search.getText();
				
//				System.out.println("콤보박스의 선택값 : " + field);
//				System.out.println("검색창의 입력값 : " + search);
				
				// 경고창 띄우기
				if(search.equals("")) { // 검색창의 입력값이 아무런 값이 없으면
					JOptionPane.showMessageDialog(txt_search, "검색값을 입력하세요.");
				} else { // 이름만 띄워준다.
					for(int i = 0; i < table.getRowCount(); i++) { //테이블을 전체적으로 조회

						if(!search.equals(table.getValueAt(i, 0)) &&! search.equals(table.getValueAt(i, 1))) {
							DefaultTableModel model = (DefaultTableModel)table.getModel();
							model.removeRow(i);
						} else {
							
						}
					}
				}
			}
		});
		btn_search.setBounds(356, 49, 66, 23);
		frame.getContentPane().add(btn_search);

	}
}
