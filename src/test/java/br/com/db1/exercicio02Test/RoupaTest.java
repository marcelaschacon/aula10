package br.com.db1.exercicio02Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1.exercicio02.Roupa;

import br.com.db1.exercicio02.Tamanho;

public class RoupaTest {
	
	@Test
	public void roupaTest(){
		Roupa classTest = new Roupa();
		classTest.setTamanho(Tamanho.GRANDE);
		assertTrue(classTest.getTamanho().equals(Tamanho.GRANDE));
		
		
	}

}
