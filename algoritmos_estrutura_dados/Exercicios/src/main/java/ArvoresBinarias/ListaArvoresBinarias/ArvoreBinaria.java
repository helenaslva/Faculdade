package ArvoresBinarias.ListaArvoresBinarias;
public class ArvoreBinaria<T>{
    private NoArvoreBinaria raiz;

    public NoArvoreBinaria getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia(){
        return this.raiz == null;
    }

    public boolean pertence(T info){
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, T info){
        if(no == null){
            return false;
        }else{
            return (no.getInfo() == info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }

    }
    private String arvorePre(NoArvoreBinaria no){
        if(no == null){
            return "<>";
        }else{
            return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
        }
    }
    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    public int contarNos(){
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria no) {
        if(no == null){
            return 0;
        }else{
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }

    public int contarFolhas(NoArvoreBinaria<T> sa) {
        if (sa == null)
            return 0;
        else if (sa.getEsquerda() == null && sa.getDireita() == null)
            return 1;

        return contarFolhas(sa.getEsquerda()) + contarFolhas(sa.getDireita());
    }

}
