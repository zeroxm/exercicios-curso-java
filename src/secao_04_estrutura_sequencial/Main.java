package secao_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
//		main.exercicio1();
//		main.exercicio2();
//		main.exercicio3();
//		main.exercicio4();
//		main.exercicio5();
		main.exercicio6();
	}
	
	/**
	 * Leia três valores com ponto flutuante de dupla precisão: A, B e C. 
	 * Em seguida, calcule e mostre: 
	 * a) a área do triângulo retângulo que tem A por base e C por altura. 
	 * b) a área do círculo de raio C. (pi = 3.14159) 
	 * c) a área do trapézio que tem A e B por bases e C por altura. 
	 * d) a área do quadrado que tem lado B. 
	 * e) a área do retângulo que tem lados A e B.
	 */
	public void exercicio6() {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite A, B, C:");
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("TRIANGULO =  %.3f%n", (A * C)/2);
		System.out.printf("CIRCULO =  %.3f%n", Math.PI*Math.pow(C, 2));
		System.out.printf("TRAPEZIO =  %.3f%n", ((A+B)*C)/2);
		System.out.printf("QUADRADO =  %.3f%n", Math.pow(B, 2));
		System.out.printf("RETANGULO =  %.3f%n", A*B);
		
		sc.close();
	}
	/**
	 * ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
	 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
	 * Calcule e mostre o valor a ser pago.
	 */
	public void exercicio5() {
		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valorPeca1, valorPeca2;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1:");
		codPeca1 = sc.nextInt();
		System.out.println("Digite a quantidade da peça "+codPeca1);
		qtdPeca1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça "+codPeca1);
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2:");
		codPeca2 = sc.nextInt();
		System.out.println("Digite a quantidade da peça "+codPeca2);
		qtdPeca2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça "+codPeca2);
		valorPeca2 = sc.nextDouble();

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (valorPeca1 * (double) qtdPeca1) + (valorPeca2 * (double) qtdPeca2));
		sc.close();
	}
	
	/**
	 * leia o número de um funcionário, seu número de horas trabalhadas, 
	 * o valor que recebe por hora e calcula o salário desse funcionário 
	 */
	public void exercicio4() {
		int numFunc, numHoras;
		double salarioPorHora;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		numFunc = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas:");
		numHoras = sc.nextInt();
		System.out.println("Digite o salário p/ hora:");
		salarioPorHora = sc.nextDouble();

		System.out.printf("NUMERO =  %d%n", numFunc);
		
		System.out.printf("SALARY =  %.2f%n", salarioPorHora * (double) numHoras);
		sc.close();
	}


	/**
	 * Ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
	 * diferença do produto de A e B pelo produto de C e D
	 */
	public void exercicio3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite A, B, C e D:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		System.out.printf("DIFERENCA =  %d%n", (A*B - C*D));
		sc.close();
	}

	/**
	 * Ler o valor do raio de um círculo, e depois mostrar o valor da área
	 */
	public void exercicio2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio:");
		double a = sc.nextDouble();
		System.out.printf("A =  %.4f%n", (Math.pow(a, 2) * Math.PI));
		sc.close();
	}

	/**
	 * Ler dois valores inteiros, e depois mostrar na tela a soma
	 */
	public void exercicio1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um inteiro:");
		int a = sc.nextInt();
		System.out.println("Digite outro inteiro:");
		int b = sc.nextInt();
		System.out.println("Soma = " + (a + b));
		sc.close();
	}

}
