package EstudosProvaUm.ListaEstaticaGenerica;

public class App {
    public static void main(String[] args) {
       ListaEstaticaGenerica<Integer> listaEstatica = new ListaEstaticaGenerica<>();


        for (int i = 1; i<=11; i++){
            listaEstatica.inserir(i);
        }
        System.out.println("Tamanho: " + listaEstatica.getTamanho());
        for(int i = 1; i <= 10; i++){
            listaEstatica.retirar(i);
        }

        System.out.println("O tamanho é: " + listaEstatica.getTamanho());
    }
}
