import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=0, base = 2;
		double potencia;
		
		int a[] = new int[11];
		
		for(i = 0; i < 11; i++) {
			System.out.println("Insira o "+(i + 1)+" número do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		for(i = 0; i < 11; i++) {
			
			potencia = Math.pow(base, i);
			
			System.out.println("\nPotência de base " + base + " elevado à  " + i + " = " + potencia);
		}
		
		ler.close();

	}

}
