package poo.grupo12.tp5.punto2.actividadI;

import java.util.Date;

public class MainEnvios {

	public static void main(String[] args) {
		
		
		ManagerEnvios manager = new ManagerEnvios();
		
		
		Vehiculo vehiculo1 = new Vehiculo("AD 732 XZ", 1500.0 , 3000.0);
		manager.agregarVehiculo(vehiculo1);

		
		Envio envio1 = new Envio(101, "CompraGamer S.A.", "Mauro Martinez", "Av. Belgrano 1230, San Pedro de Jujuy");
		
		
		Paquete paquete1 = new Paquete(1, "Auriculares", 3.5, 0.05);
		Paquete paquete2 = new Paquete(2, "Teclado ", 0.8, 0.01);
		
		
		envio1.agregarPaquete(paquete1);
		envio1.agregarPaquete(paquete2);
		
		
		envio1.despachar();
		manager.agregarEnvio(envio1);
		
		
		RutaDiaria ruta1 = new RutaDiaria(new Date(), vehiculo1);
		manager.agregarRuta(ruta1);
		
		
		System.out.println("- Procesando despachos del dia-");
		ruta1.asignarRuta(envio1); 
		
		
		System.out.println("\n--- Resumen del Sistema ---");
		System.out.println(manager.obtenerInfoEnvio(101));
	}
}