package Exercicio.src.model;

public class Inscricao {
    private Participante participante;
    private Evento evento;
    private String dataInscricao;
    private boolean statusInscricao;
    private String tipoInscricao;

    public Inscricao(Participante participante, Evento evento , String dataInscricao, boolean statusInscricao, String tipoInscricao){
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.statusInscricao = statusInscricao;
        this.tipoInscricao = tipoInscricao;
    }

    public Inscricao(){
        
    }
}
