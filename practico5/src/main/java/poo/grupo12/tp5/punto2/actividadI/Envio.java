package poo.grupo12.tp5.punto2.actividadI;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private int id;
    private String remitente;
    private String destinatario;
    private String direccion_entrega;
    private String estado;
    private List<Paquete> paquetes;
    private String[] estados = {"GENERADO", "EN_ALMACEN", "EN_RUTA", "ENTREGADO", "DEVUELTO", "CANCELADO"};

    public Envio(int id, String remitente, String destinatario, String direccion_entrega) {
        this.id = id;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.direccion_entrega = direccion_entrega;
        this.estado = "GENERADO";
        this.paquetes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) {
        this.direccion_entrega = direccion_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
    	for (String e : estados) {
    		//Comprueba si el estado ingresado es valido
    		if(e == estado) {
    			this.estado = estado;
    			return;
    		}
    	}
    	System.out.println("El estado ingresado para el Envio " + getId() + " no es valido");
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public void agregarPaquete(Paquete p) {
        if (p != null) {
            this.paquetes.add(p);
        }
    }

    public void despachar() {
        this.estado = "EN_RUTA";
    }

    public void devolver() {
        this.estado = "DEVUELTO";
    }

    public String mostrarInfo() {
        return "ID del envío: " + id + " | Remitente: " + remitente + " | Destinatario: " + destinatario +
               " | Dirección: " + direccion_entrega + " | Estado: " + estado + " | Cantidad de paquetes: " + paquetes.size() + " | Peso del envío: " + calcularPesoTotal();
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0.0;
        for (Paquete p : paquetes) {
            pesoTotal += p.getPeso();
        }
        return pesoTotal;
    }
}
