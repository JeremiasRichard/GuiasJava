package Modelos;

import java.util.ArrayList;

public class Gestion {
    ArrayList<Producto> stockProductos = new ArrayList<Producto>();


    public void agregarProducto(Producto nuevoProducto) {
        stockProductos.add(nuevoProducto);
    }
    public void modificarStock(Producto deseado, int cantidad) {
        for (Producto producto : stockProductos) {
            if (producto.getCodigo() == deseado.getCodigo()) {
                producto.setStock(cantidad);
            }
        }
    }
    public Producto buscarProducto(int codigo) {
        Producto deseado = null;
        for (Producto producto : stockProductos)
        {
            if (producto.getCodigo() == codigo)
            {
                deseado = producto;
                break;
            }
        }
        return deseado;
    }
    public String existeProducto(int codigo) {
        Producto deseado = buscarProducto(codigo);
        String respuesta = deseado == null ? "Producto no encontrado" : "Producto encontrado!";

        return respuesta;
    }
}