package Exercicio.src.model;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String instituicaoEnsino;
    private String curso;
    private String tipoParticipacao;

    public Participante(String nome, String cpf, String email, String instituicaoEnsino, String curso, String tipoParticipacao){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.tipoParticipacao = tipoParticipacao;
    }

    public Participante(){
        
    }
}
