package Ordenacao.Quicksort;

public class Quicksort {

    private int[] info;

    public static void main(String[] args) {
        new Quicksort();
    }

    public Quicksort() {
        info = new int[]{60, 36, 89, 56, 90, 44, 1};
        quickSort();

        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }

    private void quickSort() {
        int n = info.length - 1;
        quickSort(0, n);
    }

    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {

        int a = inicio;
        int b = fim+1;

        int pivo = info[inicio];

        while (true) {
            do {
                a++;
            } while (a <= fim && info[a] < pivo);

            do {
                b--;
            } while (b >= inicio && info[b] > pivo);

            if (a >= b) {
                break;
            }

            trocar(info, a, b);

        }

        trocar(info, b, inicio);

        return b;
    }

    private void trocar(int[] info, int pos1, int pos2) {
        int temp = info[pos1];
        info[pos1] = info[pos2];
        info[pos2] = temp;
    }

}
