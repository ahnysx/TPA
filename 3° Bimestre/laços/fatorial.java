import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		long i = 1, n, fatorial = 1;
		
		System.out.println ("Digite o valor que será calculado: ");
		n = ler.nextLong();
	
		do {
			fatorial = fatorial * i;
			i ++;
			
		} while (i <= n);
		
		System.out.println("Fatorial = " +fatorial);
		ler.close();
	}
}
