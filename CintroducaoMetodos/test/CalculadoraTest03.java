package maratona.dojo.java.CintroducaoMetodos.test;

import maratona.dojo.java.CintroducaoMetodos.models.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
    }
}
