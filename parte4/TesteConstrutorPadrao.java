package parte4;

public class TesteConstrutorPadrao {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("José", 19);
        // Aluno a = new Aluno(p); //Construtor de cópia -> Ele recebe um construtor dele mesmo e faz uma cópia dele
        Aluno a = new Aluno("Pedro", 22);
        System.out.println(p);
        System.out.println(a);
    }
}
