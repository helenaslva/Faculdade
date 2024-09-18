package Pilhas;

public class AppPilha {
    public static void main(String[] args) {
        Pilha pilhaEstatica = new PilhaEstatica(10);

//        pilhaEstatica.push(1);
//        System.out.println(pilhaEstatica.peek());
//        pilhaEstatica.push(2);
//        System.out.println(pilhaEstatica.peek());
//        pilhaEstatica.push(3);
//        System.out.println(pilhaEstatica.peek());
//
//        PilhaEstatica pilha = new PilhaEstatica(5);
//
//        pilha.push(1);
//        pilha.push(2);
//        pilha.push(3);
//        System.out.println(pilha.peek());
//        //System.out.println(pilha.toString());
//
//        PilhaEstatica pilhaConcatenar = new PilhaEstatica(6);
//
//        pilhaConcatenar.push(5);
//        pilhaConcatenar.push(4);
//
//        pilha.concatenar(pilhaConcatenar);
//
//        System.out.println(pilha.toString());;
//
    pilhaEstatica.push(10);
    pilhaEstatica.push(20);
    pilhaEstatica.push(30);
    pilhaEstatica.pop();
    pilhaEstatica.push(40);
    pilhaEstatica.peek();
    pilhaEstatica.push(pilhaEstatica.peek());
    pilhaEstatica.push(50);
    pilhaEstatica.pop();

        System.out.println(pilhaEstatica.toString());


    }
}
