public class Animal {
    String nome;
    int qtdPatas;

    public Animal(){
        
    }

    public Animal(String nome){
        this.nome = nome;
    }

    public Animal(String nome, int qtdPatas){
        this(nome);
        this.qtdPatas = qtdPatas;
    }
}