package AvoresNarias;

public class App {
    public static void main(String[] args) {
        NoArvore no4 = new NoArvore(4);
        NoArvore no3 = new NoArvore(3);
        no3.inserirFilho(no4);

        NoArvore no5 = new NoArvore(5);

        NoArvore no2 = new NoArvore(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no3);

        NoArvore no10 = new NoArvore(10);
        NoArvore no9 = new NoArvore(9);
        no9.inserirFilho(no10);

        NoArvore no8 = new NoArvore(8);

        NoArvore no7 = new NoArvore(7);
        no7.inserirFilho(no9);
        no7.inserirFilho(no8);

        NoArvore no6 = new NoArvore(6);

        NoArvore no1 = new NoArvore(1);

        no1.inserirFilho(no7);
        no1.inserirFilho(no6);
        no1.inserirFilho(no2);

        Arvore arvore = new Arvore();
        arvore.setRaiz(no1);

        System.out.println(arvore.toString());
    }
}
