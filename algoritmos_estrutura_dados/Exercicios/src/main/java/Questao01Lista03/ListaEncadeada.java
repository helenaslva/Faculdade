package Questao01Lista03;

public class ListaEncadeada<T>{
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
}
