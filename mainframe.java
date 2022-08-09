import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class mainframe extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainframe frame = new mainframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public mainframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1450, 800);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(74, 71, 530, 48);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Billing System");
		lblNewLabel.setBounds(10, 10, 499, 28);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Labour");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox.setBounds(62, 152, 93, 21);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Travel");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setBounds(62, 216, 93, 21);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Plastic");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_2.setBounds(61, 284, 93, 21);
		getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Chrome");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_3.setBounds(62, 346, 93, 21);
		getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Copper");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox_4.setBounds(62, 418, 93, 21);
		getContentPane().add(chckbxNewCheckBox_4);
		
		JTextArea txtlabour = new JTextArea();
		txtlabour.setBounds(161, 152, 214, 21);
		getContentPane().add(txtlabour);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(361, 298, 5, 22);
		getContentPane().add(textArea_1);
		
		JTextArea txttravel = new JTextArea();
		txttravel.setBounds(161, 216, 214, 27);
		getContentPane().add(txttravel);
		
		JTextArea txtplastic = new JTextArea();
		txtplastic.setBounds(160, 284, 214, 21);
		getContentPane().add(txtplastic);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(379, 453, -213, 21);
		getContentPane().add(textArea_4);
		
		JTextArea txtchrome = new JTextArea();
		txtchrome.setBounds(161, 360, 211, 21);
		getContentPane().add(txtchrome);
		
		JTextArea txtcopper = new JTextArea();
		txtcopper.setBounds(161, 431, 214, 21);
		getContentPane().add(txtcopper);
		
		JLabel lblNewLabel_1 = new JLabel("Sub Total");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(41, 483, 114, 61);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 496, 199, 44);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(56, 575, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 576, 205, 32);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(62, 645, 62, 32);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 645, 207, 48);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cost of labour");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(459, 158, 87, 13);
		getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(591, 155, 96, 19);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Cost of Travel");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(459, 222, 87, 13);
		getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(591, 219, 96, 19);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Cost of Plastic");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(459, 304, 87, 13);
		getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(591, 301, 96, 19);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Cost of Chrome");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(459, 379, 87, 16);
		getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(591, 376, 96, 19);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Cost of Copper");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(459, 439, 87, 13);
		getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(591, 434, 96, 19);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
	}
}
