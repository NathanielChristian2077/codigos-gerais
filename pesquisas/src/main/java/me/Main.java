package me;

public class Main {
    public static void main(String[] args) {
        Pesquisa finder = new Pesquisa();
        
        int[] v = {10, 20, 30, 40, 100};

        finder.pesquisaBinaria(v, 100);
        finder.pesquisaBinaria(v, 10);
        finder.pesquisaBinaria(v, 200); // Loop infinito.
        
        finder.pesquisaSequencial(v, 100);
        finder.pesquisaSequencial(v, 10);
        finder.pesquisaSequencial(v, 0); // Exception.

        int [] v2 = {20, 10, 15, 11};

        finder.pesquisaBinaria(v2, 11);
        finder.pesquisaBinaria(v2, 20);
        finder.pesquisaBinaria(v2, 0);

        finder.pesquisaSequencial(v2, 11);
        finder.pesquisaSequencial(v2, 20);
        finder.pesquisaSequencial(v2, 0);
    }
}