package es.unileon.supermercadoPrueba;

/**
 * Clase que representa un producto caracterizado por su nombre,
 * precio y numero de unidades almacenadas.
 *
 * @author PRG
 * @version 1.0
 */
class Producto extends Supermercado{
	
	private float precio;
	private int unidades;

	Producto(String nombre, float precio, int unidades){
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = unidades;
	}
	
	@Override
	public boolean anyadir(Producto producto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operacion añadir no soportada para un producto");
	}

	@Override
	public boolean eliminar(String producto,int numUnidades) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operacion eliminar no soportada para un producto");
	}

	@Override
	public boolean buscar(String producto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Operacion buscar no soportada para un producto");
	}

	public String toString(){
		return "\t" + nombre + ":" + precio + ":" + unidades;
	}
	
	public int getUnidades() {
		return this.unidades;
	}
	
	public void setUnidades(int unidades) {
		if(unidades < 0) {
			this.unidades = 0;
		}else {
			this.unidades = unidades;
		}
		
	}
	

}
