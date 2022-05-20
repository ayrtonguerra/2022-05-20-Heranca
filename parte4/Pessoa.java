package parte4;

public class Pessoa {
    private String nome;
    private int idade;

    //Construtor padrão da classe Pessoa
    // public Pessoa(){
    //     System.out.println("Pessoa...");
    // }
    //Se eu omitir o construtor padrão, o Java vai acusar um erro
    //Pois ele vai tentar chamar o construtor padrão da classe Pessoa e não vai encontrar ele
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.printf("Pessoa: %s, %d%n", this.nome, this.idade);
    }

    public Pessoa(Pessoa pessoa){
        this(pessoa.nome, pessoa.idade);
    }

    public String toString(){
        return String.format(
            "Nome: %s",
            nome
        );
    }
}
