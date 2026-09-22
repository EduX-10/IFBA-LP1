package Exercicio.src.model;

public class Palestrante {
    private Participante participante;
    private String foto;
    private String biografia;
    private String atuacao;

    public Palestrante(Participante participante, String cpf, String foto, String biografia, String atuacao){
        this.participante = participante;
        this.foto = foto;
        this.biografia = biografia;
        this.atuacao = atuacao;
    }

    public Palestrante(){
        
    }
}
