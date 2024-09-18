package Busca.BuscaOrdenadaVetores;

public class BuscaListaVetor {

        private ListaEstaticaInt lista;

        public static void main(String[] args) {
            new BuscaListaVetor();
        }

        public BuscaListaVetor() {

            // Cria a lista
            this.lista = new ListaEstaticaInt(11);

            lista.inserir(1);
            lista.inserir(17);
            lista.inserir(20);
            lista.inserir(33);
            lista.inserir(43);
            lista.inserir(75);
            lista.inserir(80);
            lista.inserir(88);
            lista.inserir(92);
            lista.inserir(95);
            lista.inserir(98);


            //13,11,44,32,12,46,59;


            // Popula a lista
            //for (int i = 200; i <= 12000000; i++) {
              //  lista.inserir(i);
            //}

            // Busca um valor no pior caso com a pesquisa linear;
            buscaLinear();

            // Busca um valor no meio com a pesquisa linear ordenada;
            buscaLinearOrdenada();

            // Busca um valor no inexistente na pesquisa linear;
            buscaLinearInexistente();

            // Busca um valor no inexistente na pesquisa linear ordenada;
            buscaLinearOrdenadaInexistente();

            // Busca um valor no pior caso da pesquisa linear usando a pesquisa binaria;
            buscaBinaria();

            // Busca um valor no pior caso com a pesquisa Binária;
            buscaBinariaInexistente();

            buscaLinearMeio();

            buscaLinearOrdenadaMeio();
        }

        private void buscaLinear() {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinear(44);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA LINEAR: " + durationInsert + "ms");
        }

        private void buscaLinearMeio() {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinear(201);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA LINEAR NO MEIO: " + durationInsert + "ms");
        }

        private void buscaLinearInexistente( ) {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinear(12000005);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA LINEAR VALOR INEXISTENTE: " + durationInsert + "ms");
        }

        private void buscaLinearOrdenada() {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinearOrdenado(11999999);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA LINEAR ORDENADA: " + durationInsert + "ms");
        }

        private void buscaLinearOrdenadaMeio() {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinearOrdenado(201);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA NO MEIO LINEAR ORDENADA: " + durationInsert + "ms");
        }

        private void buscaLinearOrdenadaInexistente() {
            long startTimeInsert = System.nanoTime();

            lista.buscaLinearOrdenado(12000005);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA LINEAR ORDENADA VALOR INEXISTENTE: " + durationInsert + "ms");
        }

        private void buscaBinaria() {
            long startTimeInsert = System.nanoTime();

            lista.buscaBinaria(75);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA BINARIA: " + durationInsert + "ms");
        }


        private void buscaBinariaInexistente() {
            long startTimeInsert = System.nanoTime();

            lista.buscaBinaria(12000005);

            long endTimeInsert = System.nanoTime();
            long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
            System.out.println("Tempo total para LOCALIZAR na lista utilizando a PESQUISA BINARIA INEXISTENTE: " + durationInsert + "ms");
        }
}
