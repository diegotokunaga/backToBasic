package maratona.dojo.java.curso.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
//        operadores basicos + - / *
        int number1 = 10;
        int number2 = 20;
        System.out.println(number1 + number2);

//        % mostra o resto da divisao
        int rest = 20 % 2;
        System.out.println(rest);

//        < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenosQueVinte = 10 < 20;
        boolean isDezMaiorOuIgualVinte = 10 <= 20;
        boolean isDezMenorOuIgualVinte = 10 >= 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 !=10;

        System.out.println("isDezMaiorQueVinte "+  isDezMaiorQueVinte);
        System.out.println("isDezMenosQueVinte " + isDezMenosQueVinte);
        System.out.println("isDezMaiorOuIgualVinte " + isDezMaiorOuIgualVinte);
        System.out.println("isDezMenorOuIgualVinte " + isDezMenorOuIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

//        And(&&) Or(||) Not(!)
        int idade = 18;
        float salario =3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " +  isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        int age = 17;
        boolean acompanhadoMaior = false;
        boolean isPodeComprarBebida = idade >= 18 || acompanhadoMaior;
        System.out.println("Pode comprar bebida " + isPodeComprarBebida);

//        = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000;
        bonus -= 500; // bonus = bonus - 500;
        bonus  *= 2; // bonus = bonus * 2;
        bonus /= 2; // bonus = bonus / 2;
        bonus %= 2; // bonus = bonus % 2;
        System.out.println(bonus);

//

        int count = 0;
        count++; // count+=1
        ++count; // count+=1
        count--; // count-=1
        --count; // count-=1

        System.out.println(count);



    }
}
