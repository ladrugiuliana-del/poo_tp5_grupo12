package poo.grupo12.tp5.punto2.actividadI;

import java.util.Date;

public class CLASEDEPRUEBAPRIMITIVA {

	public static void main(String[] args) {
		// ESTA ES UNA CLASE EXCLUSIVAMENTE PARA TESTEAR LAS CLASES DEL DIAGRAMA - NO ES IMPORTANTE/SE PUEDE BORRAR

		Paquete paquete1 = new Paquete(10, "Un paquete de prueba", 15.0, 20.0 );
		Envio envio1 = new Envio(100, "Santiago", "Alberto", "Mi casa padre");
		Vehiculo vehiculo1 = new Vehiculo("AF 205 948", 570.0 , 1050.0);
		RutaDiaria ruta1 = new RutaDiaria( new Date(), vehiculo1);
		
		System.out.println(envio1.mostrarInfo());
		
		envio1.agregarPaquete(paquete1);
		envio1.despachar();
		
		System.out.println(envio1.mostrarInfo());
		
		ruta1.asignarRuta(envio1);
		
		System.out.println(envio1.mostrarInfo());
	}

}
