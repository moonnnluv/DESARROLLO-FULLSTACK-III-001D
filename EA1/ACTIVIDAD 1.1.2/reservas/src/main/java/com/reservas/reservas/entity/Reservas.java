package com.reservas.reservas.entity;

public class Reservas {
    
    private int id; 
    private int canchaId; 
    private String nombreCliente;
    private String fecha;
    private String horaInicio;
    private String horaFin;

    public Reservas() {
    }

    public Reservas(int id, int canchaId, String nombreCliente, String fecha, String horaInicio, String horaFin) {
        this.id = id;
        this.canchaId = canchaId;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCanchaId() { return canchaId; }
    public void setCanchaId(int canchaId) { this.canchaId = canchaId; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }
}