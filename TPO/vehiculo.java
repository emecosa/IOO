package TPO;

	public class vehiculo {

	String patente;
	tipoVechiculo tipo;
	
	
	
	public vehiculo (String patente,tipoVechiculo tipo )
	{
	
		this.patente = patente;
		this.tipo = tipo;
	}
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public tipoVechiculo getTipo() {
		return tipo;
	}
	public void setTipo(tipoVechiculo tipo) {
		this.tipo = tipo;
	}

	
	
}
