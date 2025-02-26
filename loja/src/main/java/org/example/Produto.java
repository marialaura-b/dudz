package org.example;

public class Produto {
    private String nome;
    private String descrição;
    private double preço;


    public Produto(String nome, String descrição, double preço){
        this.setNome(nome);
        this.setDescrição(descrição);
        this.setPreço(preço);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}