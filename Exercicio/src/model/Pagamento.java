package Exercicio.src.model;

public class Pagamento {
    public int valor;
    public String data;
    public String formaPagamento;
    public String statusTransacao;
   
    public Pagamento(int valor, String data, String formaPagamento, String statusTransacao) {
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.statusTransacao = statusTransacao;
    }
   
    public Pagamento() {
    }
}