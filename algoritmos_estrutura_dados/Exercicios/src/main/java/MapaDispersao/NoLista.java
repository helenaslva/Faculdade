package MapaDispersao;

public class NoLista<T> {
    private T info;
    private Questao01Lista03.NoLista<T> proximo;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Questao01Lista03.NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(Questao01Lista03.NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
