package Ordenacao.Mergesort;

public class Mergesort {
    private int[] info;

    public static void main(String[] args) {
        new Mergesort();
    }

    public Mergesort() {
        info = new int[] {38, 27, 43, 3, 9, 82, 10};
        mergeSort();

        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }

    private void mergeSort() {
        int n = info.length - 1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        int tamEsquerda = meio - inicio + 1;
        int[] esquerda = new int[tamEsquerda];
        for (int i = 0; i <= tamEsquerda - 1; i++) {
            esquerda[i] = info[inicio+i];
        }

        int tamDireita = fim - meio;
        int[] direita = new int[tamDireita];
        for (int i = 0; i <= tamDireita - 1; i++) {
            direita[i] = info[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;

        int i;
        for (i = inicio; i <= fim; i++) {
            if ((cEsq < tamEsquerda) && (cDir < tamDireita)) {
                if (esquerda[cEsq] < direita[cDir]) {
                    info[i] = esquerda[cEsq];
                    cEsq++;
                } else {
                    info[i] = direita[cDir];
                    cDir++;
                }
            } else {
                break;
            }
        }

        while (cEsq < tamEsquerda) {
            info[i] = esquerda[cEsq];
            cEsq++;
            i++;
        }

        while (cDir < tamDireita) {
            info[i] = direita[cDir];
            cDir++;
            i++;
        }
    }


    // Método para calcular e imprimir o número de etapas
    private void calculateStages() {
        int n = info.length;
        int stages = (int) (Math.log(n) / Math.log(2));
        System.out.println("Número de etapas: " + stages);
    }



}
