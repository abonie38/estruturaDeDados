package pilha;

import estruturabase.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if (estaVazia()){
            return null;
        }

        return this.elementos[tamanho-1];
    }

    public T desempilhar(){
        if (estaVazia()){
            return null;
        }
      /* T elemento = this.elementos[tamanho-1];
        this.tamanho--;
        return elemento;*/
        return this.elementos[--tamanho];
    }





}
