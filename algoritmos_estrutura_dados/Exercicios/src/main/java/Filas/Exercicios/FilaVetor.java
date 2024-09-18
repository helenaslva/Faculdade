package Filas.Exercicios;

import java.util.Arrays;

public class FilaVetor<T> implements Fila<T>{
    private T info[];

    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    public int getLimite() {
        return limite;
    }
    @Override
    public void inserir(T valor) {
        if(tamanho == limite){
            throw new RuntimeException("A fila está cheia");
        }

        int posicao = (inicio + tamanho) % limite;
        info[posicao] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()){
            throw new RuntimeException("A lista está vazia!");
        }
        return info[inicio];
    }

    public void encolher() {

        Object[] novaInfo = new Object[this.tamanho];

        for (int i = 0; i < this.tamanho; i++) {
            novaInfo[i] = info[(inicio + i) % limite];
        }

        this.info = (T[]) novaInfo;
        this.limite = tamanho;
        this.inicio = 0;
    }

    @Override
    public T retirar() {
        if(estaVazia()){
            throw new RuntimeException("A fila está vazia");
        }
        T valor = peek();

        info[inicio] = null;

        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
        inicio = 0;
    }

    public FilaVetor criarFilaConcatenada(FilaVetor filaDois){
        int limiteTotal = this.limite + filaDois.limite;
        int tamanhoTotal = tamanho + filaDois.tamanho;
        FilaVetor filaTres = new FilaVetor(limiteTotal);

        for(int i = 0; i<limite; i++){
            if(this.info[i] != null) {
                filaTres.inserir(info[i]);
            }
        }

        for (int j = 0; j<filaDois.limite; j++){
            if(filaDois.info[j] != null) {
                filaTres.inserir(filaDois.info[j]);
            }

        }

        filaTres.tamanho = tamanhoTotal;
        return filaTres;


//        ou
//        public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
//            FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);
//
//            int indice;
//
//            indice = this.inicio;
//            for (int i = 0; i < this.tamanho; i++) {
//                if (this.info[indice] != null) {
//                    f3.inserir(this.info[indice]);
//                }
//                indice = (indice + 1) % this.limite;
//            }
//
//            // copia dados da fila atual
//            indice = f2.inicio;
//            for (int i = 0; i < f2.tamanho; i++) {
//                if (this.info[indice] != null) {
//                    f3.inserir(f2.info[indice]);
//                }
//                indice = (indice + 1) % f2.limite;
//            }
//
//            return f3;
//        }
//
//        /**
//         * Cria uma nova fila, tomando como base uma fila pr�-existente
//         *
//         * @param f2
//         * @return
//         */
//        public FilaVetor<T> criarFilaConcatenada2(FilaVetor<T> f2) {
//            FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);
//
//            copiarDadosFila(this, f3);
//            copiarDadosFila(f2, f3);
//
//            return f3;
//        }
//
//        /**
//         * Copia os dados de uma fila para outra.
//         *
//         * @param origem  Fila de origem. Os dados ser�o copiados desta fila
//         * @param destino Fila de destino. Os dados ser�o copiados para esta fila
//         */
//        private void copiarDadosFila(FilaVetor<T> origem, FilaVetor<T> destino) {
//            int indice = origem.inicio;
//            for (int i = 0; i < origem.tamanho; i++) {
//                destino.inserir(this.info[indice]);
//                indice = (indice + 1) % limite;
//            }
//
//        }

    }


    @Override
    public String toString() {
        return "FilaVetor{" +
                "info=" + Arrays.toString(info) +
                ", limite=" + limite +
                ", tamanho=" + tamanho +
                ", inicio=" + inicio +
                '}';
    }
}
