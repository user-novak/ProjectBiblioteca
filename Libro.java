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
public class Libro {

    private int cod;
    private String nombre;
    private String estado;
    private String categoria;
    private String autor;

    public Libro(int cod, String nombre, String estado, String categoria, String autor) {
        this.cod = cod;
        this.nombre = nombre;
        this.estado = estado;
        this.categoria = categoria;
        this.autor = autor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
