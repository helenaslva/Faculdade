package Filas;

public class AppFila {
    public static void main(String[] args) {
        FilaVetor fila = new FilaVetor(5);

        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        fila.inserir(5);
        fila.retirar();


        System.out.println(fila.toString());
    }
}
