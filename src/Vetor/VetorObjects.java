package Vetor;

public class VetorObjects {
        private Object[] elementos;
        private int tamanho;

        public VetorObjects(int capacidade){
            this.elementos = new String[capacidade];
            this.tamanho = 0;
        }

        public Object[] getElementos() {
            return elementos;
        }

        public Object getElementos(int posicao){
            return this.elementos[posicao];
        }

        public void setElementos(Object[] elementos) {
            this.elementos = elementos;
        }

        public int tamanho(){
            return this.tamanho;
        }

        public boolean adiciona(Object elemento) {
            this.aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            } else {
                return false;
            }
        }

        public boolean adiciona(Object elemento, int posicao) {
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
                Object[] elementosNovos = new Object[this.elementos.length*2];//recomendado aumentar 2x o tamanho original
                for (int i = 0; i < this.elementos.length; i++){
                    elementosNovos[i] = this.elementos[i];
                }
                this.elementos = elementosNovos;
            }

        }



        public Object busca(int posicao) throws IllegalAccessException {
            if (!(posicao >= 0 && posicao < tamanho)){
                throw new IllegalArgumentException("Posicao invalida");
            }
            return this.elementos[posicao];
        }

        public int busca(Object elemento){
            for (int i = 0; i < this.tamanho; i++){
                if (elemento.equals(elementos[i])){
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


