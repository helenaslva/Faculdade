package Busca.BuscaOrdenadaVetores.Exercicios;

public abstract class ListaAbstract<T> {
    private T[] info;
    private int tamanho;

    /**
     * Cria uma lista vazia
     */
    public ListaAbstract() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho==0;
    }

    /**
     * Retorna o tamanho atual da lista, isto �,
     * a quantidade de dados j� armazenados na estrutura de dados
     * @return Quantidade de dados armazenados
     */
    public int getTamanho() {
        return tamanho;
    }


    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    /**
     * Cria um pseudo redimensionamento do vetor info
     */
    protected void redimensionar() {
        T[] novo = (T[]) new Object[tamanho+10];
        for (int i=0; i<tamanho; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }


    /**
     * Adiciona um dado na lista
     * @param dado dado a ser adicionado
     */
    public abstract void inserir(T dado);


    /**
     * Exibe o conte�do da lista
     */
    public void exibir() {
        for (int i=0; i<tamanho; i++)
            System.out.println(info[i]);
    }


    /**
     * Procura na lista um determinado dado
     * @param dado dado a ser pesquisado
     * @return posi��o do dado na lista. Caso n�o seja encontrado
     * retorna -1.
     */
    public abstract int buscar(T dado);

    /**
     * Retira um dado da lista
     * @param dado dado a ser removido
     */
    public void retirar(T dado) {
        int posicao = buscar(dado);
        if (posicao > -1) {
            for (int i=posicao; i<tamanho-1; i++) {
                info[i] = info[i+1];
            }

            // limpa ultima posi��o
            info[tamanho-1] = null;
            tamanho--;
        }
    }


    /**
     * limpa a estrutura de dados, de forma que a
     * lista esteja vazia
     */
    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }


    /**
     * Retorna o dado armazenado numa determinada posi��o
     * da lista.
     * @param pos Posi��o do dado
     * @return Dado localizado
     */
    public T obterElemento(int pos) {
        if (pos >= 0 && (pos < tamanho)) {
            return info[pos];
        } else {
            throw new IndexOutOfBoundsException("Posi��o inv�lida");
        }
    }


    /**
     * Retorna string contendo os dados armazenados na lista
     */
    @Override
    public String toString() {
        String resultado = "";

        for (int i=0; i<tamanho; i++) {
            if (i > 0)
                resultado += ",";
            resultado += info[i];
        }

        return resultado;
    }

    protected T[] getInfo() {
        return info;
    }


    /*


















     */


    /**
     * Avalia se o objeto corrente e outro objeto
     * s�o iguais
     * @param objeto outro objeto a ser comparado
     * @return true se os objetos s�o iguais
     */
    @Override
    public boolean equals(Object objeto) {
        if (objeto == null)
            return false;
        if (objeto == this)
            return true;
        if (this.getClass() != objeto.getClass())
            return false;

        ListaAbstract outraLista = (ListaAbstract) objeto;

        if (this.getTamanho() != outraLista.getTamanho())
            return false;

        for (int i=0; i<this.getTamanho(); i++) {
            if (!this.info[i].equals(outraLista.info[i]))
                return false;
        }

        return true;
    }
}
