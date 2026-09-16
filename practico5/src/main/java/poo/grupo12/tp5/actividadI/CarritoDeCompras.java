package poo.grupo12.tp5.actividadI;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private int id;
    private List<ItemCarrito> items;

    public CarritoDeCompras(int id) {
        this.id = id;
        this.items = new ArrayList<>(); 
    }

    public void agregar(Producto p, int cantidad) {
        
        ItemCarrito nuevoItem = new ItemCarrito(items.size() + 1, p, cantidad);
        items.add(nuevoItem);
    }

    public void remover(Producto p) {
        
        items.removeIf(item -> item.getProducto().getCodigo().equals(p.getCodigo()));
    }

    public double total() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.subTotal(); 
        }
        return total;
    }

    public void vaciar() {
        items.clear();
    }

    public List<ItemCarrito> getItems() { return items; }
}