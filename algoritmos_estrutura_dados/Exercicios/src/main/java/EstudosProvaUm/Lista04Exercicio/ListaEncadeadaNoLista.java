package EstudosProvaUm.Lista04Exercicio;

public class ListaEncadeadaNoLista<T> {
    private T info;
    private ListaEncadeadaNoLista<T> proximo;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public ListaEncadeadaNoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(ListaEncadeadaNoLista<T> proximo) {
        this.proximo = proximo;
    }

}
