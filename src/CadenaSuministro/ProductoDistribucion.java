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
public class ProductoDistribucion extends Producto{
    private ProductoProducido productoFabrica;

    public ProductoDistribucion(String nombreProducto, String destino, Fecha fechaLlegada, 
                                Fecha fechaSalida, ProductoProducido productoFabrica) {
        super(nombreProducto, destino, fechaLlegada, fechaSalida);
        this.productoFabrica = productoFabrica;
    }
    
    
}
