package Pilhas;

public class PilhaVetor<T> implements PilhaT<T> {
    private T[] info;
    private int limite;
    private int tamanho;

    /**
     * Cria uma pilha com o tamanho especificado
     * @param limite Capacidade máxima de empilhamento
     */
    public PilhaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }


    /**
     * Empilha um dado
     * @Param v Dado a ser empilhado
     */
    public void push(T info) {
        if (tamanho == limite)
            throw new PilhaCheiaException();
        else {
            this.info[tamanho] = info;
            tamanho++;
        }
    }


    /**
     * Retorna o conte�do do topo da pilha
     * @return topo da pilha
     */
    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return info[tamanho - 1];
    }


    /**
     * Retira um dado da pilha e devolver o dado removido
     * @return dado desempilhado
     */
    public T pop() {
        T valor = peek();
        info[tamanho - 1] = null;
        tamanho--;

        return valor;
    }




    /**
     * Retorna true se a pilha estiver vazia
     * @return true se a pilha estiver vazia ou false se não estiver
     */
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    /**
     * Desempilha todos os dados da pilha
     */
    public void liberar() {

        // 1a versao
        info = (T[]) new Object[limite];
        tamanho = 0;

        // 2a. implementação
        while (!estaVazia()) {
            pop();
        }

    }

    /**
     * Retorna o conteúdo da pilha,
     * partindo do topo até a base
     */
    @Override
    public String toString() {
        String resultado = "";

        for (int i = tamanho-1; i >= 0; i--) {
            resultado += info[i].toString();
            if (i > 0) {
                resultado = resultado + ",";
            }
        }

        return resultado;
    }

    /**
     * Concatena a pilha corrente com outra pilha.
     * @param p2 Pilha a ser concatenada à pilha atual
     */
    public void concatenar(PilhaVetor<T> p2) {
        for (int i=0; i<p2.tamanho; i++) {
            this.push(p2.info[i]);
        }
    }

}
