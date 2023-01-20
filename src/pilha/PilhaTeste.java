package pilha;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int i = 1; i <= 8; i++){
            pilha.empilha(i);
        }
        System.out.println(pilha);
        System.out.println(pilha.topo());
        System.out.println( pilha.desempilhar());
        System.out.println(pilha);
    }
}
