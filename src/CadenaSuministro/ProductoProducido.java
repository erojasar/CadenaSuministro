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
public class ProductoProducido extends Producto{
    private int numeroLote;
    private ArrayList materiaPrima;

    public ProductoProducido(String nombreProducto, String destino, Fecha fechaLlegada, 
                            Fecha fechaSalida, int numeroLote) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.numeroLote = numeroLote;
        this.materiaPrima = new ArrayList();
    }

}
