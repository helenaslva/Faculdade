package EstudosProvaUm.Lista04Exercicio;

import java.time.LocalDate;

public class DiarioClasse {
    public static void main(String[] args) {
        ListaEstatica<Aluno> lista = new ListaEstatica<>();

        // ################## A) Inserção ########################

        long memoryBeforeInsert = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeInsert = System.nanoTime();

        LocalDate dataInicial = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 550000; i++) {
            Aluno alu = new Aluno();
            alu.setData(dataInicial);
            alu.setNome("Nome do aluno: " + i);
            lista.inserir(alu);

            dataInicial.plusDays(1);
        }

        long memoryAfterInsert = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedInsert = memoryAfterInsert - memoryBeforeInsert;
        System.out.println("Memória usada para INSERIR na lista estática: " + memoryUsedInsert + " bytes");

        long endTimeInsert = System.nanoTime();
        // Tempo em milissegundos
        long durationInsert = (endTimeInsert - startTimeInsert) / 1000000;
        System.out.println("Tempo total para INSERIR na lista na lista estática: " + durationInsert + "ms");

        System.out.println("");
        // ################## C) Encontrar ########################

        long memoryBeforeFind = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeFind = System.nanoTime();

        LocalDate dataAlunoFind = LocalDate.of(2024, 1, 1);
        Aluno alunoFind = new Aluno();
        alunoFind.setData(dataAlunoFind);
        alunoFind.setNome("Nome do aluno: " + 0);

        lista.buscar(alunoFind);

        long memoryAfterFind = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedFind = memoryAfterFind - memoryBeforeFind;
        System.out.println("Memória usada para FIND na lista estática: " + memoryUsedFind + " bytes");

        long endTimeFind = System.nanoTime();
        // Tempo em milissegundos
        long durationFind = (endTimeFind - startTimeFind) / 1000000;
        System.out.println("Tempo total para FIND na lista na lista estática: " + durationFind + "ms");

        System.out.println("");
        // ################## B) Remoção ########################

        long memoryBeforeRemove = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeRemove = System.nanoTime();

        LocalDate dataAlunoRemove = LocalDate.of(2024, 1, 1);
        Aluno alunoRemove = new Aluno();
        alunoRemove.setData(dataAlunoRemove);
        alunoRemove.setNome("Nome do aluno: " + 0);

        lista.retirar(alunoRemove);

        long memoryAfterRemove = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedRemove = memoryAfterRemove - memoryBeforeRemove;
        System.out.println("Memória usada para REMOVE na lista estática: " + memoryUsedRemove + " bytes");

        long endTimeRemove = System.nanoTime();
        // Tempo em milissegundos
        long durationRemove = (endTimeRemove - startTimeRemove) / 1000000;
        System.out.println("Tempo total para REMOVE na lista na lista estática: " + durationRemove + "ms");

        System.out.println("");
        // ################## D) Encontrar por indice ########################

        long memoryBeforeFindIndex = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeFindIndex = System.nanoTime();

        lista.obterElemento(5000);

        long memoryAfterFindIndex = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedFindIndex = memoryAfterFindIndex - memoryBeforeFindIndex;
        System.out.println("Memória usada para FINDIndex na lista estática: " + memoryUsedFindIndex + " bytes");

        long endTimeFindIndex = System.nanoTime();
        // Tempo em milissegundos
        long durationFindIndex = (endTimeFindIndex - startTimeFindIndex) / 1000000;
        System.out.println("Tempo total para FINDIndex na lista na lista estática: " + durationFindIndex + "ms");

        System.out.println("");
        // ################## E) Quantidade de elementos ########################

        long memoryBeforeQtdElementos = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long startTimeQtdElementos = System.nanoTime();

        lista.getTamanho();

        long memoryAfterQtdElementos = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long memoryUsedQtdElementos = memoryAfterQtdElementos - memoryBeforeQtdElementos;
        System.out.println("Memória usada para QtdElementos na lista estática: " + memoryUsedQtdElementos + " bytes");

        long endTimeQtdElementos = System.nanoTime();
        // Tempo em milissegundos
        long durationQtdElementos = (endTimeQtdElementos - startTimeQtdElementos) / 1000000;
        System.out.println("Tempo total para QtdElementos na lista na lista estática: " + durationQtdElementos + "ms");
    }
}
