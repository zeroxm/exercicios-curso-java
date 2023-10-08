package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		exemplo01(args);
//		exemplo02(args);
//		exemplo03(args);
		exemplo04(args);
	}

	public static void exemplo04(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double c = -5.0;
		double A, B, C;

		A = Math.sqrt(a);
		B = Math.sqrt(b);
		C = Math.sqrt(c);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		A = Math.pow(a, 2);
		B = Math.pow(b, 2);
		C = Math.pow(c, 2);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		B = Math.abs(b);
		C = Math.abs(c);
		System.out.println("Valor absoluto de " + b + " = " + B);
		System.out.println("Valor absoluto de " + c + " = " + C);
	}

	public static void exemplo03(String[] args) {
		int x;
		String a, b, c;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		a = sc.nextLine();
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();

		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}

	public static void exemplo02(String[] args) {
		String x;
		int y;
		double z;
		char a;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite algo:");

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);

		System.out.println("Você Digitou "+a);
		System.out.printf("Você Digitou %.2f%n",z);
		System.out.printf("%s tem %d anos e recebe R$%.2f%n", x, y, z);
		sc.close();
	}

	public static void exemplo01(String[] args) {
		int a = 32;
		double b = 10.35784;
		String nome = "Maria";

		Locale.setDefault(Locale.US);

		System.out.println(a);
		System.out.println(b);
		System.out.printf("%.2f%n", b);
		System.out.printf("%.4f%n", b);
		System.out.println("Teste! ");
		System.out.println("Oi mãe!");

		System.out.println("Resultado: " + b + " metros");
		System.out.printf("Resultado: %.2f metros%n", b);

		System.out.printf("%s tem %d anos e recebe R$%.2f%n", nome, a, b);
	}
}