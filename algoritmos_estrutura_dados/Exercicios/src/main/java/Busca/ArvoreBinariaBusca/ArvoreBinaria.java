package Busca.ArvoreBinariaBusca;

public class ArvoreBinaria {
    private NoArvoreBinaria raiz;

    public NoArvoreBinaria getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(int info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, int info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }
    }

    public boolean pertenceContador(int info) {
        return pertenceContador(raiz, info);
    }

    private boolean pertenceContador(NoArvoreBinaria no, int info) {
        System.out.println("Chamou o método privado");
        if (no == null) {
            return false;
        } else {
            return (no.getInfo() == info)
                    || pertenceContador(no.getEsquerda(), info)
                    || pertenceContador(no.getDireita(), info);
        }
    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";
        } else {
            return "<" +
                    no.getInfo() +
                    arvorePre(no.getEsquerda()) +
                    arvorePre(no.getDireita()) +
                    ">";
        }
    }

    /**
     * Calcula a quantidade de nós existentes na árvore
     * @return Número de nós da árvore
     */
    public int contarNos() {
        return contarNos(raiz);
    }


    private int contarNos(NoArvoreBinaria no) {
        if (no == null) {
            return 0;
        } else {
            int qtdEsquerda = contarNos(no.getEsquerda());
            int qtdDireita = contarNos(no.getDireita());
            System.out.println("Info: " + no.getInfo()
                    + " Qtd esq:" + qtdEsquerda
                    + " Qtd dir:" + qtdDireita);
            return 1 + qtdEsquerda + qtdDireita;


        }
    }

    /**
     * Calcula a quantidade de nós existentes na árvore
     * @return Número de nós da árvore
     */
    public String visitarOrdemSimetrica() {
        return visitarOrdemSimetrica(raiz);
    }


    private String visitarOrdemSimetrica(NoArvoreBinaria no) {
        String visitas = "";
        if (no != null) {
            visitas += visitarOrdemSimetrica(no.getEsquerda());
            visitas += no.getInfo();
            visitas += ",";
            visitas += visitarOrdemSimetrica(no.getDireita());
            return visitas;

        }
        return visitas;
    }

    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    public NoArvoreBinaria buscar(NoArvoreBinaria no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor == no.getInfo()) {
            return no;
        } else {
            if (valor < no.getInfo()) {
                return buscar(no.getEsquerda(), valor);
            } else {
                return buscar(no.getDireita(), valor);
            }
        }
    }

    public NoArvoreBinaria buscaInterativa(int valor) {
        NoArvoreBinaria p = raiz;

        while (p != null && p.getInfo() != valor) {
            if (valor < p.getInfo()) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }

        return p;
    }

    public void inserir(int valor) {
        NoArvoreBinaria novo = new NoArvoreBinaria(valor);

        if (raiz == null) {
            raiz = novo;
        } else {
            NoArvoreBinaria p = raiz;

            while (true) {
                NoArvoreBinaria pai = p;
                if (valor < p.getInfo()) {
                    p = pai.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    p = pai.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }

    public void retirar(int info) {
        NoArvoreBinaria p = getRaiz();
        NoArvoreBinaria pai = null;
        boolean filhoEsquerda = false;

        // localiza o nó a ser removido:
        while ((p!=null) && (p.getInfo() != info)) {
            pai = p;

            if (info < p.getInfo()) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        if (p != null) { // achou dado a ser removido?
            // avalia se é nó folha:
            if ((p.getEsquerda()==null) && (p.getDireita()==null)) {
                // 1o. Caso
                if (p == getRaiz())
                    setRaiz(null);
                else {
                    if (filhoEsquerda)
                        pai.setEsquerda(null);
                    else
                        pai.setDireita(null);
                }
            } else {
                if (p.getDireita()==null) {
                    // nó com apenas um filho à esquerda
                    // 2o. Caso
                    if (p == getRaiz())
                        setRaiz(p.getEsquerda());
                    else {
                        if (filhoEsquerda)
                            pai.setEsquerda(p.getEsquerda());
                        else
                            pai.setDireita(p.getEsquerda());
                    }
                } else {
                    if (p.getEsquerda()==null) {
                        // nó com um apenas um filho à direita
                        // 2o. Caso
                        if (p == getRaiz())
                            setRaiz(p.getDireita());
                        else {
                            if (filhoEsquerda)
                                pai.setEsquerda(p.getDireita());
                            else
                                pai.setDireita(p.getDireita());
                        }
                    } else {
                        // nó com filho a esquerda e à direita
                        // 3o. caso
                        NoArvoreBinaria sucessor = extrairSucessor(p);
                        if (p == getRaiz())
                            setRaiz(sucessor);
                        else {
                            if (filhoEsquerda)
                                pai.setEsquerda(sucessor);
                            else
                                pai.setDireita(sucessor);
                        }
                        sucessor.setEsquerda(p.getEsquerda());
                    }
                }
            }
        }
    }

    /**
     * Retorna a altura da  rvore
     * @return altura da  rvore

    public int altura(){
    return altura(raiz);
    }

    private int altura(NoArvoreBinaria<T> no){
    if (no == null)
    return -1;
    else
    return 1 + Math.max(altura(no.getEsquerda()), altura(no.getDireita()));
    }


    public boolean isBalanceada() {
    return isBalanceada(getRaiz());
    }


    private boolean isBalanceada(NoArvoreBinaria<T> p) {
    if (p == null) {
    return true;
    } else {
    int qtdeNosEsquerda = altura(p.getEsquerda());
    int qtdeNosDireita  = altura(p.getDireita());
    int difAlturas = qtdeNosEsquerda - qtdeNosDireita;
    if (difAlturas < 0)
    difAlturas = difAlturas * -1;
    if (difAlturas > 1) {
    return false;
    } else {
    if (!isBalanceada(p.getEsquerda()))
    return false;
    else if (!isBalanceada(p.getDireita())) {
    return false;
    }

    return true;
    }
    }
    }
     */
    private NoArvoreBinaria extrairSucessor(NoArvoreBinaria p) {
        NoArvoreBinaria atual = p.getDireita();
        NoArvoreBinaria paiSucessor = p;
        NoArvoreBinaria sucessor = p;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }

        if (sucessor != p.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(p.getDireita());
        }

        return sucessor;
    }
}
