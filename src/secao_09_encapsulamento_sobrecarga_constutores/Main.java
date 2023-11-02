package secao_09_encapsulamento_sobrecarga_constutores;

import java.util.Locale;
import java.util.Scanner;

import secao_09_encapsulamento_sobrecarga_constutores.entities.BankAccount;

public class Main {

    /**
     * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
     * titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. 
     * Este valor de depósito inicial, entretando, é opcional, ou seja: se o titular não tiver dinheiro a 
     * depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta 
     * será, naturalmente, zero.
     * 
     * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. 
     * Já que o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, 
     * por exemplo).
     * 
     * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para protegar isso.
     * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco
     * cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para 
     * realizar o saque e/ou pagar a taxa.
     * 
     * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado
     * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados 
     * da conta após cada operação.
     * 
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
        int acNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        float initialDeposit = 0f;

        if(sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextFloat();
        }

		BankAccount bankAccount = new BankAccount(acNumber, holderName, initialDeposit);

        System.out.println("Account Data:");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        bankAccount.efetuarDeposito(sc.nextFloat()); 
        System.out.print("Updated account data: ");
        System.out.println(bankAccount);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        bankAccount.efetuarSaque(sc.nextFloat()); 
        System.out.print("Updated account data: ");
        System.out.println(bankAccount);
        System.out.println();

        sc.close();
    }
}
