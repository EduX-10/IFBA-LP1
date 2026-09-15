public class App {
    public static void main(String[] args) throws Exception {
        //Números
        int inteiro = 1;
        long inteiro2x = 2;

        float decimal = 1.5f;
        float decimal_ = (float) 1.5;
        double float2x = 1.5;

        //Lógico
        boolean bool = false;
        boolean bool_ = true;

        //Textual
        char character = 'a';
        char data[] = {'a', 'b', 'c'};
        String texto = "Hello World";

        //Abstrato
        Aluno Eduardo;

        //Estruturas de Decisão
        //Decisão Simples
        if(true){
            // Bloco TRUE
        }

        //Decisão Composta
        //Ex 1:
        int nota = 7;
        if(nota >= 7){
            //Bloco TRUE 
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        //Ex 2: Operador Ternário
        System.out.println(nota > 7 ? "Aprovado" : "Reprovado");

        //Operadores
        // + - / * % ...
        // < <= > >= == != ...
        // & && | || ! ...

        // Estruturas de Repetição
        int x = 5;
        //Pré Testada
        while(x > 10){
            //...
            x--;
        }
        //Pós Testada
        do{
            //...
            x++;
        }while(x < 1);
        //Repetição Controlada
        for(int i = 0; i < x; i++){
            //...
        }
        //for Agindo Como While
        for( ; x < 10; ){
            //...
            x++;
        } 
        int numeros[] = {1,2,3,4};
        //foreach
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    public class Aluno{
        int mat;
        String nome;
    }

    //Métodos
    public void somar(){
            
    }

    
}
