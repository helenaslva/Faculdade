package EstudosProvaUm.ListaDuplamenteEncadeada;

import EstudosProvaUm.ListaEncadeadaGenerica.NoLista;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    /**
     * Inclui um novo dado na estrutura de dados
     *
     * @param valor Dado a ser inserido na lista encadeada
     */
    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    /**
     * Busca um nó na estrutura de dados que esteja armazenando o dado fornecido
     * como argumento
     *
     * @param valor Valor a ser localizado
     * @return Nó contendo o dado
     */
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> atual = getPrimeiro();

        while (atual != null) {
            if (atual.getInfo().equals(valor))
                return atual;
            atual = atual.getProximo();
        }

        return null;
    }

    public ListaDupla<T> clonar(){
        NoListaDupla<T> atual = obterUltimo();
        ListaDupla<T> listaDupla = new ListaDupla<>();

        while (atual != null){

            listaDupla.inserir(atual.getInfo());
            atual = atual.getAnterior();
        }
            return listaDupla;
    }

    /**
     * Retira da estrutura de dados um dado armazenado na lista
     *
     * @param valor Valor a ser retirado
     */
    public void retirar(T valor) {
        NoListaDupla<T> atual = buscar(valor);

        if (atual != null) {
            if (primeiro == atual) {
                primeiro = atual.getProximo();
            }
            else
                atual.getAnterior().setProximo(atual.getProximo());

            if (atual.getProximo() != null) {
                atual.getProximo().setAnterior(atual.getAnterior());
            }
        }
    }
//1 até 10, 11 até 20 (1), 21 até 31(2), 31 até 40(3), 41 até 50(4)
    /**
     * Retorna o último elemento da lista encadeada
     *
     * @return Nó armazenado na última posição
     */
    public NoListaDupla<T> obterUltimo() {
        NoListaDupla<T> ultimo = primeiro;

        NoListaDupla<T> p = primeiro;
        while (p != null) {

            ultimo = p;

            p = p.getProximo();
        }

        return ultimo;
    }

    /**
     * Exibe o conteúdo da lista encadeada começando a exibir primeiro o último
     * elemento
     */
    public void exibirOrdemInversa() {
        NoListaDupla<T> p = obterUltimo();

        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnterior();
        }
    }

    public void liberar() {
        NoListaDupla<T> atual = primeiro;
        while (atual!=null) {
            NoListaDupla<T> proximo = atual.getProximo();
            atual.setAnterior(null);
            atual.setProximo(null);

            atual = proximo;
        }
        primeiro = null;
    }

    /**
     * Retorna representação textual da lista
     */
    public String toString() {
        String resultado = "";
        NoListaDupla<T> p = primeiro;

        while (p != null) {
            if (p != primeiro) {
                resultado += ",";
            }

            resultado += p.getInfo().toString();
            p = p.getProximo();
        }

        return resultado;
    }
}
