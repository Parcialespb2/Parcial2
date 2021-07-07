package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {
	private String talle;
	private String marca;
	private String color;
	private double precio;
	

	public Zapatilla(Integer id, String descripcion, String talle, String marca, String color, double precio) {
		super(id, descripcion);
		this.talle=talle;
		
		this.marca=marca;
		this.color=color;
		this.precio=precio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

}
