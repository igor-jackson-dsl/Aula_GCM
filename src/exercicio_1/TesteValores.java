package exercicio_1;

import junit.framework.TestCase;

public class TesteValores extends TestCase {
	private Valores val;

	protected void setUp() throws Exception {

		super.setUp();
		val = new Valores();
		
	}

	public void testIns() {
		//Inserindo valores positivos retorno deve ser true
		assertEquals(true, val.ins(2));
		assertEquals(true, val.ins(5));
		//Inserindo valor negativo deve retornar false
		assertEquals(false, val.ins(-1));
		//Inserindo valor maior que 10 deve retornar false
		assertEquals(false, val.ins(15));
		
		
	}

	public void testDel() {
		//deleta o array deve retornar -1
		assertEquals(-1,val.del(0));
		
	}
	public void testSize() {
		val.ins(1);
		val.ins(6);
		//deve retornar o tamanho do array
		assertEquals(2, val.size());
	}

}
