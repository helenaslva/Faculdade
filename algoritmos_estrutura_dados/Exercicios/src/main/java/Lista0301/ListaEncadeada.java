package Lista0301;

import java.util.Date;

public class ListaEncadeada<T> {
    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    private NoLista<T> primeiro;


    public void inserir(T info){
        NoLista novo = new NoLista();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public void retirar(T valor) {
        NoLista anterior = null;
        NoLista atual = primeiro;

        while (atual != null && !atual.getInfo().equals(valor)){
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            if (atual == primeiro) {
                this.primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
            }
        }
    }

    public NoLista<T> buscar(T info) {
        NoLista<T> atual = getPrimeiro();
        while (atual != null) {
            if (atual.getInfo().equals(info)) {
                return atual;
            }
            atual = atual.getProximo();
        }

        return null;
    }
    public int obterComprimento() {
        int qtdeNos = 0;

        NoLista<T> p = getPrimeiro();

        while (p != null) {
            qtdeNos++;
            p = p.getProximo();
        }

        return qtdeNos;
    }
    public NoLista<T> obterNo(int posicao) {
        if ((posicao < 0) || (posicao > obterComprimento()-1)) {
            throw new IllegalArgumentException("Indice não existe");
        }

        NoLista<T> p = getPrimeiro();
        for (int i=0; i<posicao; i++) {
            p = p.getProximo();
        }

        return p;
    }
}