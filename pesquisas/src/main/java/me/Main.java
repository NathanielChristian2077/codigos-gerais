package me;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {9, 5, 2, 7, 3};
        int[] vetor2 = {3, 1, 5, 7, 9, 11, 13, 15};

        Pesquisa.pesquisaSequencial(vetor1, 7);
        Pesquisa.pesquisaBinaria(vetor1, 4);

        Pesquisa.pesquisaSequencial(vetor2, 13);
        Pesquisa.pesquisaBinaria(vetor2, 4);

        Random r = new Random();
        int tam = r.nextInt(0, 100000);
        int[] v3 = new int[tam];

        for (int i = 0; i < tam; i++) {
            v3[i] = r.nextInt(0, 999);
        }

        Pesquisa.pesquisaSequencial(v3, 64);
        Pesquisa.pesquisaBinaria(v3, 64);
    }
}
