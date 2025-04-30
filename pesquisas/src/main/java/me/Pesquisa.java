package me;

import java.util.Arrays;

public class Pesquisa {
    public static int comparacoesSequencial = 0;
    public static int comparacoesBinaria = 0;

    public static int pesquisaSequencial(int[] v, int key) {
        comparacoesSequencial = 0;

        System.out.println("\n[Busca Sequencial]");
        // Acaba sendo problemático nos testes com vetores maiores.
        //System.out.println("Vetor: " + Arrays.toString(v));
        System.out.println("Chave: " + key);

        for (int i = 0; i < v.length; i++) {
            comparacoesSequencial++;
            if (v[i] == key) {
                System.out.println("Valor encontrado no índice " + i);
                System.out.println("Comparaçoes realizadas: " + comparacoesSequencial);
                return v[i];
            }
        }
        System.out.println("Valor nao encontrado.");
        System.out.println("Comparaçoes realizadas: " + comparacoesSequencial);
        return -1;
    }

    public static int pesquisaBinaria(int[] v, int key) {
        comparacoesBinaria = 0;
        Arrays.sort(v);
        System.out.println("\n[Busca Binária]");
        // Acaba sendo problemático nos testes com vetores maiores.
        //System.out.println("Vetor (ordenado): " + Arrays.toString(v));
        System.out.println("Chave: " + key);

        int inicio = 0;
        int fim = v.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            comparacoesBinaria++;

            if (v[meio] == key) {
                System.out.println("Valor encontrado no índice " + meio);
                System.out.println("Comparaçoes realizadas: " + comparacoesBinaria);
                return v[meio];
            } else if (v[meio] < key) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Valor nao encontrado.");
        System.out.println("Comparaçoes realizadas: " + comparacoesBinaria);
        return -1;
    }
}
