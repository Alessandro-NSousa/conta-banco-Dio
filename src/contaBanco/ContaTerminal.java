package contaBanco;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("***************************************");
			System.out.println("*   SEJA BEM VINDO AO BANCO VIRTUAL   *");
			System.out.println("***************************************");
			System.out.println("Por favor, Digite o n�mero da Ag�ncia:");
			String agencia = sc.nextLine();
			
			System.out.println("Agora, Digite o n�mero da Conta, por gentileza:");
			int numero = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do Titular:");
			String nomeCliente = sc.nextLine();
			
			System.out.println("Qual ser� seu Saldo inicial?");
			double saldo = sc.nextDouble();
			
			
			System.out.printf("Ol� [%s], obrigado por criar uma conta em nosso banco, sua ag�ncia � [%s], conta [%d] e seu saldo [R$ %.2f] j� est� dispon�vel para saque.",
						nomeCliente.toUpperCase(), agencia, numero,saldo);
		} catch (InputMismatchException e) {
			System.out.println("Por Gentileza, use ',' para separar os valores decimais.");
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
