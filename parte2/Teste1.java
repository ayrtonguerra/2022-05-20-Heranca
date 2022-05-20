package parte2;

public class Teste1 {
    public static void main(String[] args) {
        AlunoGraduacao ag = new AlunoGraduacao();
        ag.idade = 17;
        ag.nome = "Pedro";
        System.out.printf("Nome: %s, Idade: %d%n", ag.nome, ag.idade);
    }
}
