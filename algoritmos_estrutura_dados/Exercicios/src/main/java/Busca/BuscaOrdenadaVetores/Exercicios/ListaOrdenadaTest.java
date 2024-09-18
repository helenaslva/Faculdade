package Busca.BuscaOrdenadaVetores.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class ListaOrdenadaTest {
    private ListaAbstract<Integer> lista = new ListaOrdenada<>();

    @Test
    public void test1() {
        lista.inserir(100);
        lista.inserir(20);
        lista.inserir(70);
        lista.inserir(1);
        assertEquals( "1,20,70,100", lista.toString() );
    }

    @Test
    public void testnovo() {
        lista.inserir(1);
        lista.inserir(20);
        lista.inserir(70);
        lista.inserir(100);
        assertEquals( "1,20,70,100", lista.toString() );
    }

    @Test
    public void testnovo2() {
        lista.inserir(7);
        lista.inserir(8);
        lista.inserir(12);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        assertEquals( "7,8,12,20,30,40", lista.toString() );
    }

    private void alimentarLista() {
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
    }

    public void test2() {
        alimentarLista();
        assertEquals(2, lista.buscar(20));
    }

    public void test3() {
        alimentarLista();
        assertEquals(4, lista.buscar(40));
    }

    public void test4() {
        alimentarLista();
        assertEquals(7, lista.buscar(70));
    }

    public void test5() {
        alimentarLista();
        assertEquals(10, lista.buscar(100));
    }

    public void test6() {
        alimentarLista();
        assertEquals(-1, lista.buscar(85));
    }





	/*
	@Test
	public void test2() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<>();
		lista.inserir(100);
		lista.inserir(1);
		lista.inserir(10);
		lista.inserir(5);
		assertEquals("1,5,10,100", lista.toString() );
	}

	@Test
	public void test3() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<>();
		lista.inserir(1);
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.inserir(25);
		lista.inserir(30);
		lista.inserir(35);
		lista.inserir(40);
		lista.inserir(45);
		lista.inserir(50);

		assertEquals("1,5,10,15,20,25,30,35,40,45,50", lista.toString() );
	}


	@Test
	public void test4() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<>();
		lista.inserir(1);
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.inserir(25);
		lista.inserir(30);
		lista.inserir(35);
		lista.inserir(40);
		lista.inserir(45);
		lista.inserir(-1);

		assertEquals("-1,1,5,10,15,20,25,30,35,40,45", lista.toString() );
	}


	@Test
	public void test5() {
		ListaOrdenada<Integer> lista = new ListaOrdenada<>();
		lista.inserir(0);
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		lista.inserir(40);
		lista.inserir(50);
		lista.inserir(60);
		lista.inserir(70);
		lista.inserir(80);
		lista.inserir(90);
		lista.inserir(100);

		assertEquals(2, lista.buscar(20));
		assertEquals(4, lista.buscar(40));
		assertEquals(7, lista.buscar(70));
		assertEquals(10, lista.buscar(100));
		assertEquals(-1, lista.buscar(55));
	}

	 */
}
