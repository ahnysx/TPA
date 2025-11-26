import java.util.Scanner;

public class media {
	public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, mediaI, nm, exame;
		
		System.out.println ("Insira a nota 1: ");
		n1 = ler.nextDouble();
		
		System.out.println ("Insira a nota 2: ");
		n2 = ler.nextDouble();
		
		System.out.println ("Insira a nota 3: ");
		n3 = ler.nextDouble();
		
		System.out.println ("Insira a nota 4: ");
		n4 = ler.nextDouble();
		
		mediaI = (n1 + n2 + n3 + n4)/ 4;
		
		System.out.println ("A média inicial do aluno é: " + mediaI);
		
		if (mediaI >= 7) {
			System.out.println ("Aprovado!");
			
		} else if (mediaI < 5) {
			System.out.println ("Reprovado.");
			
			} else {
				System.out.println ("O aluno está em exame.");
				
				System.out.println ("Insira a nota do exame: ");
				exame = ler.nextDouble();
				
				nm = (exame + mediaI)/ 2;
				
				System.out.println ("A nova média do exame é: " + nm);
				
				if (nm >=7) {
					System.out.println ("Aprovado no exame.");
					
				} else {
					System.out.println ("Reprovado no exame.");
					
				}
					
		} 
		ler.close();
		
	}

}
