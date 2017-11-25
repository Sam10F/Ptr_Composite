package es.unileon.supermercadoPrueba;

/**
 * Clase de prueba que sirve para comprobar el funcionamiento 
 * del supermercado.
 *
 * @author PRG
 * @version 1.0
 */
class PruebaSupermercado{
    public static void main(String args[]){
		
		Almacen almacen1 = new Almacen("Almacen1");
		
		almacen1.anyadir(new Producto("Lapiz", 1.0f, 4));
		almacen1.anyadir(new Producto("Carpeta", 4.9f, 4));
		almacen1.anyadir(new Producto("Cuaderno", 3.2f, 2));
		almacen1.anyadir(new Producto("Folios", 0.99f, 2));
		
		
		System.out.println(almacen1);
		System.out.println("Unidades Totales: " + almacen1.getUnidadesTotales());
		
		almacen1.eliminar("Carpeta", 2);
		almacen1.eliminar("Lapiz", 1);
		
		System.out.println(almacen1);
		System.out.println("Unidades Totales: " + almacen1.getUnidadesTotales());
		
		almacen1.buscar("Lapiz");
		almacen1.buscar("Folios");
		
		almacen1.eliminar("Lapiz", 3);
		almacen1.buscar("Lapiz");
		
		
		System.out.println("Unidades Totales: " + almacen1.getUnidadesTotales());
		System.out.println("Fin de prueba");
    }
}
