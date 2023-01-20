package Vetor;

import java.text.MessageFormat;
import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public String[] getElementos() {
        return elementos;
    }

    public String getElementos(int posicao){
        return this.elementos[posicao];
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public int tamanho(){
        return this.tamanho;
    }

  /*  public void add(String elemento){
       for(int i = 0; i < elemento.length(); i++){
           if (elementos[i] == null && this.elementos.length < tamanho -1){
               elementos[i] = elemento;
               this.tamanho++;
               break;
           }else {
               int newCapacidade = this.tamanho + 1;

              this.elementos = new String[newCapacidade];
           }
       }
    }*/

  /*  public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("O vetor já está cheio");
        }

    }*/

    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    //minha implementação do metodo adiciona
/*    public boolean adiciona(String elemento, int posicao) {
        String[] array = new String[elementos.length + 1];
        int j = 0;
        if(posicao >= 0 && posicao < tamanho) {
           for (int i = 0; i < array.length -1; i++) {
              if (i == posicao -1){
                  array[j] = elemento;
                   j++;
                   array[j] = this.elementos[i];
               }
                   array[j] = this.elementos[i];
                  j++;
            }
            this.elementos = array;
           this.tamanho++;
            return true;
        }
        return false;

    }*/

    public boolean adiciona(String elemento, int posicao) {
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
            String[] elementosNovos = new String[this.elementos.length*2];//recomendado aumentar 2x o tamanho original
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }



    public String busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (elemento.equalsIgnoreCase(elementos[i])){
                return i;
            }
        }
       return -1;
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        for (int i = posicao; i < this.elementos.length -1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    /*minha implementacao*/
   /* public boolean removeElemento(String elemento){
       int x = this.busca(elemento);
        if (x != -1){
            this.elementos[x] = null;
            return true;
        }
        return false;
    }*/


    /*@Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < this.tamanho - 1; i++) {
            s += this.elementos[i];
            s += ", ";
        }

        if (this.tamanho > 0) {
            s += this.elementos[tamanho - 1];
        }
        s += "]";
        return s.toString();
    }*/

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
