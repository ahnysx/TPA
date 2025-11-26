import java.util.Scanner;

public class exMedia { 
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		int nota1, nota2, media, novaMedia, notaExame;
		
		System.out.println ("Coloque a nota 1: ");
		nota1 = ler.nextInt ();
		
		System.out.println ("Coloque a nota 2: ");
		nota2 = ler.nextInt ();
		
		media = (nota1 + nota2) / 2;
		
		if (media < 3) {
			System.out.println ("Reprovado");
			
		} else if (media > 6) {
			System.out.println ("Aprovado!");
			
		} else {
			System.out.println ("A m�dia �: " +media);
			System.out.println ("O aluno est� em exame");
			System.out.println ("Insira a nota do exame: ");
			notaExame = ler.nextInt();
		}
		
		novaMedia = (media + notaExame)/2;
		
		if (novaMedia >= 6) {
			System.out.println ("Aprovado.");
			
		} else { 
			System.out.println ("Reprovado.");
			
		}
		
		ler.close();
		}
	}
}