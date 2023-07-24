package maratona.dojo.java.curso.introducao;

public class Aula08Switch {
    public static void main(String[] args) {
//imprimir as opcoes para falar com atendente
        byte opcao = 5;
//        chat, int, byte, short enum e String (Sao as unicas variaveis que podem ser usadas no switch)
        switch (opcao) {
            case 1:
                System.out.println("1 - Falar com atendente");
                break;
            case 2:
                System.out.println("2 - Deixar o contato");
                break;
            case 3:
                System.out.println("3 - Transferir para outro setor");
                break;
            case 4:
                System.out.println("4 - Proximo Menu");
                break;
            case 5:
                System.out.println("5 - Outros Assuntos");
                break;
            case 6:
                System.out.println("6 - Ouvir novamente as opcoes");
                break;
            case 7:
                System.out.println("7 - Sair da conversa");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
