package Vetor.Teste;

import Vetor.VetorObjects;

public class TesteVetorObjetor {
    public static void main(String[] args) throws IllegalAccessException {
        VetorObjects vetor = new VetorObjects(2);
        vetor.adiciona("Alex");
        vetor.adiciona("Maria");
        vetor.adiciona("Renato");
        vetor.adiciona("Tereza");
        vetor.adiciona("Rui");

        // System.out.println(vetor.toString());

        //  vetor.busca(4).toString();

        vetor.adiciona("Marina", 1);

        for (Object s: vetor.getElementos() ) {
            System.out.println(s);
        }

        vetor.adiciona("Ze", 0);
        System.out.println("********");
        System.out.println(vetor);
        vetor.remove(2);
        System.out.println(vetor);

    }
}
