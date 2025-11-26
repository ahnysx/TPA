package prj.Aula02;
import java.util.Scanner;

public class ValoresInvertidos {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		double valor1,valor2,valor3;
		System.out.println("Digite o primeiro valor");
		valor1=ler.nextDouble();
		System.out.println("Digite o segundo valor");
		valor2=ler.nextDouble();
		valor3=valor1;
		valor1=valor2;
		valor2=valor3;
		System.out.println(valor1);
		System.out.println(valor2);
		ler.close();
		
		}

}
