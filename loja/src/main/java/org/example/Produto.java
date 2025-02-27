package org.example;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;

    public Produto(){
        this.nome = "";
        this.descricao = "";
        this.preco = 0;
    }

    public Produto(String nome, String descricao, double preco){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}