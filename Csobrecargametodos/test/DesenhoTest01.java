package maratona.dojo.java.Csobrecargametodos.test;

import maratona.dojo.java.Csobrecargametodos.models.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.init("Dragon ball", "anime", 15);
        desenho.init2("Dragon ball", "anime", 15, "acao");
        desenho.imprime();;
    }
}
