package es.unileon.supermercadoPrueba;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un almacen de productos de capacidad
 * limitada.
 *
 * @author PRG
 * @version 1.0
 */
class Almacen extends Supermercado{
	
	final int MAXIMO_PROD = 10;
	
	private List<Producto> listaProductos;
	
	Almacen(String nombre){
		this.nombre = nombre;
		listaProductos = new ArrayList<Producto>();
	}

	@Override
	public boolean anyadir(Producto producto) {
		// TODO Auto-generated method stub
		if(getUnidadesTotales() + producto.getUnidades() > MAXIMO_PROD) {
			System.out.println("No puedes añadir mas de " + MAXIMO_PROD + " productos al almacen, ya tienes " + getUnidadesTotales());
			return false;
		}else {
			return this.listaProductos.add(producto);
		}
	}

	@Override
	public boolean eliminar(String producto, int numUnidades) {
		// TODO Auto-generated method stub
		for(Producto p : this.listaProductos) {
			if(p.nombre == producto) {
				p.setUnidades(p.getUnidades()-numUnidades);
			}
		}
		
		return this.listaProductos.remove(producto);
	}

	@Override
	public boolean buscar(String producto) {
		// TODO Auto-generated method stub
		for(Producto p : this.listaProductos) {
			if(p.nombre == producto && p.getUnidades() > 0) {
				System.out.println(p);
				return true;
			}
		}
		
		System.out.println("No se dispone del producto solicitado");
		return false;
		
	}
	
	
	public int getUnidadesTotales(){
		int result = 0;
		for(Producto p : this.listaProductos) {
			result += p.getUnidades();
		}
		return result;
	}
	
	public String toString(){
		StringBuffer salida = new StringBuffer();
		salida.append("---------");
		salida.append("PRODUCTOS");
		salida.append("---------\n");
		for (int i=0; i < listaProductos.size(); i++){
			salida.append(listaProductos.get(i).toString()+"\n");
		}
		return salida.toString();
	}

	
}
