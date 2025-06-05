package org.example;

import java.time.LocalDate;

public class Produto {
    private String nome;
    private LocalDate data;
    private double preco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return this.nome + "\t" + this.data + "\t" + this.preco + "\n";
    }
}
