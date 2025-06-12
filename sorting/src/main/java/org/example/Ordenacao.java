package org.example;

public class Ordenacao {

    public static long qcount = 0;
    public static long recCallsCount = 0;
    public static long selecTrocas = 0;

    public static void resetCounters() {
        qcount = 0;
        recCallsCount = 0;
        selecTrocas = 0;
    }

    public static void qsort(Produto[] v, int inicio, int fim) {
        int esq = inicio;
        int dir = fim;
        Produto pivo = v[(esq + dir) / 2];

        while (esq <= dir) {
            while (v[esq].getPreco() < pivo.getPreco()) esq++;
            while (v[dir].getPreco() > pivo.getPreco()) dir--;
            if (esq <= dir) {
                Produto aux = v[esq];
                v[esq] = v[dir];
                v[dir] = aux;
                esq++;
                dir--;
                qcount++;
            }
        }
        if (dir > inicio) {
            qsort(v, inicio, dir);
            recCallsCount++;
        }
        if (esq < fim) {
            qsort(v, esq, fim);
            recCallsCount++;
        }
    }

    public static void selecSort(Produto[] v) {
        int n = v.length - 1;
        for (int i = 0; i <= n - 1; i++) {
            Produto menor = v[i];
            int posMenor = i;
            for (int j = i + 1; j <= n; j++) {
                if (v[j].getPreco() < menor.getPreco()) {
                    menor = v[j];
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                Produto aux = v[i];
                v[i] = menor;
                v[posMenor] = aux;
                selecTrocas++;
            }
        }
    }
}
