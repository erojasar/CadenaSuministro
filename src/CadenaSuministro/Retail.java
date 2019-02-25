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
public class Retail extends CadenaSuministro{
    private ArrayList<ProductoVenta> productosFinal;

    public Retail(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosFinal = new ArrayList<ProductoVenta>();
    }
    
    public boolean registrarProductoVenta(double valor, ProductoDistribucion productoDistribucion){
        ProductoVenta producto =  new ProductoVenta(valor, productoDistribucion);
        return this.productosFinal.add(producto);
    }
}
