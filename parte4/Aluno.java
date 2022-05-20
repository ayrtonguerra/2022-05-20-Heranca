package parte4;

public class Aluno extends Pessoa {
    public Aluno(Pessoa p){
        //super(); //Se eu coloco, ou se eu omito ele continua mostrando 'Pessoa...'
        super(p);
        System.out.println("Aluno...");
    }

    public Aluno(String nome, int idade){
        super(nome, idade);
        System.out.println("Aluno...");
    }
}
