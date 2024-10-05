package opp.teste;

import opp.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Daniel Chagas";
        pessoa.idade = 17;
        pessoa.sexo = "M";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

    }
}
