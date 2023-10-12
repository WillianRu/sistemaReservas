package org.example;
import java.util.Date;

public class Reserva {
    public String tipoReserva;
    private Date fechaHora;

    public Reserva(String tipoReserva, Date fechaHora) {
        this.tipoReserva = tipoReserva;
        this.fechaHora = fechaHora;
    }
}
