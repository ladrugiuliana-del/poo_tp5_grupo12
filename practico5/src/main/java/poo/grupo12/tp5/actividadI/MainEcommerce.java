package poo.grupo12.tp5.actividadI;

import java.util.Scanner;

public class MainEcommerce {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Usuario Usuario1 = new Usuario("100", "Santiago", "santi@mail.com");
		ManagerProducto listaProductos = new ManagerProducto();
		
		int opcion = 99;
		String prod_opcion;
		int prod_cantidad = 0;
		boolean bandera;
		
		System.out.println("Ingrese una opción: \n0. Salir del Programa \n1. Agregar un producto al carrito \n2. Mostrar el importe total del carrito \n3. Mostrar el carrito \n4. Remover un producto del carrito \n5. Vaciar el carrito" );
		
		do {
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion) {
			case 0:
				System.out.println("--- FIN DEL PROGRAMA ---");
				break;
			case 1:
				System.out.println("- - - Lista de productos - - - \nIngrese la palabra 'salir' para dejar de comprar");
				for (Producto p : listaProductos.getLista()){
					System.out.println(p.getCodigo() + " " + p.getNombre() + " " + p.getPrecio());
				}
				do {
					bandera = true;
					System.out.println("Ingrese el codigo del producto a agregar en el carrito");
				    prod_opcion = entrada.nextLine();
					for (Producto p : listaProductos.getLista()){
						if (p.getCodigo().equals(prod_opcion)){
							System.out.println("Cuantas unidades desea agregar al carrito?");
				            prod_cantidad = entrada.nextInt();
				            entrada.nextLine();
							Usuario1.agregarAlCarrito(p, prod_cantidad);
							System.out.println("Produco agregado de forma exitosa al carrito");
							bandera = false;
						}
					}
					if (bandera){
						if (!(prod_opcion.equals("") || prod_opcion.equalsIgnoreCase("salir"))){
							System.out.println("Codigo de Producto Incorrecto");
						}
					}
				} while (!(prod_opcion.equalsIgnoreCase("salir")));
				
				break;
			case 2:
				System.out.println("Total del carrito: $" + Usuario1.verTotalCarrito());				
				break;
			case 3:
				if (Usuario1.verTotalCarrito() == 0.0) {
				System.out.println("No existen productos en el carrito");
				break;
				}
				Usuario1.mostrarCarrito();
				break;
			case 4:
				String prod_borrar = "";
				bandera = true;
				if (Usuario1.verTotalCarrito() == 0.0) {
					System.out.println("No existen productos en el carrito");
					break;
				}
				System.out.println("Escriba el nombre del producto que quiere eliminar del carrito");
				Usuario1.mostrarCarrito();
				prod_borrar = entrada.nextLine();
				for (Producto p : listaProductos.getLista()) {
					if (prod_borrar.equalsIgnoreCase(p.getNombre())) {
						Usuario1.removerDelCarrito(p);
						System.out.println("Producto eliminado satisfactoriamente, Volviendo al Menu...");
						bandera = false;
					}
				}
				if (bandera) {System.out.println("El nombre ingresado no coincide con ningun elemento del carrito, Volviendo al Menu...");}
				break;
			case 5:
				System.out.println("Carrito vaciado de forma exitosa");
				Usuario1.vaciarCarrito();
			default:
				System.out.println("Opción incorrecta.");
				break;
			}
			
		} while (opcion != 0);
		
		entrada.close();
	}

}