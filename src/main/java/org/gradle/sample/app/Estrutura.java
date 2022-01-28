package org.gradle.sample.app;

public interface Estrutura {
    void adicionar(Pessoa pessoa);
    Pessoa buscar(String nome);
    void remover(Pessoa pessoa);
    void remover(int index);
    void listarTodos();
    Pessoa getPessoa(int index);
}
