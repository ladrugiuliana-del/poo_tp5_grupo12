package poo.grupo12.tp5.punto2.actividadI;

public class Paquete {
    private int codigo;
    private String descripcion;
    private double peso;
    private double volumen;

    public Paquete(int codigo, String descripcion, double peso, double volumen) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.volumen = volumen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
