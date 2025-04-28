package me;

import java.util.Arrays;

public class Pesquisa {
    //TODO: tratar o caso de não encontrar.
    public int pesquisaSequencial(int v[], int key) {
        int comparacoes = 0;
        for (int i = 0; i < v.length; i++) {
            comparacoes++;
            if (key == v[i]) {
                System.out.println("Comparações(seq./encontrado): "+comparacoes);
                System.out.println();
                return v[i];
            }
        }
        System.out.println("Comparações(seq./não encontrado): "+comparacoes);
        System.out.println();
        return -1;
    }
    
    //TODO: tratar o caso de não encontrar.
    public int pesquisaBinaria(int v[], int key) {
        Arrays.sort(v);
        int comparacoes = 0;
        int inicio = 0;
        int meio = 0;
        int fim = v.length;

        while (inicio <= fim) {
            comparacoes++;
            for (int i = meio; i < v.length; i++) {
                System.out.print(v[i]+" ");
            }
            System.out.println();
            meio = (inicio + fim) / 2;
            if (v[meio] == key) {
                System.out.println("Comparações(bin/encontrado): "+comparacoes);
                System.out.println();
                return v[meio];
            } else {
                if (key < v[meio]) {
                    fim = meio--;
                } else {
                    inicio = meio++;
                }
            }
        }

        if (inicio > fim) {
            System.out.println("Comparações(bin/não encontrado): "+comparacoes);
            System.out.println();
            return -1;
        }
        return -1;
    }
}
