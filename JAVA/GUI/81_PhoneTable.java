package Phone;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PhoneTable {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneTable window = new PhoneTable();
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
	public PhoneTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		// �� ó�� ������� frame
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//table�� �� ���� �����
		String [] col = {"�̸�", "����", "����ó"};
		Object[][] data = {{"ä����", 25, "010-1111-1111"},
				{"���¾�", 22, "010-2222-2222"}};//2���� �迭
		
		
		// JScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 410, 187);
		frame.getContentPane().add(scrollPane);
		
		// Jtable
		table = new JTable(data, col);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"1", "\uCC44\uC218\uBBFC", new Integer(25), "010-1111-1111"},
//			},
//			new String[] {
//				"\uC21C\uBC88", "\uC774\uB984", "\uB098\uC774", "\uC5F0\uB77D\uCC98"
//			}
//		));
		scrollPane.setViewportView(table);
	}
}
