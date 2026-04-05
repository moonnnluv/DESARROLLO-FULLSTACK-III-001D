package com.cancha.cancha.entity;

public class Cancha {
    private String id;
    private String nombre;
    private String tipo;
    private String estado;
    private int precioPorHora;

    public Cancha() {
    }

    public Cancha(String id, String nombre, String tipo, String estado, int precioPorHora) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.precioPorHora = precioPorHora;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public int getPrecioPorHora() { return precioPorHora; }
    public void setPrecioPorHora(int precioPorHora) { this.precioPorHora = precioPorHora; }
}
