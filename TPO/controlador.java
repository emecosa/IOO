package TPO;

import java.util.ArrayList;
import java.sql.Date;

public class controlador {
	
	ArrayList<cliente> arrayCliente ;
	ArrayList<cochera> arrayCocheras;
	ArrayList<vehiculoEventual> arrayVehiculosEventuales;
	
	tarifa tarifa ;
	
	
	public controlador () {
		
		super ();
		// inicializo estructuras
		this.arrayCliente = new ArrayList<cliente>();
		this.arrayCocheras = new ArrayList<cochera>();
		this.arrayVehiculosEventuales = new ArrayList<vehiculoEventual>();
		
		tarifa = new tarifa(150, 1500);
		
		
		
		
	}
	
	// llamo a la funcion calcular fecha dentro de vehiculo eventual que me devuelve la resta entre hora de salida y de entrada.
	
	public float cobroEventual (vehiculoEventual ve) {
		
		float r= 0;
		
		for ( vehiculoEventual a : arrayVehiculosEventuales) {
			
			if ( a.patente.equals (ve.patente))
			{
				r = ve.calcularFecha();
				break;
			}
			
			else
				return 0; // no lo encontro
			
		}
		
		return r;
	}
	
	public void crearCochera (int numero, boolean suv, boolean auto, boolean estado) {
				
		
		arrayCocheras.add(new cochera(numero, suv, auto, estado) );
		
	}

	public void crearCliente (String nombre, String apellido, String dni, Date fechaAlta) {
		
		arrayCliente.add(new cliente ( nombre,  apellido,  dni,  fechaAlta));
	}
	
	
	// Inicializacion de estructuras
	
	private void inicializarEventuales (ArrayList<vehiculoEventual> a)
	{
		vehiculoEventual ve = null;
		
		ve.setTipo(tipoVechiculo.Auto);
		ve.setPatente("AB949KK");
		ve.setHi(12);
		ve.setMi(00);
		ve.setHe(13);
		ve.setMe(00);
		
		a.add(ve);
		
		ve.setTipo(tipoVechiculo.Moto);
		ve.setPatente("A123BCD");
		ve.setHi(12);
		ve.setMi(00);
		ve.setHe(13);
		ve.setMe(30);
		
		a.add(ve);
		
		ve.setTipo(tipoVechiculo.Suv);
		ve.setPatente("AD989BS");
		ve.setHi(12);
		ve.setMi(45);
		ve.setHe(13);
		ve.setMe(15);
		
		a.add(ve);
		
	}
}
