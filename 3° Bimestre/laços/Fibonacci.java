import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner  (System.in); 
		
		int i = 1, termo1 = 0, n, termo2 = 1, proximoTermo; 
		
		System.out.println("Coloque a quantidade de termos desejada : ");
		
		n = ler.nextInt();
		
		do {
			proximoTermo = termo1 + termo2;
			System.out.print(proximoTermo + " ");
			
			termo1 = termo2;
			termo2 = proximoTermo; 
			i++;
					
		} while (i < n);
		
		ler.close();
		
		System.out.println("A série de fibonacci é "+i);
		
	}
}
