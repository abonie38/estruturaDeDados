package pilha;

import java.util.Scanner;

public class ExercFila {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++){
            System.out.println("Entre com o elemento n° ");
            int num = input.nextInt();

            if (num % 2 == 0){
                System.out.println("Empilhado o numero " + num);
                pilha.empilha(num);
            }else {
               Integer desempilhado = pilha.desempilhar();
               if (desempilhado == null){
                   System.out.println("Pilha está vazia");
               }else {
                   System.out.println("Numero impar, desempilhado o elemento:" + pilha.desempilhar());
               }
            }
        }
        System.out.println(pilha);

        while (!pilha.estaVazia()){
        System.out.println("Empilhado o numero " + pilha.desempilhar());

        }


    }
}
