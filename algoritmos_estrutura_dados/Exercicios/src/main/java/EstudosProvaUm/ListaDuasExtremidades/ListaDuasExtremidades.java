package EstudosProvaUm.ListaDuasExtremidades;

public class ListaDuasExtremidades {
    private NoListaEncadeadaDuasExtremidades primeiro;
    private NoListaEncadeadaDuasExtremidades ultimo;

    public NoListaEncadeadaDuasExtremidades getPrimeiro() {
        return primeiro;
    }

    public NoListaEncadeadaDuasExtremidades getUltimo() {
        return ultimo;
    }

    public void inserir(int info) {
        NoListaEncadeadaDuasExtremidades novo = new NoListaEncadeadaDuasExtremidades();
        novo.setInfo(info);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
        if (this.ultimo == null) {
            this.ultimo = novo;
        }
    }

    public void exibir() {
        NoListaEncadeadaDuasExtremidades nodo = this.primeiro;
        while (nodo != null) {
            System.out.println(nodo.getInfo());
            nodo = nodo.getProximo();
        }
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public NoListaEncadeadaDuasExtremidades buscar(int valor) {
        NoListaEncadeadaDuasExtremidades nodo = primeiro;
        while (nodo != null) {
            if (nodo.getInfo() == valor) {
                return nodo;
            } else {
                nodo = nodo.getProximo();
            }
        }
        return null;
    }

    public void retirar(int valor) {
        NoListaEncadeadaDuasExtremidades anterior = null;
        NoListaEncadeadaDuasExtremidades atual = this.primeiro;

        while (atual != null && atual.getInfo() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual != null) {
            if (atual.equals(this.primeiro)) {
                this.primeiro = atual.getProximo();
            } else {
                anterior.setProximo(atual.getProximo());
                if (atual.equals(ultimo)) {
                    ultimo = anterior;
                }
            }
        }

    }

}
