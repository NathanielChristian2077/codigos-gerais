//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] v = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int[] v2 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int[] v3 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int[] v4 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int[] v5 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int[] v6 = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        Sort s = new Sort();
        s.qsort(v, 0, v.length - 1);
        s.bbsort(v2);
        s.inSort(v3);
        s.shell(v4);
        s.shellK(v5);
        s.selecSort(v6);

        System.out.println("\n----------Q----------");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("\nTrocas (Q): " + s.qcount);
        System.out.println("Chamadas recursivas: " + s.recCallsCount);

        System.out.println("\n----------BB----------");
        for (int i:v2){
            System.out.print(i + " ");
        }
        System.out.println("\nTrocas (BB): " + s.bbcount);

        System.out.println("\n----------IN----------");
        for (int i : v3) {
            System.out.print(i + " ");
        }
        System.out.println("\nDeslocamentos: " + s.inDeslocCount);

        System.out.println("\n----------SHELL----------");
        for (int i : v4) {
            System.out.print(i + " ");
        }
        System.out.println("\nTrocas: " + s.shellTrocas);
        System.out.println("Deslocamentos: " + s.shellDeslocamentos);

        System.out.println("\n----------SHELL2----------");
        for (int i : v5) {
            System.out.print(i + " ");
        }
        System.out.println("\nTrocas: " + s.shellTrocas2);
        System.out.println("Deslocamentos: " + s.shellDeslocamentos2);

        System.out.println("\n----------SELECTION----------");
        for (int i : v6) {
            System.out.print(i + " ");
        }
        System.out.println("\nTrocas: " + s.selecTrocas);
    }
}