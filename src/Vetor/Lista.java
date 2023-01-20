package Vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public T[] getElementos() {
        return elementos;
    }

    public T getElementos(int posicao){
        return this.elementos[posicao];
    }

    public void setElementos(T[] elementos) {
        this.elementos = elementos;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean adiciona(T elemento, int posicao) {
        this.aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = this.tamanho -1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return false;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new String[this.elementos.length*2];//recomendado aumentar 2x o tamanho original
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }



    public T busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (elemento.equals(elementos[i])){
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao){
        if (!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = posicao; i < this.elementos.length -1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho -1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho >= 0) {
            s.append(this.elementos[tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }
}
