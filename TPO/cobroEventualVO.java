package TPO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class cobroEventualVO {

	private static controlador c;
	JFrame frame;
	private JTextField txt_patente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cobroEventualVO window = new cobroEventualVO(c);
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
	public cobroEventualVO(controlador con) {
		initialize();
		this.c = con;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatente = new JLabel("Patente: ");
		lblPatente.setBounds(12, 13, 56, 16);
		frame.getContentPane().add(lblPatente);
		
		txt_patente = new JTextField();
		txt_patente.setBounds(62, 10, 116, 22);
		frame.getContentPane().add(txt_patente);
		txt_patente.setColumns(10);
		
		JTextArea txt_cobro = new JTextArea();
		txt_cobro.setBounds(280, 10, 64, 34);
		frame.getContentPane().add(txt_cobro);
		
		JButton btnCobrar = new JButton("Cobrar");
		btnCobrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				vehiculoEventual veAux = null;
				
				veAux.setPatente(txt_patente.getText());
				
				
				String s= Float.toString(c.cobroEventual(veAux));
				
				txt_cobro.setText(s);
			}
		});
		btnCobrar.setBounds(74, 130, 97, 25);
		frame.getContentPane().add(btnCobrar);
		
		JLabel lblACobrar = new JLabel("A cobrar:");
		lblACobrar.setBounds(212, 13, 56, 16);
		frame.getContentPane().add(lblACobrar);
		
	
	}
}
