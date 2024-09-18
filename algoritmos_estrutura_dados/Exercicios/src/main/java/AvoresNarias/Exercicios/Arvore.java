package AvoresNarias.Exercicios;

public class Arvore<T> {
    private NoArvore raiz;
    private NoArvore proximo;
    private  NoArvore primeiro;

    public NoArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore raiz) {
        this.raiz = raiz;
    }

    public boolean pertence(T info){

        if(raiz == null){
            return false;
        }
        else{
            return pertence(raiz, info);
        }
    }

    public boolean pertence(NoArvore no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        } else {
            NoArvore atual = no.getPrimeiro();
            while (atual != null) {
                if (pertence(atual, info)) {
                    return true;
                }
                atual = atual.getProximo();
            }
        }
        return false;
    }

    @Override
    public String toString(){
        if(raiz == null){
            return "";
        }
        return obterRepresentacaoTextual(raiz);
    }

    private String obterRepresentacaoTextual(NoArvore no) {
        String representacaoTextual = "<" + no.getInfo().toString();
        NoArvore atual = no.getPrimeiro();
        while (atual != null){
            representacaoTextual += obterRepresentacaoTextual(atual);
            atual = atual.getProximo();
        }
        representacaoTextual += ">";

        return representacaoTextual;
    }
    public int contarNos(){
        if(raiz == null) {
            return 0;
        }

        return contarNos(raiz);

    }

    private int contarNos(NoArvore no) {
        int cont = 1;

        NoArvore atual = no.getPrimeiro();
        while (atual != null) {
            cont+=contarNos(atual);
            atual = atual.getProximo();
        }

        return cont;
    }




}
