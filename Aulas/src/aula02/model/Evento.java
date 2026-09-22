package aula02.model;

public class Evento {
    public String nome;
    public String data;
    public String local;
    public int capacidade;

    //Construtor Padrão (Toda Classe Possui)
    public Evento(){}

    //Construtor Modificado (Cheio)
    public Evento(String nome, String data, String local, int capacidade){
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
    }


    // Método
    public String resumo(){
        return nome + "(" + local + ") - até " + capacidade + " vagas";
    }
}
