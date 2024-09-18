package MapaDispersao.Exercicio;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info){
        NoLista nodo =  new NoLista();
        nodo.setInfo(info);
        nodo.setProximo(this.primeiro);
        this.primeiro = nodo;
    }

    public boolean estaVazia(){
        return this.primeiro.equals(null);
    }

    public NoLista buscar(T info){
        NoLista nodo = this.primeiro;
        while (!nodo.equals(null)){
            if(nodo.getInfo().equals(info)){
                return nodo;
            }else{
                nodo = nodo.getProximo();
            }
        }
        return null;
    }

    public void retirar(T info){
        {
            NoLista<T> anterior = null;
            NoLista<T> atual = getPrimeiro();

            while ((atual != null) && (!atual.getInfo().equals(info))) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (atual != null) {
                if (atual.equals(primeiro)) {
                    primeiro = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
            }
        }
    }

    /**
     * Calcula a quantidade de nós da lista
     *
     * @return quantidade de elementos da lista
     */
    public int obterComprimento() {
        int qtdeNos = 0;

        NoLista<T> atual = getPrimeiro();

        while (atual != null) {
            qtdeNos++;
            atual = atual.getProximo();
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

    public void exibir() {
        NoLista<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getProximo();
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        NoLista<T> atual = getPrimeiro();

        while (atual != null) {
            if (atual != getPrimeiro()) {
                resultado += ",";
            }

            resultado += atual.getInfo().toString();
            atual = atual.getProximo();
        }

        return resultado;
    }
}
