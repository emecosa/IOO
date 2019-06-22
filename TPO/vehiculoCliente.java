package TPO;

public class vehiculoCliente extends vehiculo{

	String marca,modelo;
	int nroCochera;
	
	public vehiculoCliente ( String patente,tipoVechiculo tipo , String marca, String modelo, int nroCochera ) {
		
		super (patente,tipo);
		this.marca = marca;
		this.modelo = modelo;
		this.nroCochera = nroCochera;
		
		
	}
}
