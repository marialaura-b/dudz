package org.example;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("T-shirt", "Pink", 15.99);
        Produto p2 = new Produto("Vestido", "Marrom", 28.99);

        Carrinho c = new Carrinho();
        c.adicionar(p1);
        c.adicionar(p2);
        c.remover("T-shirt");

        Venda v = new Venda(c);
        v.totalPreco();
        //System.out.println("Loja Dudz");
    }
}