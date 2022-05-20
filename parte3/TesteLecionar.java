package parte3;

public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista h = new ProfessorHorista();
        h.setNome("José");
        ProfessorPesquisador pp = new ProfessorPesquisador();
        pp.setNome("João");
        h.lecionar();
        pp.lecionar();
    }
}
