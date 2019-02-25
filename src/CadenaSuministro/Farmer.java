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
public class Farmer extends CadenaSuministro{
    private ArrayList<MateriaPrima> productosGranja;

    public Farmer(String nombre, String descripcion, double latitud, double longitud) {
        super(nombre, descripcion, latitud, longitud);
        this.productosGranja = new ArrayList<MateriaPrima>();
    }
    
    public boolean registrarProducto(String nombreProducto, String destino, Fecha fechaLlegada, 
                        Fecha fechaSalida, String granja){
        MateriaPrima producto = new MateriaPrima(nombreProducto, destino, fechaLlegada, fechaSalida, granja);
        return this.productosGranja.add(producto);
    }
}
