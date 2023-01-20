package exercFilas;

import java.util.*;

public class FilaTeste {
    public static void main(String[] args) {
        List<Pessoa> listaClientes = new ArrayList<>();
        Queue<Pessoa> listaNormal = new LinkedList<>();
        Queue<Pessoa> listaPrioritaria = new LinkedList<>();

        listaClientes.add(new Pessoa("Maria", 68));
        listaClientes.add(new Pessoa("Jose", 81));
        listaClientes.add(new Pessoa("Osvaldo", 85));
        listaClientes.add(new Pessoa("Tereza", 75));
        listaClientes.add(new Pessoa("Das Dores", 80));
        listaClientes.add(new Pessoa("Covalique", 15));
        listaClientes.add(new Pessoa("Carol", 25));
        listaClientes.add(new Pessoa("Luis", 55));

        for (Pessoa p: listaClientes ) {
            if (p.getIdade() > 65){
                listaPrioritaria.add(p);
            }else {
                listaNormal.add(p);
            }
        }

        System.out.println("Lista Normal");
        for (Pessoa pessoa: listaNormal ) {
            System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        }
        System.out.println("********************************************");


        System.out.println("Lista Prioritaria");
        for (Pessoa pessoa: listaPrioritaria) {
            System.out.println("Nome: " + pessoa.getNome() + ", idade: " + pessoa.getIdade());
        }

        System.out.println();


        System.out.println("******Chamdada************");
       for (int i = 0; i < listaClientes.size(); i++){
            if (!listaPrioritaria.isEmpty()){
                for (int j = 0; j < 3; j++) {
                    if (listaPrioritaria.peek() != null) {
                        System.out.println("Chamada prioritaria n° " + j +", Nome" + listaPrioritaria.peek().getNome());
                        listaPrioritaria.remove(listaPrioritaria.peek());
                    }
                }

            }
           if (listaNormal.peek() != null) {
               System.out.println("Chamada normal: " + listaNormal.peek().getNome());
               listaNormal.poll();
           }
        }






    }
}
