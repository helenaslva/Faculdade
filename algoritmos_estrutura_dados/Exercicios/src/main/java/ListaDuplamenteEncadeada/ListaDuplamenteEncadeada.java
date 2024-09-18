package ListaDuplamenteEncadeada;

import Questao01Lista03.NoLista;

public class ListaDuplamenteEncadeada<T> {
    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoListaDupla<T> novo = new NoListaDupla<T>();

        novo.setInfo(info);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla buscar(T info) {
        NoListaDupla nodo = this.primeiro;
        while (!nodo.equals(null)) {
            if (nodo.getInfo().equals(info)) {
                return nodo;
            } else {
                nodo = nodo.getProximo();
            }
        }
        return null;
    }

    public void retirar(T info) {
        NoListaDupla<T> p = buscar(info);
        if (p != null) {
            if (p.getAnterior().equals(null)) {
                primeiro = p.getProximo();
                primeiro.setAnterior(null);
            } else {
                //pega o anterior do achado e coloca o próximo como sendo o próximo do achado
                p.getAnterior().setProximo(p.getProximo());
                //se o próximo de P(achado) for nulo, quer dizer que é o último, então se for diferente de nulo não é o ultimo.
                //pega o próximo e seta o anterior do próximo como o anterior do achado
                if (!p.getProximo().equals(null)) {
                    p.getProximo().setAnterior(p.getAnterior());
                }
            }
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p = primeiro;

        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        while (p != null) {
            System.out.print(p.getInfo());
            if (p.getAnterior() != null) {
                System.out.print(",");
            }
            p = p.getAnterior();
        }
    }

    public void liberar() {
        while (primeiro != null) {
            NoListaDupla<T> proximo = primeiro.getProximo();
            primeiro.setProximo(null);
            primeiro.setAnterior(null);
            primeiro = proximo;

        }
    }


    public String toString() {
        String str = "";
        NoListaDupla<T> p = primeiro;

        while (p != null) {
            if (p != primeiro)
                str += ",";
            str += p.getInfo().toString();
            p = p.getProximo();
        }
        return str;

    }
}
