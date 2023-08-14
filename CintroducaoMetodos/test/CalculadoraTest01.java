package maratona.dojo.java.CintroducaoMetodos.test;

import maratona.dojo.java.CintroducaoMetodos.models.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(10, 10);
        calculadora.subtraiDoisNumeros(5, 2);
        calculadora.multiplicaDoisNumeros(2, 2);
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
    }
}
