package org.example;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanho = 10000 + 479; // 10.479 produtos
        Produto[] vetor1 = new Produto[tamanho];
        Produto[] vetor2 = new Produto[tamanho];
        Produto[] vetor3 = new Produto[tamanho];

        gerarProdutosOrdenados(vetor1, true);
        gerarProdutosOrdenados(vetor2, false);
        gerarProdutosAleatorios(vetor3);

        // Executar os experimentos
        Experimento.executar("SelectionSort", vetor1);
        Experimento.executar("SelectionSort", vetor2);
        Experimento.executar("SelectionSort", vetor3);

        Experimento.executar("QuickSort", vetor1);
        Experimento.executar("QuickSort", vetor2);
        Experimento.executar("QuickSort", vetor3);
    }

    private static void gerarProdutosOrdenados(Produto[] vetor, boolean crescente) {
        double precoBase = crescente ? 1.0 : vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            double preco = crescente ? precoBase + i : precoBase - i;
            vetor[i] = new Produto(
                    "Produto" + i,
                    LocalDate.of(2023, (i % 12) + 1, (i % 28) + 1),
                    preco
            );
        }
    }

    private static void gerarProdutosAleatorios(Produto[] vetor) {
        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Produto(
                    "Produto" + i,
                    LocalDate.of(2023, (i % 12) + 1, (i % 28) + 1),
                    rand.nextDouble() * 10000
            );
        }
    }
}
