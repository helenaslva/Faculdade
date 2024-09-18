package AvoresNarias;

public class NoArvore {
    private int info;
    private NoArvore primeiro;
    private  NoArvore proximo;

    public NoArvore(int info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public void inserirFilho(NoArvore no){
        //Atualizou o primeiro, e atalizou a referencia do proximo como o primeiro antes dele
        no.setProximo(getPrimeiro());
        this.setPrimeiro(no);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvore getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore proximo) {
        this.proximo = proximo;
    }
}
