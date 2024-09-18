package AvoresNarias.Exercicios;


public class App {
    public static void main(String[] args) {
        NoArvore<Integer> n1 = new NoArvore<>(1);
        NoArvore<Integer> n2 = new NoArvore<>(2);
        NoArvore<Integer> n3 = new NoArvore<>(3);

        n3.inserirFilho(n2);
        n3.inserirFilho(n1);

        Arvore arvore = new Arvore();
        arvore.setRaiz(n3);

        System.out.println(arvore.toString());

       System.out.println(arvore.contarNos());
    }
}
