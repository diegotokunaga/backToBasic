package maratona.dojo.java.Aintroducao;

public class Aula06OperadorTernario {
    public static void main(String[] args) {
        double salario = 600;
        String mensagemComprar = "Vou comprar uma viagem para a lua";
        String mensagemNaoComprar = "Nao tenho condicoes de comprar uma viagem para a lua";
//        (condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? mensagemComprar : mensagemNaoComprar;

        System.out.println(resultado);
    }
}
