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
public class DistributionCenter extends CadenaSuministro{
    private ArrayList<ProductoDistribucion> productosDistribuidora;

    public DistributionCenter(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosDistribuidora = new ArrayList<ProductoDistribucion>();
    }
    
}
