package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Usuario usuarioPrueba = new Usuario("Willian Rueda", 1020840365, 30145873);
        Date fechaHoraReserva = new Date();

        //Creacion reserva
        Reserva reserva = new Reserva("Hotel", fechaHoraReserva);
        usuarioPrueba.agendar(reserva);

        Reserva reservaDos = new Reserva("Hospital", fechaHoraReserva);
        usuarioPrueba.agendar(reservaDos);

        Reserva reservaTres = new Reserva("Restaurante", fechaHoraReserva);
        usuarioPrueba.agendar(reservaTres);

        //Visualizacion agenda
        usuarioPrueba.mostrarAgenda();

        //Modificacion agenda
        Reserva nuevaReserva = new Reserva("Estudio", fechaHoraReserva);
        usuarioPrueba.modificar(1,nuevaReserva);

        //Visualizacion agenda
        System.out.println("========== Nueva Agenda ==========");
        usuarioPrueba.mostrarAgenda();

        //Eliminacion agenda

        usuarioPrueba.eliminar(2);

        //Visualizacion agenda
        System.out.println("========== Nueva Agenda ==========");
        usuarioPrueba.mostrarAgenda();
    }
}