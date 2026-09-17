package poo.grupo12.tp5.actividadI;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private CarritoDeCompras carrito;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carrito = new CarritoDeCompras(1);
    }

    public void agregarAlCarrito(Producto p, int cantidad) {
        carrito.agregar(p, cantidad);
    }

    public void removerDelCarrito(Producto p) {
        carrito.remover(p);
    }

    public double verTotalCarrito() {
        return carrito.total();
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de " + nombre + " -");
        for (ItemCarrito item : carrito.getItems()) {
            System.out.println(item.getCantidad() + "x " + item.getProducto().getNombre() + 
                               "Subtotal: $" + item.subTotal());
        }
        System.out.println("Total a pagar: $ARS" + verTotalCarrito());
    }
}