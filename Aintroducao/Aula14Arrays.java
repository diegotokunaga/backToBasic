package maratona.dojo.java.Aintroducao;

public class Aula14Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Joao";
        nomes[1] = "Maria";
        nomes[2] = "Diego";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        /*
        int[] numeros = new int[3];
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;

        */
         
//        ou
        int[] numeros3 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        ou
        int[] numeros2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
