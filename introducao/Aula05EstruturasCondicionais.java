package maratona.dojo.java.curso.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 22;
        if (age < 15) {
            System.out.println("Categoria infantil");
        } else if (age >= 15 && age < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}

