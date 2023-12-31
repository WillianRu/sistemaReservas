package org.example;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private long documento;
    private long numeroContacto;
    private ArrayList<Reserva> reservas;

    // constructor

    public Usuario(String nombre, long documento, long numeroContacto) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
        this.reservas = new ArrayList<>();
    }

    //metodos propios de la clase
    public void agendar(Reserva reserva){
        reservas.add(reserva);
    }
    public void modificar(int indice, Reserva reserva){
        if (indice >= 0 && indice < reservas.size()) {
            reservas.set(indice, reserva);
        }
    }
    public void eliminar(int indice){
        if (indice >= 0 && indice < reservas.size()) {
            reservas.remove(indice);
        }
    }

    //mostrar agenda

    public void mostrarAgenda (){
        for (Reserva reserva : reservas) {
            System.out.println("Tipo de reserva: " + reserva.getTipoReserva() + ", Fecha y hora: " + reserva.getFechaHora());
        }
    }
}
