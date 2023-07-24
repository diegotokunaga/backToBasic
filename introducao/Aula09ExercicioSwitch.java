package maratona.dojo.java.curso.introducao;

public class Aula09ExercicioSwitch {
    public static void main(String[] args) {
//  dado os valor de 1 a 7, imprima se é dia util ou fds
//        1 domingo
        int dia = 3;
        switch (dia){
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2,3,4,5,6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}
