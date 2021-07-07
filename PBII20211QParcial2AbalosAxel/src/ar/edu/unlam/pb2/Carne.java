package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {
	private String fecha1;
	private String fecha2;
	private Double kilos;
	private String nombre;
	private Double precio;

	public Carne(int i, String string, String fecha1, String fecha2, double kilos, String nombre, double precio) {
		super(i,string);
		this.fecha1=fecha1;
		this.fecha2=fecha2;
		this.kilos=kilos;
		this.nombre=nombre ;
				this.precio=precio;
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fecha1;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fecha2;
	}

	public double getKilos() {
		// TODO Auto-generated method stub
		return this.kilos;
	}

}
