package AvoresNarias;

public class Arvore {
    private NoArvore raiz;


    public NoArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore raiz) {

        this.raiz = raiz;
    }

    public boolean pertence(int info){

        if(raiz == null){
            return false;
        }
        else{
            return pertence(raiz, info);
        }
    }

    public boolean pertence(NoArvore no, int info){
        if(no.getInfo() == info){
            return true;
        }
        else{
            NoArvore atual = no.getPrimeiro();
            while (atual != null){
                if(pertence(atual, info)){
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

    public String obterRepresentacaoTextual(NoArvore no){
        String representacaoTextual = "<" + no.getInfo();

        NoArvore atual = no.getPrimeiro();

        while (atual != null){
            representacaoTextual += obterRepresentacaoTextual(atual);
            atual = atual.getProximo();
        }

        representacaoTextual += ">";

        return  representacaoTextual;
    }

}
