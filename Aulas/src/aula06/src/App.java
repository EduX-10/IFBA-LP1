package aula06.src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //1 Obter os dados:
        String titulo = "IoT: do Circuito ao Código";
        String descricao = "Curso Introdutório de IoT";
        String responsavel = "Eduardo, Arthur, Fabiano";
        String tipo = "Minicurso";

        //Construir oobjeto:
        Atividade a1 = new Atividade(titulo, descricao, responsavel, tipo);

        //Manipulação do objeto (CRUD):
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(a1);
    }
}

class Atividade{
    String titulo, descricao, responsavel, tipo;

    public Atividade() {
    }

    public Atividade(String titulo, String descricao, String responsavel, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }

    
}