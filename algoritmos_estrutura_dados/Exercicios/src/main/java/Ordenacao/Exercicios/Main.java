package Ordenacao.Exercicios;

public class Main {
    public static void main(String[] args) {
        Integer[] dados = new Integer[] {12,14,15,40,8,19, 35, 38};

        OrdenacaoMergeSort<Integer> ord = new OrdenacaoMergeSort<>();
        ord.setInfo(dados);
        ord.ordenar();
    }
}
