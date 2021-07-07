package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {
	private Boolean frost;
	private Integer garantia;
	private String nombre;
	private Double precio;

	public Heladera(int i, String string, boolean frost, int garantia, String nombre, double precio)
	{
		// TODO Auto-generated constructor stub
		super(i,string);
		this.frost=frost;
		this.garantia=garantia;
		this.nombre=nombre;
		this.precio=precio;
		
		
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public Boolean isNoFrost() {
		// TODO Auto-generated method stub
		return this.frost;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
