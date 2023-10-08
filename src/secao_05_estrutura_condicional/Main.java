package secao_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
//		main.exercicio01();
//		main.exercicio02();
//		main.exercicio03();
//		main.exercicio04();
//		main.exercicio05();
//		main.exercicio06();
//		main.exercicio07();
		main.exercicio08();
	}
	
	/**
	 * Calculo de imposto de renda
	 */
	public void exercicio08() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = -1;
		double impostoDevido = 0;
		
		while (salario < 0) {
			System.out.println("Digite o salário em R$:");
			salario = sc.nextDouble();
		}
		
		if(salario <= 2000) {
			System.out.println("Isento");
		} else {
			if(salario > 4500) {
				impostoDevido += (salario - 4500) * 28/100; 
				salario = 4500;
			}
			
			if(salario > 3000 && salario <= 4500) {
				impostoDevido += (salario - 3000) * 18/100;  
				salario = 3000;
			}
			
			if(salario > 2000 && salario <= 3000) {
				impostoDevido += (salario - 2000) * 8/100;
				salario = 2000;
			}
			System.out.printf("R$ %.2f%n", impostoDevido);
		}
	}

	/**
	 * Onde está o ponto?
	 */
	public void exercicio07() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas x e y de um ponto:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if( x == 0 && y == 0) {
			System.out.println("Origem");
		} else if( x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if( x != 0 && y == 0) {
			System.out.println("Eixo X");
		} else 
			if(x > 0 && y > 0) {
				System.out.println("Q1");
			} else if(x < 0 && y > 0) {
				System.out.println("Q2");
			} else if(x < 0 && y < 0) {
				System.out.println("Q3");
			} else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
	}
	
	/**
	 * Leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
	 * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
	 */
	public void exercicio06() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor:");
		double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if(valor > 25 && valor <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if(valor > 50 && valor <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if(valor > 75 && valor <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}

	/**
	 * Leia o código de um item e a quantidade deste item.
	 */
	public void exercicio05() {
		Scanner sc = new Scanner(System.in);

		float[] precos = new float[]{4.00f, 4.50f, 5.00f, 2.00f, 1.50f};

		System.out.println("Tabela de produtos");
		System.out.println("1 \t Cachorro Quente \t R$ 4,00");
		System.out.println("2 \t X-Salada \t\t R$ 4,50");
		System.out.println("3 \t X-Bacon \t\t R$ 5,00");
		System.out.println("4 \t Torrada simples \t R$ 2,00");
		System.out.println("5 \t Refrigerante \t\t R$ 1,50");

		System.out.println("Digite o código do produto e a quantidade:");
		int produto = sc.nextInt();
		int qtd = sc.nextInt();

		System.out.printf("Total: R$ %.2f%n", precos[produto-1] * (float) qtd);
	}
	
	/**
	 * Leia a hora inicial e a hora final de um jogo. 
	 * A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro
	 */
	public void exercicio04() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e final de um jogo");
		int hInic = sc.nextInt();
		int hFim = sc.nextInt();
		
		if(hInic < hFim) {
			System.out.printf("O JOGO DUROU %d HORA(S)", hFim - hInic);
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)", 24 - (hInic - hFim));
		}
	}
	
	/**
	 * Leia 2 valores inteiros (A e B). 
	 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
	 */
	public void exercicio03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite A e B");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A%B == 0 || B%A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}
	}
	
	/**
	 *  ler um número inteiro e dizer se este número é par ou ímpar.
	 */
	public void exercicio02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	}
	
	/**
	 *  Ler um número inteiro, e depois dizer se este número é negativo ou não
	 */
	public void exercicio01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
	}

}
