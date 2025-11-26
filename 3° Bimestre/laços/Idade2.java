import java.util.Scanner;
public class Idade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int idade, continuar, f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, i = 0;
		
		do { 
			System.out.println("Insira a idade da pessoa :");
			
			idade = ler.nextInt();
			
			if (idade <=15) {
				System.out.println("1º faixa.");
				f1 = f1 + 1;
				
			} else if (idade > 15 && idade <=30) {
				System.out.println("2º faixa.");
				f2 = f2 + 1 ;
			} else if (idade > 30 && idade <=45) {
				System.out.println("3º faixa.");
				f3 = f3 + 1; 
			} else if (idade > 45 && idade <=60) {
				System.out.println("4º faixa.");
				f4 = f4 + 1;
			} else {
				System.out.println("5º faixa.");
				f5 = f5 + 1;
			} i ++;
			System.out.println("Deseja continuar a execuçâo? (1-Sim / 2-Não):");
			continuar = ler.nextInt();
			
		} while (continuar != 2);
		System.out.println("Quantidade de pessoas em cada faixa : ");
		System.out.println("1º faixa " + f1);
		System.out.println("2º faixa " + f2);
		System.out.println("3º faixa " + f3);
		System.out.println("4º faixa " + f4);
		System.out.println("5º faixa " + f5);
		
		if (i > 0) {
			System.out.println("Porcentagem de pessoas em cada faixa etária : ");
			System.out.println("1º faixa : " + (f1 * 100 / i) + "%");
			System.out.println("2º faixa : " + (f2 * 100 / i) + "%");
			System.out.println("3º faixa : " + (f3 * 100 / i) + "%");
			System.out.println("4º faixa : " + (f4 * 100 / i) + "%");
			System.out.println("5º faixa : " + (f5 * 100 / i) + "%");
		} ler.close();
		
	}
}
