package prj.Aula02;
import java.util.Scanner;

public class Idade {
	public static void main(String[]args) {
		Scanner ler= new Scanner(System.in);
		double anoNasc,anoAtual,idade;
		System.out.println("Digite o ano de nascimento");
		anoNasc=ler.nextDouble();
		System.out.println("Digite o ano atual");
		anoAtual=ler.nextDouble();
		idade=(anoAtual-anoNasc);
		System.out.println("A sua idade � "  +idade);
		ler.close();
				}

}
