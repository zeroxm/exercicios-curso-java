/**
 * 
 */
package secao_06_estrutura_for;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
/**
 * @author andre
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
//		main.exercicio01();
//		main.exercicio02();
//		main.exercicio03();
//		main.exercicio04();
//		main.exercicio05();
//		main.exercicio06();
		main.exercicio07();


	}

	/**
	 * Leia um valor inteiro X (1 <= X <= 1000). 
	 * Em seguida mostre os ímpares de 1 até X, um valor por linha, 
	 * inclusive o X, se for o caso.
	 */
	protected void exercicio01() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro X (1 <= X <= 1000):");
		int x = sc.nextInt();
		
		if(x < 1 || x > 1000) {
			System.out.println("Valor inválido");
			return;
		}
		
		for (int i = 0; i <= x; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Leia um valor inteiro N. 
	 * Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
	 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos 
	 * estão fora do intervalo, mostrando essas informações conforme exemplo 
	 * (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
	 */
	protected void exercicio02() {
		Scanner sc = new Scanner(System.in);

		int in = 0, out = 0, x;
		
		int n = lerNumeroN(sc);
		
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	}

	/**
	 * @param sc
	 * @return
	 */
	protected int lerNumeroN(Scanner sc) {
		System.out.println("Digite um valor inteiro N");
		int n = sc.nextInt();
		return n;
	}
	
	/**
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
	 * Cada caso de teste consiste de 3 valores reais, 
	 * cada um deles com uma casa decimal. 
	 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
	 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o 
	 * terceiro valor tempeso 5.
	 */
	protected void exercicio03() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] pesos = {2, 3, 5};
		double denominador;
		
		double value;
		
		int n = lerNumeroN(sc);
		
		double[] testes = new double[n];
		
		for (int i = 0; i < testes.length; i++) {
			denominador = 0;
			for (int j = 0; j < pesos.length; j++) {
				value = sc.nextDouble();
				testes[i] += value*pesos[j];
				denominador += pesos[j];
			}
			testes[i] = testes[i]/denominador;
		}
		
		for (int i = 0; i < testes.length; i++) {
			System.out.printf("%.1f%n", testes[i]);
		}
	}
	
	/**
	 * Fazer um programa para ler um número N. 
	 * Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. 
	 * Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	 */
	private void exercicio04() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numerador;
		double denominador;

		int n = lerNumeroN(sc);

		double[] numeradores = new double[n];
		double[] denominadores = new double[n];

		for (int i = 0; i < n; i++) {
			numeradores[i] = sc.nextDouble();
			denominadores[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if(denominadores[i] == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", numeradores[i]/denominadores[i]);
			}
		}
	}
	
	/**
	 * Ler um valor N. 
	 * Calcular e escrever seu respectivo fatorial. 
	 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	 * Lembrando que, por definição, fatorial de 0 é 1.
	 */
	private void exercicio05() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double resultado = 1;

		int n = lerNumeroN(sc);

		for (int i = n; i > 0; i--) {
			resultado *= i; 
		}
		System.out.println(resultado);
	}
	
	/**
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */
	private void exercicio06() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = lerNumeroN(sc);

		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			} 
		}
	}
	
	/**
	 * Fazer um programa para ler um número inteiro positivo N. 
	 * O programa deve então mostrar na tela N linhas, começando de 1 até N. 
	 * Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
	 */
	private void exercicio07() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = lerNumeroN(sc);

		for (int i = 1; i <= n; i++) {
			System.out.print(Math.pow(i, 1)+" ");
			System.out.print(Math.pow(i, 2)+" ");
			System.out.println(Math.pow(i, 3));
		}
	}
}