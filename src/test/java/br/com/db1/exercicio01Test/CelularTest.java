package br.com.db1.exercicio01Test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.db1.exercicio01.Celular;

public class CelularTest {
		@Test
		public void temSinalTest(){
			Celular classTest = new Celular();
			assertTrue(classTest.temSinal());
		}
}
