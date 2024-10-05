package opp.teste;

import opp.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa.nome = "Daniel Chagas";
        pessoa.idade = 17;
        pessoa.sexo = "Masculino";

        pessoa2.nome = "Naldo Chagas";
        pessoa2.idade = 58;
        pessoa2.sexo = "Masculino";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

        System.out.println("------------------");

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
        System.out.println(pessoa2.sexo);

    }
}
