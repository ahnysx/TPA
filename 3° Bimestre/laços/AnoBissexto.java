import java.util.Scanner;
public class AnoBissexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int ano, anoInicial, anoFinal, qtdBissexto = 0;
		
		System.out.println("Insira o ano inicial : ");
		anoInicial = ler.nextInt();
		
		System.out.println("Insira o ano final :");
		anoFinal = ler.nextInt();
		
		ano = anoInicial; 
		
		while (ano<=anoFinal) {
			if (ano % 400 == 0) {
				System.out.println("Ano bissexto: "+ano);
				  qtdBissexto++;	
			} else {
				if (ano % 4 == 0) {
					if (ano % 100 != 0) {
						System.out.println("Ano bissexto: "+ano);
						  qtdBissexto++;
					}
				}
			}
			ano++; 
		}
		System.out.println("Total de bissextos: " +qtdBissexto);
		ler.close();
	}
}
