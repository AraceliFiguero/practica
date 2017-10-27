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
public class Cliente {
    private int idCliente;
    private char apellido;
    private char nombre;
    private int telefono;
    private int dni;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public char getApellido() {
        return apellido;
    }

    public void setApellido(char apellido) {
        this.apellido = apellido;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
 
    
}
