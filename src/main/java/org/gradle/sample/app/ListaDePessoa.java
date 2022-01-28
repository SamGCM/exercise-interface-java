package org.gradle.sample.app;

import java.util.Objects;

public class ListaDePessoa implements Estrutura{

    private Pessoa[] pessoas = new Pessoa[10];
    private int index = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        this.pessoas[index] = pessoa;
        this.index ++;
    }

    @Override
    public Pessoa buscar(String nome) {
        Pessoa result = null;
        for(int i=0; i < this.index; i++){
            if(this.pessoas[i].getNome() == nome){
                result = this.pessoas[i];
            }
            else if (result == null && i == this.index -1) {
                throw new RuntimeException(nome + " não encontrado.");
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public void remover(Pessoa pessoa) {
        int position = 0;
        for(int i = 0; i < this.index; i++){
            if(this.pessoas[i].getNome() == pessoa.getNome()){
                pessoas[i] = this.pessoas[i + 1];
                position = i + 1;
            } else if (position != 0) {
                pessoas[i] = this.pessoas[position + 1];
            } else if(position == 0 && i == this.index -1){
                throw new RuntimeException(pessoa.nome + " não encontrado");
            }
        }
        this.index--;
        this.listarTodos();
    }

    @Override
    public void remover(int index) {
        if(index > this.pessoas.length) {
            throw new RuntimeException(index + " posição inválida.");
        }
        for(int i = index; i < this.index -1; i++){
            this.pessoas[i] = this.pessoas[i + 1];
        }
        this.index--;
        this.listarTodos();
    }

    @Override
    public void listarTodos() {
        for(int i = 0; i < this.index; i++){
//            if(this.pessoas[i] != null){
                System.out.println(this.pessoas[i]);
//            }
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        System.out.println(this.pessoas[index]);
        return this.pessoas[index];
    }
}
