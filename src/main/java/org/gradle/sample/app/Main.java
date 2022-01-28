package org.gradle.sample.app;
import lombok.NonNull;
public class Main {
    public static void main (String[] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jorge");
        pessoa1.setIdade(10);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(12);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("João");
        pessoa3.setIdade(5);

        ListaDePessoa listaDePessoa = new ListaDePessoa();
        listaDePessoa.adicionar(pessoa1);
        listaDePessoa.adicionar(pessoa2);
        listaDePessoa.adicionar(pessoa3);


        listaDePessoa.buscar("Maria");

//        listaDePessoa.listarTodos();




    }
}
