import java.util.Scanner;
public class Potencia {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 0, base, expoente, resultado = 1;
		
		System.out.println("Digite o número que vai ser elevado :");
		base = ler.nextInt ();
		
		System.out.println("Digite o valor do expoente :");
		expoente = ler.nextInt();
		
		do {
			resultado = resultado * base;
			i++;
		} while (i < expoente);
		
		System.out.println("O resultado é " +resultado);
		ler.close();
	} 
}
