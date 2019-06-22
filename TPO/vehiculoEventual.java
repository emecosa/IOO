package TPO;

public class vehiculoEventual extends vehiculo{
	
	int hi,mi,he,me; // hora ingreso, minuto ingreso , hora egreso, minuto egreso
	

	public vehiculoEventual (String patente,tipoVechiculo tipo, int hi, int mi, int he,int me  ) {
		
		super (patente,tipo);
		this.hi = hi;
		this.mi = mi;
		this.he = he;
		this.me = me;
		
	}


	public float calcularFecha ()
	{
	
		float horas=0, minutos=0;
		
		horas = this.he-this.hi;
		minutos= this.me - this.mi;
		
		if (minutos < 0)
		{
			minutos = minutos *-1;
		}
		
		minutos = minutos / 100 ; 
		
		horas = horas + minutos;
		
		return horas;
	}
	
	public double calcularImporteEventual ( tarifa t )
	{
		double r=0;
		
		if ( this.tipo == this.tipo.Auto )
		{
			r = t.precioHora * this.calcularFecha()* 2.0;
		}
		
		if ( this.tipo == this.tipo.Moto )
		{
			r = t.precioHora * this.calcularFecha()* 1.8;
		}
		
		if ( this.tipo == this.tipo.Suv )
		{
			r = t.precioHora * this.calcularFecha() * 1.2;
		}
		
		
		return r;
	}
	
	
	public int getHi() {
		return hi;
	}

	public void setHi(int hi) {
		this.hi = hi;
	}

	public int getMi() {
		return mi;
	}

	public void setMi(int mi) {
		this.mi = mi;
	}

	public int getHe() {
		return he;
	}

	public void setHe(int he) {
		this.he = he;
	}

	public int getMe() {
		return me;
	}

	public void setMe(int me) {
		this.me = me;
	}
	

}
