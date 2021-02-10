/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba01;

/**
 *
 * @author NOVAK
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;

    public Empleado(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
