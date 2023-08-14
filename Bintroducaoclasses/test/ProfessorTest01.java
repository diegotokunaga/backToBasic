package maratona.dojo.java.Bintroducaoclasses.test;

import maratona.dojo.java.Bintroducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Rafael";
        professor.idade = 38;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
