package aula03.encapsulamento.src;

import aula03.encapsulamento.src.model.Evento;

public class App {
    public static void main(String[] args) throws Exception {
        Evento evento1 = new Evento();
        evento1.setNome("IFBA TechWeek");
        evento1.setLocal("IFBA");
        evento1.setVagas(10);
    }
}
