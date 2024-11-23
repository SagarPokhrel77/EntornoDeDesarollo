package resources;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interfaz1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz1 frame = new Interfaz1();
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
	public Interfaz1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		chckbxNewCheckBox.setBounds(111, 10, 93, 21);
		contentPane.add(chckbxNewCheckBox);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(209, 10, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);

		textField = new JTextField();
		textField.setBounds(318, 11, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(418, 10, 103, 21);
		contentPane.add(rdbtnNewRadioButton);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(526, 10, 85, 21);
		contentPane.add(btnNewButton);
	}

}
