package EstudosProvaUm.Lista04Exercicio;


import java.time.LocalDate;

public class RedeSocial {
    public static void main(String[] args) {
        ListaEncadeada<Publicacao> lista = new ListaEncadeada<>();

        // ################## A) Inserção ########################

        long memoryBeforeInsert = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeInsert = System.nanoTime();

        LocalDate dataInicial = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 550000; i++) {
            Publicacao pub = new Publicacao();
            pub.setData(dataInicial);
            pub.setTexto("Texto padrão número: " + i);
            lista.inserir(pub);

            dataInicial.plusDays(1);
        }

        long memoryAfterInsert = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedInsert = memoryAfterInsert - memoryBeforeInsert;
        System.out.println("Memória usada para INSERIR na lista encadeada: " + memoryUsedInsert + " bytes");

        long endTimeInsert = System.nanoTime();
        // Tempo em milissegundos
        long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
        System.out.println("Tempo total para INSERIR na lista na lista encadeada: " + durationInsert + "ms");

        System.out.println("");
        // ################## C) Encontrar ########################

        long memoryBeforeFind = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeFind = System.nanoTime();

        LocalDate dataPublicacaoFind = LocalDate.of(2024, 1, 1);
        Publicacao pubFind = new Publicacao();
        pubFind.setData(dataPublicacaoFind);
        pubFind.setTexto("Texto padrão número: " + 0);

        lista.buscar(pubFind);

        long memoryAfterFind = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedFind = memoryAfterFind - memoryBeforeFind;
        System.out.println("Memória usada para FIND na lista encadeada: " + memoryUsedFind + " bytes");

        long endTimeFind = System.nanoTime();
        // Tempo em milissegundos
        long durationFind = (endTimeFind - startTimeFind) / 1000000;
        System.out.println("Tempo total para FIND na lista na lista encadeada: " + durationFind + "ms");

        System.out.println("");
        // ################## B) Remoção ########################

        long memoryBeforeRemove = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeRemove = System.nanoTime();

        LocalDate dataPublicacao = LocalDate.of(2024, 1, 1);
        Publicacao pubRemove = new Publicacao();
        pubRemove.setData(dataPublicacao);
        pubRemove.setTexto("Texto padrão número: " + 0);

        lista.retirar(pubRemove);

        long memoryAfterRemove = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedRemove = memoryAfterRemove - memoryBeforeRemove;
        System.out.println("Memória usada para REMOVE na lista encadeada: " + memoryUsedRemove + " bytes");

        long endTimeRemove = System.nanoTime();
        // Tempo em milissegundos
        long durationRemove = (endTimeRemove - startTimeRemove) / 1000000;
        System.out.println("Tempo total para REMOVE na lista na lista encadeada: " + durationRemove + "ms");

        System.out.println("");
        // ################## D) Encontrar por indice ########################

        long memoryBeforeFindIndex = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeFindIndex = System.nanoTime();

        lista.obterNo(5000);

        long memoryAfterFindIndex = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedFindIndex = memoryAfterFindIndex - memoryBeforeFindIndex;
        System.out.println("Memória usada para FINDIndex na lista encadeada: " + memoryUsedFindIndex + " bytes");

        long endTimeFindIndex = System.nanoTime();
        // Tempo em milissegundos
        long durationFindIndex = (endTimeFindIndex - startTimeFindIndex) / 1000000;
        System.out.println("Tempo total para FINDIndex na lista na lista encadeada: " + durationFindIndex + "ms");

        System.out.println("");
        // ################## E) Quantidade de elementos ########################

        long memoryBeforeQtdElementos = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeQtdElementos = System.nanoTime();

        lista.obterComprimento();

        long memoryAfterQtdElementos = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedQtdElementos = memoryAfterQtdElementos - memoryBeforeQtdElementos;
        System.out.println("Memória usada para QtdElementos na lista encadeada: " + memoryUsedQtdElementos + " bytes");

        long endTimeQtdElementos = System.nanoTime();
        // Tempo em milissegundos
        long durationQtdElementos = (endTimeQtdElementos - startTimeQtdElementos) / 1000000;
        System.out.println("Tempo total para QtdElementos na lista na lista encadeada: " + durationQtdElementos + "ms");
    }
}
