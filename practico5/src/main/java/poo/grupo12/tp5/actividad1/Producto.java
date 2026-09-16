package poo.grupo12.tp5.actividad1;


public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private boolean activo;

    public Producto(String codigo, String nombre, double precio, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;
    }

    public double getPrecio() { return precio; }
    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
}