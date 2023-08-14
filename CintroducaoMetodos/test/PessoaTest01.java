package maratona.dojo.java.CintroducaoMetodos.test;

import maratona.dojo.java.CintroducaoMetodos.models.ImpressoraPessoa;
import maratona.dojo.java.CintroducaoMetodos.models.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa01 = new Pessoa();

        pessoa.nome = "Diego";
        pessoa.idade = 34;
        pessoa.sexo = 'M';
        ImpressoraPessoa impressora = new ImpressoraPessoa();

        pessoa01.nome = "Raissa";
        pessoa01.idade = 29;
        pessoa01.sexo = 'F';

        System.out.println("-----------------------------");

        impressora.imprime(pessoa);

        System.out.println("-----------------------------");

        System.out.println(pessoa.nome);
        System.out.println(pessoa.sexo);
        System.out.println(pessoa.idade);

        System.out.println("-----------------------------");

        System.out.println(pessoa01.nome);
        System.out.println(pessoa01.sexo);
        System.out.println(pessoa01.idade);

        System.out.println("-----------------------------");


        impressora.imprime(pessoa01);

    }
}
