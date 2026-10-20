import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       List<Aluno> alunos = new ArrayList<>();

       for(int i = 0; i < 2; i++){
             System.out.println("Digite o nome do aluno " + i + ": ");
             String nome = scan.next();
             System.out.println("Digite a turma do aluno " + i + ": ");
             String turma = scan.next();
             System.out.println("Digite a nota do aluno " + i + ": ");
             Double nota = scan.nextDouble();

             Aluno aluno = new Aluno(nome, turma, nota);

             alunos.add(aluno);
       }

       for( Aluno a: alunos){
        System.out.println(a.getNome());
       }
    }
}


class Aluno{
    private String nome, turma;
    private Double nota;

    public Aluno(String nome, String turma, Double nota) {
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}