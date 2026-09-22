package Exercicio.src.model;

public class Evento {
    private String nome;
    private String descricao;
    private String data;
    private String horario;
    private String local;
    private String tema;
    private String modalidade;
    private boolean status;

    public Evento(String nome, String descricao, String data, String horario, String local, String tema, String modalidade, boolean status){
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.tema = tema;
        this.modalidade = modalidade;
        this.status = status;
    }

    public Evento(){
        
    }
}
