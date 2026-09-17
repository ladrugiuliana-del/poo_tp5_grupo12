package poo.grupo12.tp5.actividadI;

import java.util.Scanner;

public class MainEcommerce {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Usuario Usuario1 = new Usuario("100", "Santiago", "santi@mail.com");
		Producto Leche = new Producto("100", "Leche", 2500.0, true);
		
		int opcion = 99;
		
		System.out.println("Ingrese una opción: \n0. Salir del Programa \n1. Agregar un producto al carrito \n2. Mostrar el importe total del carrito \n3. Mostrar el carrito \n4. Remover un producto del carrito \n5. Vaciar el carrito" );
		
		do {
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("--- FIN DEL PROGRAMA ---");
				break;
			case 1:
				System.out.println("Buscando Productos");
				Usuario1.agregarAlCarrito(Leche, 2);
				break;
			case 2:
				System.out.println("Total del carrito: $" + Usuario1.verTotalCarrito());				
				break;
			case 3:
				Usuario1.mostrarCarrito();
				break;
			case 4:
				System.out.println("Removiendo un producto del carrito");
				Usuario1.removerDelCarrito(Leche);
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
