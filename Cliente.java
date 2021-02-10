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
public class Cliente {

    private int idCliente;
    private String name;

    public Cliente(int idCliente, String name) {
        this.idCliente = idCliente;
        this.name = name;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
