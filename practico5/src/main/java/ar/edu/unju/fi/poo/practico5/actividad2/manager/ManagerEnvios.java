package ar.edu.unju.fi.poo.practico5.actividad2.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.practico5.actividad2.model.Envio;
import ar.edu.unju.fi.poo.practico5.actividad2.model.RutaDiaria;
import ar.edu.unju.fi.poo.practico5.actividad2.model.Vehiculo;

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

	