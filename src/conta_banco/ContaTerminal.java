package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 double saldo = 237.48;
		 
		 System.out.println("Por favor, digite o número da Conta:");
		 int numero_conta =  scanner.nextInt();
		 
		 System.out.println("Digite a Agência:");
		 String agencia =  scanner.next();
		 
		 
		 System.out.println("Digite o Seu Nome:");
		 String nome_cliente =  scanner.next();
		 
		 System.out.println("Olá, " + nome_cliente + " obrigado por criar uma conta em nosso "
		 		+ "banco, sua agência é: " + agencia + " conta " + numero_conta + 
		 		" e seu saldo  R$ " + saldo + " já está disponível para saque.");

	}

}
