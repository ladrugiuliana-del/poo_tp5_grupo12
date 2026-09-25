package ar.edu.unju.fi.poo.practico5.actividad2.model;

public class Vehiculo {
    private String patente;
    private double capacidad_kg;
    private double capacidad_volumen;

    public Vehiculo(String patente, double capacidad_kg, double capacidad_volumen) {
        this.patente = patente;
        this.capacidad_kg = capacidad_kg;
        this.capacidad_volumen = capacidad_volumen;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCapacidad_kg() {
        return capacidad_kg;
    }

    public void setCapacidad_kg(double capacidad_kg) {
        this.capacidad_kg = capacidad_kg;
    }

    public double getCapacidad_volumen() {
        return capacidad_volumen;
    }

    public void setCapacidad_volumen(double capacidad_volumen) {
        this.capacidad_volumen = capacidad_volumen;
    }
}
