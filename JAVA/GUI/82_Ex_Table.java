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
		
		
		// ������ ���̺� ���� ����
		String[] col = {"�̸�", "����ó"};
		String[][] data = {{"ä����", "010-8011-4068"},
				{"���¾�", "010-1111-2222"}};
		// ���� �������� ������ ���ڿ��� �������� �����ִٸ� Object ������ �迭 ����
		
		
		
		// ���� ���̺� ���� �־��� DefaultTableModel �����ϱ�
		// DefaultTableModel(�࿡ �� ����, �÷���)
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
		btn_add.setFont(new Font("����", Font.PLAIN, 11));
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// �ؽ�Ʈ �ʵ忡 �Էµ� �� ��������
				String name = txt_name.getText();
				String num = txt_num.getText();
				
				// �ؽ�Ʈ �ʵ尡 ��ĭ�� �� ���â ����ֱ� ->  JOptionPane
				if (name.equals("") || num.equals("")) {
					JOptionPane.showMessageDialog(txt_name, "���� �Է��ϼ���.");
					
				} else {
					// ���࿡ �ؽ�Ʈ�ʵ忡 ���� �ִٸ� Table�� �߰��ϱ�
					// getModel() :  ���̺��� �������ִ� �����͸� ��� �ִ� ��ü�� ���̺� ���� �������ִ� �޼ҵ�
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					
					// ���̺��� �� �࿡ �� ������� �迭�� ���� �࿡ �߰��ϱ�
					String [] data = {name, num};//���������� ����� ���� ���ٷ� �־��ֱ� ���ؼ�.
					model.addRow(data);
					
					// �߰� ���Ŀ� �ؽ�Ʈ �ʵ� ��ĭ���� �ʱ�ȭ
					txt_name.setText(null);
					txt_num.setText(null);
				}
			}
		});
		btn_add.setBounds(365, 17, 57, 23);
		frame.getContentPane().add(btn_add);
		
		
		// ���̺� ������ ���� ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 89, 410, 203);
		frame.getContentPane().add(scrollPane);
		
		
		
		// ���̺� �� �ο��ϱ�
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		btn_remove = new JButton("\uC81C\uAC70");
		btn_remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// getSelectedRow() : ���̺��� ���õ� ���� row���� int������ ��ȯ�� ���ִ� �޼ҵ�
				int row = table.getSelectedRow();
				
				if(row >= 0) {
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.removeRow(row);
				} else {
					// ������ �ȵ��� ��� ���â ����ֱ� -> �˾� -> JOptionPane
					JOptionPane.showMessageDialog(table, "������ ���� �������ּ���.");
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
				// �޺� �ڽ��� �� �˾ƿ���
				String field = (String)comboBox.getSelectedItem();
				String search = txt_search.getText();
				
//				System.out.println("�޺��ڽ��� ���ð� : " + field);
//				System.out.println("�˻�â�� �Է°� : " + search);
				
				// ���â ����
				if(search.equals("")) { // �˻�â�� �Է°��� �ƹ��� ���� ������
					JOptionPane.showMessageDialog(txt_search, "�˻����� �Է��ϼ���.");
				} else { // �̸��� ����ش�.
					for(int i = 0; i < table.getRowCount(); i++) { //���̺��� ��ü������ ��ȸ

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
