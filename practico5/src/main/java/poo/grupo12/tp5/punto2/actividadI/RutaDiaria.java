package poo.grupo12.tp5.punto2.actividadI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RutaDiaria {
    private Date fecha;
    private Vehiculo vehiculo;
    private List<Envio> envios;

    public RutaDiaria(Date fecha, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.vehiculo = vehiculo;
        this.envios = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0.0;
        if (envios != null) {
            for (Envio e : envios) {
                pesoTotal += e.calcularPesoTotal();
            }
        }
        return pesoTotal;
    }

    public void asignarRuta(Envio e) {
        if (e == null) {
            System.out.println("El envío proporcionado no es válido.");
            return;
        }

        if (e.getPaquetes() == null || e.getPaquetes().isEmpty()) {
            System.out.println("No se puede asignar el envío " + e.getId() + ": no contiene paquetes.");
            return;
        }

        double pesoActual = calcularPesoTotal();
        double pesoNuevoEnvio = e.calcularPesoTotal();

        if (pesoActual + pesoNuevoEnvio > vehiculo.getCapacidad_kg()) {
            System.out.println("No se puede asignar el envío " + e.getId() + ": excede la capacidad de peso del vehículo.");
            return;
        }

        this.envios.add(e);
        e.setEstado("EN_ALMACEN");
        System.out.println("Envío " + e.getId() + " asignado correctamente a la ruta.");
    }
}
