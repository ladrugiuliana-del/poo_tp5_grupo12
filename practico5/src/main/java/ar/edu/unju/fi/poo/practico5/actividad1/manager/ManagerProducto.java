package ar.edu.unju.fi.poo.practico5.actividad1.manager;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.practico5.actividad1.model.Producto;

public class ManagerProducto {

    private List<Producto> lista;

    public ManagerProducto() {
        this.lista = new ArrayList<>();
        cargar();
    }

    private void cargar() {
        lista.add(new Producto("001", "Auriculares", 45000.0, true));
        lista.add(new Producto("002", "Teclado", 25000.0, true));
        lista.add(new Producto("003", "Mouse", 15000.0, true));
        lista.add(new Producto("004", "Monitor", 180000.0, true));
        lista.add(new Producto("005", "Silla Gamer", 250000.0, true));
    }

    public List<Producto> getLista() {
        return lista;
    }
}