package TPO;

import java.sql.Date;

public class cliente {
	
	String nombre , apellido , dni;
	Date fechaAlta;
	vehiculoCliente vehiculos;
	
	public cliente (String nombre, String apellido, String dni, Date fechaAlta)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
	}
	
	/*public void agregarVechiculo (vehiculoCliente vehiculos , String patente , tipoVechiculo ve) {
				
		this.vehiculos = vehiculos;
		this.
		
	}*/
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public vehiculoCliente getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(vehiculoCliente vehiculos) {
		this.vehiculos = vehiculos;
	}
	

}
