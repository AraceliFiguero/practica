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
public class Producto {
    private int idProducto;
    private char tipoProducto;
    private char marca;
    private char descripcion;
    private float precio;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public char getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(char tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public char getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(char descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
