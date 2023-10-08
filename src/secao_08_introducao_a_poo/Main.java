package secao_08_introducao_a_poo;

import java.util.Locale;
import java.util.Scanner;

import secao_08_introducao_a_poo.entities.Employee;
import secao_08_introducao_a_poo.entities.Rectangle;
import secao_08_introducao_a_poo.entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Main main = new Main();
//		main.exercicio1();
//		main.exercicio2();
		main.exercicio3();
	}

	/**
	 * Fazer um programa para ler os valores da largura e altura 
	 * de um retângulo. Em seguida, mostrar na tela o valor de 
	 * sua área, perímetro e diagonal. Usar uma classe como
	 * mostrado no projeto ao lado.
	 */
	public void exercicio1() {
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height");

		rec.largura = sc.nextDouble();
		rec.altura = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rec.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rec.perimetro()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rec.diagonal()));
		
		sc.close();
	}
	
	/**
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto, imposto).
	 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
	 * Em seguida, aumentar o salário do funcionário com base numa porcentagem dada (somente
	 * o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do 
	 * funcionário. Use a classe projetada.
	 */
	public void exercicio2() {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee data:");
		System.out.print("Name: ");
		
		employee.nome = sc.nextLine();
		
		System.out.print("Gross salary: ");
		
		employee.salarioBruto = sc.nextFloat();
		
		System.out.print("Tax: ");
		
		employee.imposto = sc.nextFloat();
		
		System.out.println("Employee: "+ employee);
		
		System.out.print("Which percentage to increase salary? ");
		
		employee.aumentarSalario(sc.nextDouble());
		
		System.out.println("Updated data: "+ employee);
		
		sc.close();
	}
	/**
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
	 * trimestres do ano (sendo que o primeiro vale até 30, e os outros dois valem até 35 cada).
	 * Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado
	 * (PASS) o não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o
	 * mínimo para ser aprovado (que é 60% de nota). Você deve criar uma classe Student para 
	 * resolver este problema.
	 */
	public void exercicio3() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student data:");
		System.out.print("Name: ");
		student.setNome(sc.nextLine());

		System.out.print("First Grade: ");		
		student.setPrimeiraNota(sc.nextFloat());

		System.out.print("Second Grade: ");
		student.setSegundaNota(sc.nextFloat());

		System.out.print("Third Grade: ");
		student.setTerceiraNota(sc.nextFloat());

		System.out.println("FINAL GRADE: "+String.format("%.2f",student.getNotaFinal()));
		
		if(student.isAprovado()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.print("MISSING "+String.format("%.2f", student.getPontosFaltantes())+" POINTS");
		}

		sc.close();
	}
}
