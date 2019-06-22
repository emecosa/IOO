package TPO;

public class cochera {

	int numero;
	boolean suv,auto,estado; //revisar estos boolean si no se puede hacer con enum
	
	
	public cochera (int numero, boolean suv, boolean auto, boolean estado) {
		
		this.numero = numero;
		this.estado = estado;
		this.suv = suv;
		this.auto = auto;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public boolean isSuv() {
		return suv;
	}


	public void setSuv(boolean suv) {
		this.suv = suv;
	}


	public boolean isAuto() {
		return auto;
	}


	public void setAuto(boolean auto) {
		this.auto = auto;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
}
