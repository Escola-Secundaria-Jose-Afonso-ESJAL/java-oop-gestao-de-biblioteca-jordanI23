package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        
        Livro l1 = new Livro("O Senhor dos Anéis","J.R.R. Tolkien",1954);
        Livro l2 = new Livro("DUNA","frank",1965);
        Livro l3 = new Livro("1949","george orwell",1949);
        
        b1.adicionarLivro(l1);
        b1.adicionarLivro(l2);
        b1.adicionarLivro(l3);
        
        b1.listarLivros();
        b1.removerLivro("DUNA");
        b1.listarLivros();
    }
}
