package TPO;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;

import asdasd.Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class menu {

	
	private  controlador c;
	
	public menu(controlador con) {
		super();
		initialize();
		this.c = con;
		
		
	}
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			controlador con=new controlador();
			public void run() {
				try {
					menu window = new menu(con);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCrearCliente = new JButton("Crear Cliente");
		btnCrearCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				crearClienteVO cl = new crearClienteVO(c);
				
				cl.frame.setVisible(true);
			}
		});
		btnCrearCliente.setBounds(0, 13, 107, 25);
		frame.getContentPane().add(btnCrearCliente);
		
		JButton btnCrearCochera = new JButton("Crear Cochera");
		btnCrearCochera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearCocheraVO cc = new crearCocheraVO(c);
				cc.frame.setVisible(true);
				
				
			}
		});
		btnCrearCochera.setBounds(0, 51, 107, 25);
		frame.getContentPane().add(btnCrearCochera);
		
		JButton btnCobroEventual = new JButton("Cobro Eventual");
		btnCobroEventual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cobroEventualVO cvo = new cobroEventualVO(c);
				cvo.frame.setVisible(true);
				
			}
		});
		btnCobroEventual.setBounds(147, 51, 112, 25);
		frame.getContentPane().add(btnCobroEventual);
	}
}
