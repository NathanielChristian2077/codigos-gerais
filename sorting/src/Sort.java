public class Sort {
    public int bbcount = 0;
    public int qcount = 0;
    public int recCallsCount = 0;
    public int inDeslocCount = 0;
    public int shellTrocas = 0;
    public int shellDeslocamentos = 0;
    public int shellTrocas2 = 0;
    public int shellDeslocamentos2 = 0;
    public int selecTrocas = 0;

    public void bbsort(int[] v) {
        int n = v.length;
        boolean switched = true;
        while (switched) {
            switched = false;
            for (int i = 0; i < n - 1; i++) {
                if (v[i] > v[i + 1]) {
                    bbcount++;
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    switched = true;
                }
            }
        }
    }

    public void qsort(int[] v, int inicio, int fim) {
        int esq = inicio;
        int dir = fim;
        int pivo = v[(esq + dir) / 2];

        while (esq <= dir) {
            while (v[esq] < pivo) {esq += 1;}
            while (v[dir] > pivo) {dir -= 1;}
            if (esq <= dir ) {
                int aux = v[esq];
                v[esq] = v[dir];
                v[dir] = aux;
                esq += 1;
                dir -= 1;
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

    public void inSort(int[] v){
        int n = v.length;

        for (int i = 1; i < n; i++) {
            int novoValor = v[i];
            int j = i;
            while (j > 0 && novoValor < v[j-1]) {
                inDeslocCount++;
                v[j] = v[j-1];
                j--; 
            }
            v[j] = novoValor;
        }
    }

    public void shell(int[] v){
        int n = v.length - 1;
        int h = n;

        while (h > 0) {
            shellDeslocamentos++;
            for (int i = h; i <= n; i++) {
                int valor = v[i];
                int  j = i;
                while (j >= h && valor < v[j - h]) {
                    v[j] = v[j-h];
                    j -= h;
                    shellTrocas++;
                }
                v[j] = valor;
            }
            shellTrocas--;
            h /= 2;
        }
        shellDeslocamentos++;
        shellTrocas--;
    }

    public void shellK(int[] v){
        int n = v.length - 1;
        int h = 1;

        for (int i = 1; i < n; i++) {
            h = 3*h + 1;
        }
        h /= 3;

        while (h > 0) {
            shellDeslocamentos2++;
            for (int i = h; i <= n; i++) {
                int valor = v[i];
                int  j = i;
                while (j >= h && valor < v[j - h]) {
                    v[j] = v[j-h];
                    j -= h;
                    shellTrocas2++;
                }
                v[j] = valor;
            }
            h /= 2;
            shellTrocas2--;
        }
        shellTrocas2--;
        shellDeslocamentos2++;
    }

    public void selecSort(int[] v) {
        int n = v.length - 1;
        for (int i = 0; i <= n - 1; i++) {
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
                selecTrocas++;
            }
        }
    }

    //public void hpSort() {} // Utiliza Árvores, ainda não implementável
}
