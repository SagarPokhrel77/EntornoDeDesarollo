package resources;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Interfaz5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTres;
	private JTextField txtUno_1;
	private JTextField txtCuatro;
	private JTextField txtCinco;
	private JTextField txtUno;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz5 frame = new Interfaz5();
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
	public Interfaz5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtTres = new JTextField();
		txtTres.setText("Tres");
		txtTres.setHorizontalAlignment(SwingConstants.CENTER);
		txtTres.setColumns(10);
		txtTres.setBounds(295, 0, 131, 123);
		contentPane.add(txtTres);

		txtUno_1 = new JTextField();
		txtUno_1.setText("Dos");
		txtUno_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtUno_1.setColumns(10);
		txtUno_1.setBounds(151, 0, 132, 123);
		contentPane.add(txtUno_1);

		txtCuatro = new JTextField();
		txtCuatro.setText("Cuatro");
		txtCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		txtCuatro.setColumns(10);
		txtCuatro.setBounds(0, 130, 141, 123);
		contentPane.add(txtCuatro);

		txtCinco = new JTextField();
		txtCinco.setText("Cinco");
		txtCinco.setHorizontalAlignment(SwingConstants.CENTER);
		txtCinco.setColumns(10);
		txtCinco.setBounds(151, 130, 132, 123);
		contentPane.add(txtCinco);

		txtUno = new JTextField();
		txtUno.setText("Uno");
		txtUno.setHorizontalAlignment(SwingConstants.CENTER);
		txtUno.setColumns(10);
		txtUno.setBounds(0, 0, 132, 123);
		contentPane.add(txtUno);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(30, 47, 70, 31);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Uno");
		lblNewLabel_1.setBounds(40, 47, 45, 21);
		contentPane.add(lblNewLabel_1);
	}

}
