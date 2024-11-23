package resources;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Interfaz3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz3 frame = new Interfaz3();
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
	public Interfaz3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(64, 14, 34, 13);
		contentPane.add(usuario);

		textField = new JTextField();
		textField.setBounds(64, 37, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(75, 92, 52, 13);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(64, 115, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Accept");
		btnNewButton.setBounds(218, 154, 63, 21);
		contentPane.add(btnNewButton);
	}

}
