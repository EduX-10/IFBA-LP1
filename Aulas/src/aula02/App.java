package aula02;

import aula02.model.Evento;

public class App {
    public static void main(String[] args) {

        Evento evento = new Evento(); //Instância =  Cópia

        evento.nome = "IFBA - TechWeek";
        evento.data = "22/09/2026";
        evento.local = "Auditório - IFBA";
        evento.capacidade = 200;

        System.out.println(evento.resumo());

        Evento eventoEE = new Evento(); //Instância =  Cópia

        eventoEE.nome = "Semana de Engenharia";
        eventoEE.data = "23/09/2026";
        eventoEE.local = "Bloco B";
        eventoEE.capacidade = 100;

        System.out.println(eventoEE.resumo());

        Evento eventoIF = new Evento("SNCT", "22/09/2026", "IFBA - Paulo Afonso", 500);

        System.out.println(eventoIF.resumo());
    }
}
