package EstudosProvaUm.ListaEncadeadaGenerica;

public class ListaEncadeadaGenerica<T> {
    private NoLista<T> primeiro;


    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> nodo =  new NoLista<>();
        nodo.setInfo(valor);
        nodo.setProximo(getPrimeiro());
        this.primeiro = nodo;

    }

    public boolean estaVazia(){
        return this.primeiro == (null);
    }

    public NoLista buscar(T valor){
        NoLista<T> nodoAtual = getPrimeiro();
        while (nodoAtual != (null)){
            if(nodoAtual.getInfo().equals(valor)) {
                return nodoAtual;
            }
            nodoAtual = nodoAtual.getProximo();
        }
        return null;
    }

    public void retirar(T valor){
       NoLista<T> nodoAtual = getPrimeiro();
       NoLista<T> nodoAnterior = null;

       //Se o nodo atual for diferente de nulo e o seu info for diferente do valor a ser retirado, ele vai iterando todos os nodos na lista
       while ((nodoAtual != null) && (!nodoAtual.getInfo().equals(valor))) {
           nodoAnterior = nodoAtual;
           nodoAtual = nodoAnterior.getProximo();
       }

       //se cair do while, é porque o valor do nodo atual é igual ao valor para ser retirado
       if(nodoAtual != null){
           //se o nodo atual for igual ao primeiro nodo
           if (nodoAtual == getPrimeiro()){
               primeiro = nodoAtual.getProximo();
               //se não for o primeiro, o nodo anterior terá o seu próximo sendo o próximo do nodo atual, fazendo que o nodo atual seja "removido"
               //pois não terá mais referencia de ninguém
           }else{
               nodoAnterior.setProximo(nodoAtual.getProximo());
           }
       }
    }

    public int obterTamanho(){
        int qtdNos = 0;
        NoLista<T> atual = getPrimeiro();

        while (atual != null){
            qtdNos ++;
            atual = atual.getProximo();
        }

        return qtdNos;
    }

    public NoLista<T> obterNo(int posicao){
        if(posicao < 0  || posicao > obterTamanho()-1){
            throw new IllegalArgumentException();
        }

        NoLista<T> p = getPrimeiro();
        //vai iterar até chegar na um numero antes da posição. Quando chegar, retorna esse numero
        for (int i=0; i<posicao; i++) {
            p = p.getProximo();
        }
        //vai retornar o próximo do numero anterior a posiçõa, que seria o numero correto da posição.
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
