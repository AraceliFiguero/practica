/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pañalera;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Araceli
 */
public class facturaVenta {
    private int numFacturaVenta;
    private String tipoFactura;
    private String nomLocal;
    private int cuit;
    private Date fecha;
    private List<detalleVenta> detalles;
    //private int idPedido;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<detalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<detalleVenta> detalles) {
        this.detalles = detalles;
    }

    public int getNumFacturaVenta() {
        return numFacturaVenta;
    }

    public void setNumFacturaVenta(int numFacturaVenta) {
        this.numFacturaVenta = numFacturaVenta;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}
