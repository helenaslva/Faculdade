package EstudosProvaUm.ListaCircular;

public class ListaCircular<T>{
    private NoListaCircular<T> primeiro;

    /**
     * Getter da variável primeiro
     *
     * @return Primeiro valor da lista
     */
    public NoListaCircular<T> getPrimeiro() {
        return this.primeiro;
    }

    /**
     * Insere um novo valor na lista
     *
     * @param info Valor a ser inserido na lista
     */
    public void inserir(T info) {
        NoListaCircular<T> novo = new NoListaCircular<>();
        novo.setInfo(info);
        novo.setProximo(getPrimeiro());

        NoListaCircular<T> ultimo = obterUltimo();
        if (ultimo != null) {
            ultimo.setProximo(novo);
        }

        this.primeiro = novo;

    }

    /**
     * Avalia se a lista está vazia ou não
     *
     * @return true se a lista estiver vazia
     */
    public boolean estaVazia() {
        return this.primeiro == null;
    }

    /**
     * Busca um elemento na lista encadeada
     *
     * @param info Dado a ser localizado
     * @return Elemento contendo o dado localizado
     */
    public NoListaCircular<T> buscar(T info) {
        NoListaCircular<T> atual = getPrimeiro();
        while (atual != null) {
            if (atual.getInfo().equals(info)) {
                return atual;
            }
            if (primeiro != atual.getProximo()) {
                atual = atual.getProximo();
            } else {
                atual = null;
            }
        }

        return null;
    }



    /**
     * Retira um dado da lista encadeada
     *
     * @param valor passado como parâmetro para ser retirado da lista encadeada
     */
    public void retirar(T valor) {
        NoListaCircular<T> anterior = null;
        NoListaCircular<T> atual = getPrimeiro();

        while ((atual != null) && (!atual.getInfo().equals(valor))) {
            anterior = atual;
            if (primeiro != atual.getProximo()) {
                atual = atual.getProximo();
            } else {
                atual = null;
            }
        }

        if (atual != null) {
            NoListaCircular<T> ultimo = obterUltimo();

            if (atual == primeiro) {
                primeiro = atual.getProximo();
                if (ultimo != null) {
                    ultimo.setProximo(primeiro);
                }
            } else {
                anterior.setProximo(atual.getProximo());
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

        NoListaCircular<T> atual = getPrimeiro();

        while (atual != null) {
            qtdeNos++;
            if (primeiro != atual.getProximo()) {
                atual = atual.getProximo();
            } else {
                atual = null;
            }
        }

        return qtdeNos;
    }

    public NoListaCircular<T> obterNo(int posicao) {
        if ((posicao < 0) || (posicao > obterComprimento()-1)) {
            throw new IndexOutOfBoundsException("Indice não existe");
        }

        NoListaCircular<T> p = getPrimeiro();
        for (int i=0; i<posicao; i++) {
            p = p.getProximo();
        }

        return p;
    }

    public void exibir() {
        NoListaCircular<T> atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getInfo());
            if (primeiro != atual.getProximo()) {
                atual = atual.getProximo();
            } else {
                atual = null;
            }
        }
    }

    /**
     * Retorna o último elemento da lista encadeada circular
     *
     * @return Nó armazenado na última posição
     */
    private NoListaCircular<T> obterUltimo() {
        NoListaCircular<T> ultimo = primeiro;

        NoListaCircular<T> p = primeiro;
        while (p != null) {

            ultimo = p;

            if (primeiro != p.getProximo()) {
                p = p.getProximo();
            } else {
                p = null;
            }
        }

        return ultimo;
    }

    @Override
    public String toString() {
        String resultado = "";
        NoListaCircular<T> atual = getPrimeiro();

        while (atual != null) {
            if (atual != getPrimeiro()) {
                resultado += ",";
            }

            resultado += atual.getInfo().toString();
            if (primeiro != atual.getProximo()) {
                atual = atual.getProximo();
            } else {
                atual = null;
            }
        }

        return resultado;
    }
}
