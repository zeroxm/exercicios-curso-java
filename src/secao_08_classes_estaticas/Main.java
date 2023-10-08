package secao_08_classes_estaticas;

import java.util.Locale;
import java.util.Scanner;

import secao_08_classes_estaticas.util.CurrencyConverter;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Main main = new Main();
		main.exercicioFixacao();
	}

	private void exercicioFixacao() {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		float dollarPrice = sc.nextFloat();

		System.out.print("How many dollars will be bought? ");
		float dollarAmount = sc.nextFloat();

		System.out.printf("Amount to be paid in reais = %.2f", 
						  CurrencyConverter.getToBePaid(dollarPrice, dollarAmount));
		sc.close();
	}
}
