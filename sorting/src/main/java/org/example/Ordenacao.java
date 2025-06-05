package org.example;

public class Ordenacao {
    // Serão implementados nesse projeto, todos os métodos de ordenação disponíveis
    public static int trocas= 0;
    public void bbSort(int[] v) {
        int n = v.length;
        boolean houveTroca = true;
        while(houveTroca) {
            houveTroca = false;
            //talvez seja i < n-1 ou i <= n-1 == i < n
            for (int i = 0; i < n; i++) {
                if (v[i] > v[i+1]) {
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                    houveTroca = true;
                    trocas++;
                }
            }
        }
    }

    public void qsort(int[] v, int inicio, int fim){
        int esq = inicio;
        int dir = fim;
        int recalls = 0;
        int meio = v[(esq+dir) / 2];
        while(esq <= dir) {
            while (v[esq] < meio) { esq++; }
            while (v[dir] > meio) { dir--; }
            if (esq <= dir) {
                int aux = v[esq];
                v[esq] = v[dir];
                v[dir] = aux;
                esq++;
                dir--;
                trocas++;
            }
        }
        if (dir > inicio) {
            qsort(v, inicio, dir);
            recalls++;
        }
        if (esq < fim) {
            qsort(v, esq, fim);
            recalls++;
        }
    }

    public void inSort(int[] v) {
        int n = v.length;
        int deslocs = 0;
        for (int i = 1; i <= n; i++) {
            int new_value = v[i];
            int j = i;
            while(j > 0 && new_value < v[j-1]) {
                v[j] = v[j-1];
                j--;
                deslocs++;
            }
            v[j] = new_value;
        }
    }

    public void shellSort(int[] v) {
        int n = v.length - 1;
        int h = n;
        int deslocs = 0;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                int val = v[i];
                int j = i;
                while (j >= h && val < v[j-h]) {
                    v[j] = v[j - h];
                    j -= h;
                    deslocs++;
                }
                v[j] = val;
                trocas++;
            }
            h /=2;
        }

    }

    public void selecSort(int[] v) {
        int n = v.length - 1;
        int troca = 0;
        for (int i = 0; i < n; i++) {
            int menor = v[i];
            int posMenor = i;
            for (int j = i+1; j <= n; j++) {
                if (v[j] < menor) {
                    menor = v[j];
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                int aux = v[i];
                v[i] = menor;
                v[posMenor] = aux;
                troca++;
            }
        }
    }

    public void heapSort(int[] v) {
        int n = v.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(v, n, i);
        }

        for (int i = n-1; i > 0; i--) {
            troca(v, 0, i);
            trocas++;
            heapify(v, i, 0);
        }
    }

    private void heapify(int[] v, int n, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < n && v[esq] > v[maior]) {
            maior = esq;
        }
        if (dir < n && v[dir] > v[maior]) {
            maior = dir;
        }

        if (maior != i) {
            troca(v, i, maior);
            trocas++;
            heapify(v, n, maior);
        }
    }

    private void troca(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

    public void mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            intercala(v, inicio, meio, fim);
        }
    }

    private void intercala(int[]v, int inicio, int meio, int fim) {
        int[] vaux = v;
        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            if (vaux[i] <= vaux[j]) {
                v[k] = vaux[i];
                i++;
            } else {
                v[k] = vaux[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            v[k] = vaux[i];
            i++;
            k++;
        }

        while (j <= fim) {
            v[k] = vaux[j];
            j++;
            k++;
        }
    }
}
