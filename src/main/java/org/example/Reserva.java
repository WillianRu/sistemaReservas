package org.example;
import java.util.Date;

public class Reserva {
    private String tipoReserva;
    private Date fechaHora;

    public Reserva(String tipoReserva, Date fechaHora) {
        this.tipoReserva = tipoReserva;
        this.fechaHora = fechaHora;
    }

    //getters


    public String getTipoReserva() {
        return tipoReserva;
    }

    public Date getFechaHora() {
        return fechaHora;
    }
}
