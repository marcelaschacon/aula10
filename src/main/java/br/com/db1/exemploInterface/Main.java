package br.com.db1.exemploInterface;

public class Main {
		public static void main(String[] args) {
			Calculadora c = new Calculadora();
			c.realizarCalculo(new Soma(), 1, 2);
			System.out.println(c.exibirResultado());
			c.realizarCalculo(new Subtracao(), 10, 5);
			System.out.println(c.exibirResultado());
			c.realizarCalculo(new Divisao(), 10, 2);
			System.out.println(c.exibirResultado());
			c.realizarCalculo(new Multiplicacao(), 4, 5);
			System.out.println(c.exibirResultado());
		}
}