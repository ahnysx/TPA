import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int anoAtual, escolha, anoNasc, idade; 
		
		do {
			System.out.println("Digite o ano atual :");
			anoAtual = ler.nextInt();
			
			System.out.println("Digite o ano de nascimento :");
			anoNasc = ler.nextInt();
			
			idade = anoAtual - anoNasc; 
			System.out.println("Sua idade � "+idade);
			
		    System.out.print("Deseja continuar? 1 - continuar / 0 - sair: ");
		    escolha = ler.nextInt();
		    
		} while (escolha != 0);
		 System.out.println("Programa encerrado");
		 ler.close();
			
	}

}
