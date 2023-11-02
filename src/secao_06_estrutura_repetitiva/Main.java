package secao_06_estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
//		main.exercicio01();
//		main.exercicio02();
		main.exercicio03();

	}
	/*
	 * Escreva um algoritmo para ler o tipo de combustível abastecido 
	 * (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
	 * Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
	 * deve ser solicitado um novo código (até que seja válido). 
	 * O programa será encerrado quando o código informado for o número 4. 
	 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de 
	 * clientes que abasteceram cada tipo de combustível
	 */
	public void exercicio03() {
		Scanner sc = new Scanner(System.in);

		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		
		int opcao = 0;
		
		while (opcao != 4) {
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: {
				qtdAlcool++;
				break;
			}
			case 2: {
				qtdGasolina++;
				break;
			}
			case 3: {
				qtdDiesel++;
				break;
			}
			}
		}

		System.out.println("Muito Obrigado!");
		System.out.println("Alcool - "+qtdAlcool);
		System.out.println("Gasolina - "+qtdGasolina);
		System.out.println("Diesel - "+qtdDiesel);
	}
	
	/*
	 * Escreva um programa para ler as coordenadas (X,Y) 
	 * de uma quantidade indeterminada de pontos no sistema
	 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
	 * O algoritmo será encerrado quando pelomenos uma de duas coordenadas for NULA
	 */
	public void exercicio02() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as coordenadas x e y de um ponto:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Q1");
			} else if(x < 0 && y > 0) {
				System.out.println("Q2");
			} else if(x < 0 && y < 0) {
				System.out.println("Q3");
			} else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
			
			System.out.println("Digite as coordenadas x e y de um ponto:");
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
	}
	
	/**
	 *  Escreva um programa que repita a leitura de uma senha até que ela seja válida	 
	 */
	public void exercicio01() {
		
		String senhaReal = "2002";
		String senhaDigitada = "";
		String message = "";
		String content = "Digite a Senha:";
		
		Scanner sc = new Scanner(System.in);
		while (!senhaReal.equals(senhaDigitada)) {
			System.out.println(message+content);
			senhaDigitada = sc.nextLine();
			message = "Acesso Negado!\n";
		}
		
		System.out.println("Acesso Aprovado!");
	}

}
