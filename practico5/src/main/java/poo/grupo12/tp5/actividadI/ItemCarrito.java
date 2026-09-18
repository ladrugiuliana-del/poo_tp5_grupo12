package poo.grupo12.tp5.actividadI;

public class ItemCarrito {
    private int id;
    private Producto producto;
    private int cantidad;

    public ItemCarrito(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    
    public double subTotal() {
        return this.producto.getPrecio() * this.cantidad;
    }

    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
}