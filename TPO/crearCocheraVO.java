package TPO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class crearCocheraVO {

	private static controlador c;
	
	public crearCocheraVO(controlador con) {
			super();
			initialize();
			this.c = con;
			
		}
	
	
	JFrame frame;
	private JTextField txt_nro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearCocheraVO window = new crearCocheraVO(c);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_nro = new JTextField();
		txt_nro.setBounds(95, 24, 116, 22);
		frame.getContentPane().add(txt_nro);
		txt_nro.setColumns(10);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txt_nro.getText());
				
				c.crearCochera(1, false, true, true);
			}
		});
		btnCrear.setBounds(167, 168, 97, 25);
		frame.getContentPane().add(btnCrear);
	}

}
