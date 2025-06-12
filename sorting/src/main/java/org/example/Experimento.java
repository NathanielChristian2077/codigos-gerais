package org.example;

import java.util.Arrays;

public class Experimento {

    public static void executar(String algoritmo, Produto[] vetorOriginal) {
        Produto[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

        Ordenacao.resetCounters();

        long inicio = System.currentTimeMillis();

        if (algoritmo.equalsIgnoreCase("QuickSort")) {
            Ordenacao.qsort(vetor, 0, vetor.length - 1);
        } else if (algoritmo.equalsIgnoreCase("SelectionSort")) {
            Ordenacao.selecSort(vetor);
        }

        long fim = System.currentTimeMillis();

        System.out.println("Algoritmo de ordenação utilizado: " + algoritmo);
        System.out.println("Organização inicial do vetor: " + getTipoOrganizacao(vetorOriginal));
        if (algoritmo.equalsIgnoreCase("QuickSort")) {
            System.out.println("Número de trocas: " + Ordenacao.qcount);
            System.out.println("Número de chamadas recursivas: " + Ordenacao.recCallsCount);
        } else if (algoritmo.equalsIgnoreCase("SelectionSort")) {
            System.out.println("Número de trocas: " + Ordenacao.selecTrocas);
        }
        System.out.println("Tempo de execução (ms): " + (fim - inicio));
        System.out.println("---------------------------------------------------");
    }

    private static String getTipoOrganizacao(Produto[] vetor) {
        boolean crescente = true, decrescente = true;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i].getPreco() > vetor[i + 1].getPreco()) crescente = false;
            if (vetor[i].getPreco() < vetor[i + 1].getPreco()) decrescente = false;
        }
        if (crescente) return "crescente";
        if (decrescente) return "decrescente";
        return "aleatória";
    }
}
