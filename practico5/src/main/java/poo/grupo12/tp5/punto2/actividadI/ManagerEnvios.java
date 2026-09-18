package poo.grupo12.tp5.punto2.actividadI;

import java.util.ArrayList;
import java.util.List;

public class ManagerEnvios {
	private List<Envio> envios;
	private List<Vehiculo> vehiculos;
	private List<RutaDiaria> rutas;
	
	public ManagerEnvios() {
        this.envios = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.rutas = new ArrayList<>();
    }
	
	public void agregarEnvio(Envio envio) {
		if (envio != null) {
            this.envios.add(envio);
        }
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculos.add(vehiculo);
        }
    }
	
	public void agregarRuta(RutaDiaria ruta) {
        if (ruta != null) {
            this.rutas.add(ruta);
        }
    }
	
	public Envio buscarEnvio(int id) {
        for (Envio e : envios) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public Vehiculo buscarVehiculo(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }
        return null;
    }


    public String obtenerInfoEnvio(int idEnvio) {
        Envio e = buscarEnvio(idEnvio);
        return (e != null) ? e.mostrarInfo() : "Envío no encontrado.";
    }


    public List<Envio> getEnvios() { return envios; }
    public List<Vehiculo> getVehiculos() { return vehiculos; }
    public List<RutaDiaria> getRutas() { return rutas; }
}

	