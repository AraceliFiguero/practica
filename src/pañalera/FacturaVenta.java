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
public class FacturaVenta {
    private int numFacturaVenta;
    private char tipoFactura;
    private char nomLocal;
    private int cuit;
    //private int idPedido;

    public int getNumFacturaVenta() {
        return numFacturaVenta;
    }

    public void setNumFacturaVenta(int numFacturaVenta) {
        this.numFacturaVenta = numFacturaVenta;
    }

    public char getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(char tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public char getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(char nomLocal) {
        this.nomLocal = nomLocal;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}
