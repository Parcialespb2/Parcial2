package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {
	private Integer pulgadas;
	private Integer garantia;
	private String marca;
	private Double precio;

	public Televisor(int i, String string, int pulgadas, int garantia, String marca, double precio) {
		super(i,string);
		this.pulgadas=pulgadas;
		this.garantia=garantia;
		this.marca=marca;
		this.precio=precio;
		
	}

	public Integer getPulgadas() {
		// TODO Auto-generated method stub
		
		return this.pulgadas;
	}

	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

}
