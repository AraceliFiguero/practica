/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pañalera;

import BaseDeDatosPañalera.ConexionesBaseDeDatos;

/**
 *
 * @author Araceli
 */
public class Pañalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConexionesBaseDeDatos prueba = new ConexionesBaseDeDatos();
        prueba.getConexionMysql();
        
    }
    
}
