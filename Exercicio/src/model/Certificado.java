package Exercicio.src.model;

public class Certificado {
    public Participante participante;
    public Evento evento;
    public int cargaHoraria;
    public String dataEmissao;
    public String codValidacao;
   
    public Certificado(Participante participante, Evento evento, int cargaHoraria, String dataEmissao, String codValidacao) {
        this.participante = participante;
        this.evento = evento;
        this.cargaHoraria = cargaHoraria;
        this.dataEmissao = dataEmissao;
        this.codValidacao = codValidacao;
    }
   
    public Certificado() {
    }
}