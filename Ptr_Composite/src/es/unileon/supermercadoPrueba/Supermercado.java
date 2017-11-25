package es.unileon.supermercadoPrueba;

/**
 * Clase que representa un supermercado caracterizado por un
 * nombre y que incluye un almacén de productos.
 *
 * @author PRG
 * @version 1.0
 */

public abstract class Supermercado{

	public String nombre;
	
	public abstract boolean anyadir(Producto producto);
	
	public abstract boolean eliminar(String producto, int numUnidades);
	
	public abstract boolean buscar(String producto); 
	
	public abstract String toString();
}
