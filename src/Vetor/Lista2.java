package Vetor;

import estruturabase.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(){
        super();
    }

    public Lista2(int capaciade){
        super(capaciade);
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(T elemento, int posicao) {
        return this.adiciona(elemento, posicao);
    }
    }
