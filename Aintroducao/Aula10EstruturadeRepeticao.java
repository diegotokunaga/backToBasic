package maratona.dojo.java.Aintroducao;

public class Aula10EstruturadeRepeticao {
    public static void main(String[] args) {
//        while(boolean) , do while, for
        int count = 0;

        while (count < 10) {
            System.out.println("While = " + ++count);
        }
//  do while
        do {
            System.out.println("Dentro do do-while " + count);
        } while (count < 10);
        System.out.println("Do while = " + ++count);
//  for
        for (int i = 0; i < 10; i++){
            System.out.println("For = " + i);
        }
    }
}
