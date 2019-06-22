package TPO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class crearClienteVO {
	
	cliente clien ;

	
	
	JFrame frame;
	private JTextField txt_nombre;
	private JTextField txt_apellido;
	private JTextField txt_dni;
	private JTextField txt_fecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearClienteVO window = new crearClienteVO(c);
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
	private static controlador c;
	
	public crearClienteVO(controlador con) {
		initialize();
		this.c = con;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_nombre = new JTextField();
		txt_nombre.setBounds(141, 13, 116, 22);
		frame.getContentPane().add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_apellido = new JTextField();
		txt_apellido.setBounds(141, 48, 116, 22);
		frame.getContentPane().add(txt_apellido);
		txt_apellido.setColumns(10);
		
		txt_dni = new JTextField();
		txt_dni.setBounds(141, 83, 116, 22);
		frame.getContentPane().add(txt_dni);
		txt_dni.setColumns(10);
		
		txt_fecha = new JTextField();
		txt_fecha.setBounds(141, 118, 116, 22);
		frame.getContentPane().add(txt_fecha);
		txt_fecha.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(57, 16, 56, 16);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("apellido");
		lblApellido.setBounds(57, 51, 56, 16);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblDni = new JLabel("dni");
		lblDni.setBounds(57, 86, 56, 16);
		frame.getContentPane().add(lblDni);
		
		JLabel lblNewLabel = new JLabel("fecha");
		lblNewLabel.setBounds(57, 121, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			
				
				//c.crearCliente(txt_nombre.getText(), txt_apellido.getText(), txt_dni.getText(), );
				
				
			}
		});
		btnCrear.setBounds(226, 224, 97, 25);
		frame.getContentPane().add(btnCrear);
	}
}
