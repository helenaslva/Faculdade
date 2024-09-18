package Lista0301;


import java.time.LocalDate;

    public class RedeSocial {

        public static void main(String[] args) {
            ListaEncadeada<Publicacao> lista = new ListaEncadeada<>();

            LocalDate dateUm = LocalDate.now().plusYears(1);
            String nomeUm = "Helena Silva";

            Publicacao pub = new Publicacao(dateUm, nomeUm);
            lista.inserir(pub);

            //Inserir publicações na lista//////////////////////////////////////////
            long startTime = System.nanoTime();
            long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

            for (int i = 0; i < 55000; i++) {
                LocalDate date = LocalDate.now().plusDays(i);
                String nome = "Ralf" + i;

                lista.inserir(new Publicacao(date, nome));
            }

            long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long memoryUsed = memoryAfter - memoryBefore;
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos

            System.out.println("Tempo usado pela lista encadeada para inserir registros: " + duration + "ms");
            System.out.println("Memória usada pela lista encadeada para inserir registros: " + memoryUsed + " bytes");
            ////////////////////////////////////////////////////////////////////////


            //Buscar Pela data /////////////////////////////////////////////////////
            memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            startTime = System.nanoTime();

            lista.buscar(pub);

            memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            memoryUsed = memoryAfter - memoryBefore;
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
            System.out.println("Tempo usado pela lista encadeada para buscar 1 registros pela data: " + duration + "ms");
            System.out.println("Memória usada pela lista encadeada para buscar 1 registro pela data: " + memoryUsed + " bytes");
            ////////////////////////////////////////////////////////////////////////

            //Retirar publicação ///////////////////////////////////////////////////
            memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            startTime = System.nanoTime();

            lista.retirar(pub);

            memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            memoryUsed = memoryAfter - memoryBefore;
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
            System.out.println("Tempo usado pela lista encadeada para remover 1 registros: " + duration + "ms");
            System.out.println("Memória usada pela lista encadeada para remover 1 registro: " + memoryUsed + " bytes");
            ////////////////////////////////////////////////////////////////////////

            //Retirar publicação ///////////////////////////////////////////////////
            memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            startTime = System.nanoTime();

            lista.obterNo(250);

            memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            memoryUsed = memoryAfter - memoryBefore;
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
            System.out.println("Tempo usado pela lista encadeada para encontrar 1 registro pelo indice: " + duration + "ms");
            System.out.println("Memória usada pela lista encadeada para encontrar 1 registro pelo indice: " + memoryUsed + " bytes");
            ////////////////////////////////////////////////////////////////////////

            //Obter quantidade de elementos ///////////////////////////////////////
            memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            startTime = System.nanoTime();

            lista.obterComprimento();

            memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            memoryUsed = memoryAfter - memoryBefore;
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000; // Tempo em milissegundos
            System.out.println("Tempo usado pela lista encadeada para obter comprimento: " + duration + "ms");
            System.out.println("Memória usada pela lista encadeada para obter comprimento: " + memoryUsed + " bytes");
            ////////////////////////////////////////////////////////////////////////


        }
    }

