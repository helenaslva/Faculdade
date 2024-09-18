package MapaDispersao;

import Questao01Lista03.ListaEncadeada;
import Questao01Lista03.NoLista;

public class MapaDispersao<T> {
    //Vetor de lista encadeada, as listas encadeadas irão armazenas os nós(itens) do mapa
    private ListaEncadeada<NoMapa<Integer>>[] info;


    ///Aqui é definino o M (tamanho do vetor)
    public MapaDispersao(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }

    // Basicamente - indice do vetor.
    public int calcularHash(int chave) {
        int tamanho = info.length;
        return chave % tamanho;
    }

    public void inserir(int chave, int dado) {
        //Corresponde a 1 lista encadeada do vetor info
        int indice = calcularHash(chave);

        //se o indice do vetor ainda não existir, ele cria um
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<NoMapa<Integer>>();
        }

        NoMapa<Integer> noMapa = new NoMapa<Integer>();
        noMapa.setChave(chave);
        noMapa.setInfo(dado);
        //atribuindo a uma variavel
        ListaEncadeada<NoMapa<Integer>> listaEncadeada = info[indice];
        listaEncadeada.inserir(noMapa);
//		info[indice].inserir(noMapa);
    }

    public Integer buscar(int chave) {
        int indice = calcularHash(chave);

        //verifica se existe uma lista (uma gavetinha) com esse indice
        if (info[indice] != null) {
            //isntancia uma variavel temporaria de nómapa, e atribui a chave a ela
            NoMapa<Integer> noTemp = new NoMapa<Integer>();
            noTemp.setChave(chave);

            //utiliza o método buscar da lista encadeada que retorna um nóLista encontrado
            NoLista<NoMapa<Integer>> no = info[indice].buscar(noTemp);
            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<Integer> noTemp = new NoMapa<Integer>();
            noTemp.setChave(chave);

            info[indice].retirar(noTemp);
        }
    }



    public boolean verificarColisao(int chave) {
        // Calcula o hash a partir da chave de busca
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            // Cria um objeto de mapeamento, estabelecendo apenas a chave de busca
            NoMapa<Integer> noTemp = new NoMapa<Integer>();
            noTemp.setChave(chave);

            // Procura o objeto na lista encadeada
            NoLista<NoMapa<Integer>> no = info[indice].buscar(noTemp);
            if (no != null) {
                // A chave já está presente, indicando uma colisão
                return true;
            }
        }

        // Nenhuma colisão encontrada
        return false;
    }

    public boolean verificarColisao1(int chave) {
        // Calcula o hash a partir da chave de busca
        int indice = calcularHash(chave);

        if (info[indice] != null && !info[indice].estaVazia()) {
            // A chave já está presente, indicando uma colisão
            return true;
        }

        // Nenhuma colisão encontrada
        return false;
    }

    public void realocarMapa(int novoTamanho){
        ListaEncadeada<NoMapa<Integer>>[] listaNova = new ListaEncadeada[novoTamanho];
        ListaEncadeada<NoMapa<Integer>> listaAuxiliar = new ListaEncadeada<>();
        for(int i = 0; i> info.length; i++){
            while (info[i].estaVazia()){
                NoMapa novoNo = new NoMapa();
                novoNo = info[i].getPrimeiro().getInfo();
                listaAuxiliar.inserir(novoNo);
                novoNo = info[i].getPrimeiro().getProximo().getInfo();
            }
            i++;
        }
        listaNova = this.info;
        while(listaAuxiliar.estaVazia()){
            NoLista<NoMapa<Integer>> noTemp = listaAuxiliar.getPrimeiro();
            int indice = calcularHash(noTemp.getInfo().getChave());
            if(info[indice] == null) {
                info[indice] = new ListaEncadeada<NoMapa<Integer>>();
            }
            ListaEncadeada<NoMapa<Integer>> listaEncadeada = info[indice];
            noTemp = listaAuxiliar.getPrimeiro().getProximo();
        }

    }
}
