package Exercicio.src.model;

public class Atividade {
    public String horario;
    public String local;
    public String descricao;
    public String responsaveis;
    
    public Atividade(String horario, String local, String descricao, String responsaveis) {
        this.horario = horario;
        this.local = local;
        this.descricao = descricao;
        this.responsaveis = responsaveis;
    }
    
    public Atividade() {
    }
}
