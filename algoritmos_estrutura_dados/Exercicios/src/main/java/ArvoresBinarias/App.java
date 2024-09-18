package ArvoresBinarias;

public class App {
    public static void main(String[] args) {

//        NoArvoreBinaria no4 = new NoArvoreBinaria(2);
//        NoArvoreBinaria no5 = new NoArvoreBinaria(3);
//        NoArvoreBinaria no2 = new NoArvoreBinaria(1, no5, no4);
//
//        NoArvoreBinaria no7 = new NoArvoreBinaria()
//        NoArvoreBinaria no6 = new NoArvoreBinaria(6, no7, null);
//
//        NoArvoreBinaria no3 = new NoArvoreBinaria(3, null, no6);
//
//        NoArvoreBinaria no1 = new NoArvoreBinaria(1, no2, no3);
//
//        ArvoreBinaria arvore = new ArvoreBinaria();
//        arvore.setRaiz(no1);
//
//        System.out.println(arvore.toString());

        NoArvoreBinaria no3 = new NoArvoreBinaria(3);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, no3, null);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no1 = new NoArvoreBinaria(1, no2, no4);

        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.setRaiz(no1);

        System.out.println(arvore.isDegenerada(arvore.getRaiz()));
    }
}
