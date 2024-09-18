package AvoresNarias.Exercicios;

public class NoArvore<T>{
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    private T info;
    private NoArvore primeiro;
    private NoArvore proximo;

    public NoArvore(T info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public void inserirFilho(NoArvore no){
        no.setProximo(getPrimeiro());
        this.setPrimeiro(no);
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
