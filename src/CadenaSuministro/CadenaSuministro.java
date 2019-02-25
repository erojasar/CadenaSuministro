/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaSuministro;

/**
 *
 * @author erojasar
 */
public class CadenaSuministro {
    protected String nombre;
    protected String descripcion;
    protected Direccion direccion;

    public CadenaSuministro(String nombre, String descripcion, double latitud, double longitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = new Direccion(latitud, longitud);
    }
    
    
}
