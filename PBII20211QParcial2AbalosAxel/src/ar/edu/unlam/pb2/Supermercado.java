package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles= new ArrayList<Producto>();; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas= new HashMap<Integer,Venta>(); // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		// Constructor de la clase
	}

	public void ingresarProducto(Producto nuevo) {
		productosDisponibles.add(nuevo);
		
		// Ingresa un nuevo producto		
	}
	public List<Producto> productoscomestibles() 
	{
		 List<Producto> productosComestibles= new ArrayList<Producto>();
		for(Producto daux: productosDisponibles) 
		{
			if(daux instanceof Comestible) {
				productosComestibles.add(daux);
				
			}
			
		}
		
		
		return productosComestibles;
		
		
		
	}

	public Set<Producto> getOfertaDeProductos() {
		Set<Producto> listastokeada=new HashSet<Producto>();
		
		listastokeada.addAll(productosDisponibles);
		return listastokeada;
		
		
		
		
		// Devuelve el conjunto de productos que se comercializan
	}
	
	public Integer getStock(Integer codigo) {
		Integer cantidad=0;
		for(Producto daux: productosDisponibles) 
		{
			if(daux.getId().equals(codigo)) 
			{
				
				cantidad++;
				
			}
			
		}
		
		return cantidad;
		// Devuelve la cantidad de unidades de un producto determinado
		
		
		
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		return null;
		// Verifica si un producto existe
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		return null;
		// Busca la disponibilidad de un producto
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		return null;
		// Devuelve una venta en función de su número identificatorio
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}
	

}
