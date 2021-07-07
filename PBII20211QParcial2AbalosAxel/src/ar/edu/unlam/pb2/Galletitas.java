package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {
	
	private String fecha1;
	private String fecha2;
	private String marca;
	private Double precio;

	public Galletitas(int i, String string, String fecha1, String fecha2, String marca, double precio) {
		super(i,string);
		this.fecha1=fecha1;
		this.fecha2=fecha2;
		this.marca=marca;
		this.precio=precio;
		
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

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}




}
