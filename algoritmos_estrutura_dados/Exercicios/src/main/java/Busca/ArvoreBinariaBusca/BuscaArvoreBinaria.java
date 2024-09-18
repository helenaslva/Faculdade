package Busca.ArvoreBinariaBusca;

public class BuscaArvoreBinaria {

        public static void main(String[] args) {

            ArvoreBinaria arvore = new ArvoreBinaria();
            arvore.inserir(50);
            arvore.inserir(20);
            arvore.inserir(10);
            arvore.inserir(35);
            arvore.inserir(70);
            arvore.inserir(60);
            arvore.inserir(60);


            System.out.println(arvore.toString());

            arvore.buscaInterativa(58);
            arvore.retirar(58);

            System.out.println(arvore.toString());
            System.out.println(arvore.contarNos());
        }

    }

