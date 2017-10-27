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
public class Proveedor {
    private int idProveedor;
    private char cuit;
    private char razonSocial;
    private char descripcion;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public char getCuit() {
        return cuit;
    }

    public void setCuit(char cuit) {
        this.cuit = cuit;
    }

    public char getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(char razonSocial) {
        this.razonSocial = razonSocial;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }
}
