/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaSuministro;

import java.util.ArrayList;

/**
 *
 * @author erojasar
 */
public class Manufacturer extends CadenaSuministro{
    private ArrayList<ProductoProducido> productosProducidos;

    public Manufacturer(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosProducidos = new ArrayList<ProductoProducido>();
    }
    
    public boolean registrarProductoProducido(String nombreProducto, String destino, Fecha fechaLlegada, 
                            Fecha fechaSalida, int numeroLote){
        ProductoProducido producto = new ProductoProducido(nombreProducto, destino, fechaLlegada, fechaSalida, numeroLote);
        return this.productosProducidos.add(producto);
    }
    
}
