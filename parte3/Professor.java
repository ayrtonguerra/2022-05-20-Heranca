package parte3;

public abstract class Professor extends Pessoa {
    int matricula;

    public void lecionar(){
        System.out.printf("%s lecionando...%n", getNome()); //Eu encapsulei o atributo nome para poder proteger ela 
                                                          //e melhorar a coesão do meu código.
    }
}
