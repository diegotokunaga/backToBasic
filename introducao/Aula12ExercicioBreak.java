package maratona.dojo.java.curso.introducao;

public class Aula12ExercicioBreak {
    public static void main(String[] args) {
//        dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
//        Condicao valorParcela >= 1000;
        int valorCarro = 75000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela valor total do carro " + valorCarro + " " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }

        System.out.println("------------------------------------------Outra opcao ---------------------------------------------------");
// OUTRA OPCAO DE RESOLUCAO DO EXERCICIO
        int valorCarro2 = 30000;
        for (int parcela2 = 1; parcela2 <= valorCarro2; parcela2++) {
            double valorParcela2 = valorCarro2 / parcela2;
            if (valorParcela2 < 1000) {
                break;
            }
            System.out.println("Parcela valor total do carro " + valorCarro2 + " " + parcela2 + " R$ " + valorParcela2);
        }
    }
}







