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
public class ProductoVenta{
    private double valor;
    private ProductoDistribucion productoDistribucion;

    public ProductoVenta(double valor, ProductoDistribucion productoDistribucion) {
        this.valor = valor;
        this.productoDistribucion = productoDistribucion;
    }
    
    
}
