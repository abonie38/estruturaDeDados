package Vetor.Teste;

import Vetor.Lista;

public class ListaTeste {

    public static void main(String[] args) throws IllegalAccessException {
        Lista<Integer> numbers = new Lista(10);
        numbers.adiciona(10);
        numbers.adiciona(12);
        numbers.adiciona(15,0);
        numbers.busca(1);


        System.out.println(numbers);

    }
    }
