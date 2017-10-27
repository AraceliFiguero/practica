/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pañalera;

/**
 *
 * @author Araceli
 */
public class FacturaCompra {
    private int numFacturaCompra;
    private char tipoFactura;
    private char cuit;
    //private int idCompra;
    

    public int getNumFacturaCompra() {
        return numFacturaCompra;
    }

    public void setNumFacturaCompra(int numFacturaCompra) {
        this.numFacturaCompra = numFacturaCompra;
    }

    public char getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(char tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public char getCuit() {
        return cuit;
    }

    public void setCuit(char cuit) {
        this.cuit = cuit;
    }
}
