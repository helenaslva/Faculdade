import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Escritorio escritorio = new Escritorio();

        //criando instancias de pessoa
        Pessoa pessoa1 = new PessoaFisica("Larissa Bernardes", "12345678965");
        Pessoa pessoa2 = new PessoaJuridica("Latam", "156748312456");
        Pessoa pessoa3 = new PessoaFisica("Rogéria da Silva", "78945612387");
        Pessoa pessoa4 = new PessoaFisica("Leandro da Paz", "1567534895");
        Pessoa pessoa5 = new PessoaJuridica("Furb", "45165648984");
        Pessoa pessoa6 = new PessoaJuridica("Blumob", "5465246542");

        //criando instancias de advogado e secretaria
        Advogado advogado1 = new Advogado("Alberto Rocha", "betinho", "bebeto", "321");
        Advogado advogado2 = new Advogado("Penelope Mendes", "pepezinha", "maozona2000", "543");
        Secretaria secretaria1 = new Secretaria("Rose Cruz", "rosa123", "cravo321", "146876");
        Secretaria secretaria2 = new Secretaria("Laura Borges", "laurinda", "laufeia", "453321");

        //criando varas e adicionando instancias em duas listas diferentes
        Vara vara1 = new Vara("Vara da Fazenda Pública");
        Vara vara2  = new Vara("Vara Cível");
        Vara vara3 = new Vara("Vara Criminal");
        Vara vara4 = new Vara("Vara da Família");
        ArrayList<Vara> varas = new ArrayList<>(Arrays.asList(vara2, vara3, vara4));
        ArrayList<Vara> varas1 = new ArrayList<>(Arrays.asList(vara1));

        //criando custas
        Custa custaDois = new Custa("2015-06-05", "Papelaria", 250.0);
        Custa custaUm = new Custa("2023/11/11", "Alimentação", 1500.0);

        //criando tribunais e adicionando as listas de varas
        Tribunal umTribunal = new Tribunal("STF", varas);
        Tribunal doisTribunal = new Tribunal("STJ", varas1);

        //criando processos
        Processo umProcesso = new Processo("1", StatusProcesso.EM_ANDAMENTO, "Larissa foi parar na Turquia", pessoa1, pessoa2, secretaria1, advogado1);
        Processo doisProcesso = new Processo("2", StatusProcesso.FECHADO, "Roubo de ônibus", pessoa6,pessoa3, secretaria2, advogado1);
        Processo tresProcesso = new Processo("3", StatusProcesso.FECHADO, "Disputa reitoria Furb", pessoa4, pessoa5, secretaria2, advogado2);

        //criando audiencias e atribuindo processos
        Audiencia umaAudiencia = new Audiencia("2023/11/11", "O tribunal recomenda que as partes envolvidas busquem um acordo por meio de mediação para resolver a disputa de forma amigável", umProcesso);
        Audiencia duasAudiencia = new Audiencia("2023/10/11", "O tribunal recomenda o cumprimento provisório da obrigação de pagamento até a decisão final do processo", doisProcesso);
        Audiencia tresAudiencia = new Audiencia("2015/05/07", "O tribunal recomenda que a parte autora submeta evidências adicionais que comprovem suas alegações até a próxima audiência", tresProcesso);
        Audiencia quatroAudiencia = new Audiencia("2001/12/04", "Devido à necessidade de mais investigações, o tribunal recomenda a suspensão temporária do processo até a apresentação de novos fatos", doisProcesso);

        //testando os metodos de adicionar tribunal, audiencia, custa e vara
        umProcesso.adicionarTribunal(umTribunal);
        doisProcesso.adicionarTribunal(doisTribunal);
        tresProcesso.adicionarTribunal(doisTribunal);
        doisProcesso.adicionarVara(vara1);
        umProcesso.adicionarVara(vara4);
        umProcesso.adicionarCustas(custaUm);
        umProcesso.adicionarCustas(custaDois);
        doisProcesso.adicionarCustas(custaDois);
        umProcesso.adicionarAudiencia(umaAudiencia);
        doisProcesso.adicionarAudiencia(duasAudiencia);
        tresProcesso.adicionarAudiencia(tresAudiencia);
        doisProcesso.adicionarAudiencia(quatroAudiencia);
        umProcesso.processoGanho(true);
        doisProcesso.processoGanho(false);
        tresProcesso.processoGanho(true);

        //testando metodo de mudanca de status
        tresProcesso.mudarStatus();

        //adicionando os processos ao escritorio
        escritorio.adicionarProcesso(umProcesso);
        escritorio.adicionarProcesso(doisProcesso);
        escritorio.adicionarProcesso(tresProcesso);

        //testando os metodos de escritorio
        try {
            System.out.println("---------------------------------------------------");

            //metodo para encontrar processo a partir de seu codigo
            Processo processoEncontrado = escritorio.buscarProcesso("2");
            System.out.println("Processo encontrado: " + processoEncontrado);

            System.out.println("---------------------------------------------------");

            //metodo para imprimir processos que estão com status em aberto(true)
            List<Processo> processosAbertos = escritorio.listarProcessosAbertos();
            System.out.println("Processos em aberto: " + processosAbertos);

            System.out.println("---------------------------------------------------");

            //metodo para imprimir as custas de um processo a partir de seu codigo
            List<Custa> despesaProcesso = escritorio.consultaDespesa("1");
            System.out.println("Despesas do processo: " + despesaProcesso);

            System.out.println("---------------------------------------------------");

            //metodo para imprimir todos os processos relacionados ao advogado, a partir de sua instancia
            List<Processo> processosAdvogado = escritorio.processosAdvogado(advogado1);
            System.out.println("Processos do advogado: " + processosAdvogado);


        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }


        //testando adicionar vara que nao pertence ao tribunal atribuido
        try {
            Processo processo = new Processo("4", StatusProcesso.EM_ANDAMENTO, "Teste", pessoa1, pessoa2, secretaria1, advogado1);
            processo.adicionarTribunal(doisTribunal);
            processo.adicionarVara(vara3);
        } catch (IllegalArgumentException e){
            System.out.println("Erro ao adicionar vara: " + e.getMessage());
        }
    }
}
