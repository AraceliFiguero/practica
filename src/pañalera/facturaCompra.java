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
public class facturaCompra {
    private int numFacturaCompra;
    private String tipoFactura;
    private String cuit;
    private Date fecha;
    private List<detalleCompra> detalle;
    //private int idCompra;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<detalleCompra> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<detalleCompra> detalle) {
        this.detalle = detalle;
    }
    

    public int getNumFacturaCompra() {
        return numFacturaCompra;
    }

    public void setNumFacturaCompra(int numFacturaCompra) {
        this.numFacturaCompra = numFacturaCompra;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
