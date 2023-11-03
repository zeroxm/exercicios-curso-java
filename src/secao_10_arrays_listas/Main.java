package secao_10_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

import secao_10_arrays_listas.entities.Pessoa;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Main main = new Main();
		// main.negativos();
		// main.soma_vetor();
		// main.alturas();
		// main.numeros_pares();
		// main.maior_posicao();
		// main.soma_vetores();
		// main.abaixo_da_media();
		// main.media_pares();
		// main.mais_velho();
		// main.aprovados();
		main.dados_pessoas();
	}

	/**
	 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
	 * depois N números inteiros e armazene-os em um vetor. 
	 * Em seguida, mostrar na tela todos os números negativos lidos.
	 */
	public void negativos() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int[] numeros = new int[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NÚMEROS NEGATIVOS:");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}

		sc.close();
	}

	/**
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	 * - Imprimir todos os elementos do vetor
	 * - Mostrar na tela a soma e a média dos elementos do vetor 
	 */
	public void soma_vetor() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		float[] numeros = new float[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextFloat();
		}

		System.out.print("VALORES = ");
		float soma = 0f;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			System.out.print(String.format("%.1f ", numeros[i]));
		}
		System.out.println();
		System.out.print("SOMA = ");
		System.out.println(String.format("%.2f", soma));
		System.out.print("MEDIA = ");
		System.out.println(String.format("%.2f", soma/numeros.length));

		sc.close();
	}

	/**
	 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
	 * Depois, mostrar na tela a altura média das pessoas, e 
	 * mostrar também a porcentagem de pessoas com menos de 16 anos,
	 * bem como os nomes dessas pessoas caso houver. 
	 */
	public void alturas() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		Pessoa[] pessoas = new Pessoa[sc.nextInt()];
		sc.nextLine();

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			pessoas[i] = new Pessoa();
			System.out.print("Nome: ");
			pessoas[i].setNome(sc.nextLine());
			System.out.print("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			System.out.print("Altura: ");
			pessoas[i].setAltura(sc.nextFloat());
			sc.nextLine();
		}

		float somaAlturas = 0;
		int qtdPessoasJovens = 0;
		
		for (Pessoa pessoa : pessoas) {
			somaAlturas += pessoa.getAltura();
			if(pessoa.getIdade() < 16) {
				qtdPessoasJovens++;
			}
		}

		String[] nomesJovens = new String[qtdPessoasJovens];

		for (int i = 0; i < nomesJovens.length; i++) {
			for (Pessoa pessoa : pessoas) {
				if(pessoa.getIdade() < 16) {
					nomesJovens[i] = pessoa.getNome();
					i++;
				}
			}
		}

		System.out.printf("Altura média: %.2f\n", (somaAlturas/pessoas.length));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", qtdPessoasJovens/(float)pessoas.length*100);

		for (String nome : nomesJovens) {
			System.out.println(nome);
		}

		sc.close();
	}

	/**
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor.
	 * Em seguida, mostre na tela todos os números pares, e também a 
	 * quantidade de números pares.
	 */
	public void numeros_pares() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int[] numeros = new int[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NÚMEROS PARES:");
		int qtdPares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2==0) {
				System.err.print(numeros[i]+" ");
				qtdPares++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: "+qtdPares);

		sc.close();
	}

	/**
	 * Faça um programa que leia N números reais e armazene-os em um vetor. 
	 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). 
	 * Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
	 */
	public void maior_posicao() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		float[] numeros = new float[sc.nextInt()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextFloat();
		}

		float maior = Float.MIN_VALUE;
		int posMaior = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				posMaior = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = "+maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+posMaior);

		sc.close();
	}

	/**
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. 
	 * Em seguida, gere um terceiro vetor C onde cada elemento de C é a 
	 * soma dos elementos correspondentes de A e B. Imprima o vetor C gerado
	 */
	public void soma_vetores() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int quantidade = sc.nextInt();

		int[] vetorA = new int[quantidade];
		int[] vetorB = new int[quantidade];
		int[] vetorC = new int[quantidade];

		System.out.print("Digite os valores do vetor A: ");

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.print("Digite os valores do vetor B: ");

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println("VETOR RESULTANTE");

		for (int i : vetorC) {
			System.out.println(i);
		}

		sc.close();
	}

	public void abaixo_da_media() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		float[] numeros = new float[sc.nextInt()];
		
		float somaElementos = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextFloat();
			somaElementos+=numeros[i];
		}
		System.out.println();
		float media = (somaElementos/(float)numeros.length);
		System.out.printf("MEDIA DO VETOR = %.3f \n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (float f : numeros) {
			if(f < media) {
				System.err.println(f);
			}
		}
	
		sc.close();
	}

	/**
	 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
	 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
	 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
	 */
	public void media_pares() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int[] numeros = new int[sc.nextInt()];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite "+(i==0?"um":"outro")+" número: ");
			numeros[i] = sc.nextInt();
		}

		boolean temPar = false;
		float mediaDosPares = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]%2 == 0) {
				mediaDosPares += numeros[i];
				temPar = true;
			}
		}
		System.out.println(mediaDosPares);
		mediaDosPares = mediaDosPares/(float)numeros.length;

		if(temPar) {
			System.out.println("MEDIA DOS PARES = "+mediaDosPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

	/**
	 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. 
	 * Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
	 * Depois, mostrar na tela o nome da pessoa mais velha.
	 */
	public void mais_velho() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		Pessoa[] pessoas = new Pessoa[sc.nextInt()];
		sc.nextLine();

		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			pessoas[i] = new Pessoa();
			System.out.print("Nome: ");
			pessoas[i].setNome(sc.nextLine());
			System.out.print("Idade: ");
			pessoas[i].setIdade(sc.nextInt());
			sc.nextLine();
		}

		int maiorIdade = -1;
		String nomeDoMaisVelho = "";

		for (Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() > maiorIdade) {
				nomeDoMaisVelho = pessoa.getNome();
			}
		}

		System.out.println("PESSOA MAIS VELHA: "+nomeDoMaisVelho);

		sc.close();
	}

	/**
	 * Fazer um programa para ler um conjunto de N nomes de alunos, 
	 * bem como as notas que eles tiraram no 1º e 2º semestres. 
	 * Cada uma dessas informações deve ser armazenada em um vetor. 
	 * Depois, imprimir os nomes dos alunos aprovados, considerando 
	 * aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). 
	 */
	public void aprovados() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int quantidade = sc.nextInt();

		String[] nomes = new String[quantidade];
		float[] primeirasNotas = new float[quantidade];
		float[] segundasNotas = new float[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dª aluno:\n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			primeirasNotas[i] = sc.nextFloat();
			segundasNotas[i] = sc.nextFloat();
		}

		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < quantidade; i++) {
			if((primeirasNotas[i] + segundasNotas[i])/2f >= 6.0) {
				System.err.println(nomes[i]);
			}
		}

		sc.close();
	}

	/**
	 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
	 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, 
	 * a média de altura das mulheres, e o número de homens. 
	 */
	public void dados_pessoas() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas?  ");
		int quantidade = sc.nextInt();

		String[] generos = new String[quantidade];
		float[] alturas = new float[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Altura da %dª pessoa:\n", i+1);
			alturas[i] = sc.nextFloat();
			sc.nextLine();
			System.out.printf("Genero da %dª pessoa:\n", i+1);
			generos[i] = sc.nextLine();
		}

		float menorAltura = Float.MAX_VALUE;
		float maiorAltura = Float.MIN_VALUE;
		float mediaAlturaMulheres = 0f;
		int numHomens = 0;
		int numMulheres = 0;

		for (int i = 0; i < quantidade; i++) {
			if(generos[i].equalsIgnoreCase("F")) {
				mediaAlturaMulheres += alturas[i];
				numMulheres++;
			} else {
				numHomens++;
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}

		mediaAlturaMulheres = mediaAlturaMulheres/(float)numMulheres;

		System.out.println("Menor altura = "+menorAltura);
		System.out.println("Maior altura = "+maiorAltura);
		System.out.println("Media das alturas das mulheres = "+mediaAlturaMulheres);
		System.out.println("Numero de homens = "+numHomens);

		sc.close();
	}
}
