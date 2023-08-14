package maratona.dojo.java.Bintroducaoclasses.test;

import maratona.dojo.java.Bintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Honda";
        carro1.modelo = "Fit";
        carro1.ano = 2017;

        carro2.marca = "Nissan";
        carro2.modelo = "Kicks";
        carro2.ano = 2023;

        System.out.println("Carro 1");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n---------------");

        System.out.println("Carro 2");
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
