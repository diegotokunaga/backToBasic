package maratona.dojo.java.CintroducaoMetodos.models;

public class Calculadora {
    public void somaDoisNumeros(int numA, int numB) {
        System.out.println(numA + numB);
    }
    public void subtraiDoisNumeros(int numA, int numB) {
        System.out.println(numA - numB);
    }
    public void multiplicaDoisNumeros(int numA, int numB) {
        System.out.println(numA * numB);
    }
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void  somaArray(int[] numeros) {
        int soma =0;
        for (int temp: numeros
             ) {
            soma +=temp;
        }
        System.out.println(soma);
    }
}
