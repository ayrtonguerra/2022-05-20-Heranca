package parte3;

//Quando eu marco como abstract eu estou impedindo que essa classe seja instanciada
//(eu impeço que o código cliente crie um novo objeto dessa classe)
//pois não faz sentido criar um objeto de algo que eu não posso operar nele (ele é só uma ideia).
//ABSTRACT é o oposto de CONCRECT (concreto)
//para deixar como concreto é só não colocar o comando abstract
public abstract class Aluno extends Pessoa {
    int ra;
}
