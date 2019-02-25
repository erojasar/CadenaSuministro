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
public class MateriaPrima extends Producto{
    private String granja;

    public MateriaPrima(String nombreProducto, String destino, Fecha fechaLlegada, 
                        Fecha fechaSalida, String granja) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.granja = granja;
    }

    
    
    
}
