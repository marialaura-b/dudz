package org.example;

import java.util.ArrayList;

public class Carrinho { //vai receber os produtos
    ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Produto remover(String nome){
        int codigo = -1;
        for (int i = 0; i < produtos. size(); i++) {
            if (produtos.get(i).equals(nome)) {
                codigo = i;
                break;
            } else {
                continue;
            }
        }

        if (codigo == -1) {
            return null;
        } else {
            return "O produto "+nome+" foi removido";
        }
    }
}
