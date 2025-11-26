import java.util.Scanner;
public class Numeros500 {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 2;
		
		do {
			
			if  (i % 2 == 0) {
				
				System.out.print(i + "  ") ;
			}
			i = i + 2;
		} while (i < 501);
		
	}
}
