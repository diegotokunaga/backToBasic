package maratona.dojo.java.Aintroducao;

//Criar variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
//Eu <name>, morando no endereco <adress> confirmo que recebi o salario de <payment> na data <date>.

public class Aula03Exercicio {
    public static void main(String[] args) {
        String name = "Diego";
        String adress = "Rua Bla bla bla, n 10";
        double payment = 2500;
        String date = "01/01/2023";
        String phrase = "Eu " + name +", morando no endereco" + adress + " confirmo que recebi o salario de " + payment + ", na data " + date;

        System.out.println(phrase);
    }
}
