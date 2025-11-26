import java.util.Scanner;
public class MultiploSomatoria {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int soma = 0, i; 
		
		for ( i = 0; i < 400; i +=5) {
			soma += 5; 
	
			System.out.println("A soma dos múltiplos de 5 de 0 a 400 é: " +soma);
			ler.close();
		}

	}
}
