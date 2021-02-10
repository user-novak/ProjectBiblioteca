/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba01;

import java.util.Date;

/**
 *
 * @author NOVAK
 */
public class Recibo {

    private int idRecibo;
    private Date fecha;
    private int cantidad;
    private int pago;
    private Libro []libro;
    private Cliente cliente;
    private Empleado empleado;

    public Recibo(int idRecibo, Date fecha, int cantidad, int pago) {
        this.idRecibo = idRecibo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.pago = pago;
    }

    public Recibo(int idRecibo, Date fecha, int cantidad, int pago, Libro[] libro, Cliente cliente, Empleado empleado) {
        this.idRecibo = idRecibo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.pago = pago;
        this.libro = libro;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public Libro[] getLibro() {
        return libro;
    }

    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
