package prj.Aula03;
import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[]args) {
		Scanner ler=new Scanner(System.in);
		double valorHora,aulaMes,inssDesconto,salarioLiquido,salarioBruto;
		
		System.out.println("digite valor hora");
		valorHora=ler.nextDouble();
		
		System.out.println("digite as aulas dadas no mês");
		aulaMes=ler.nextDouble();
		
		salarioBruto=(valorHora*aulaMes);
		
		inssDesconto=(salarioBruto/100);
		
		salarioLiquido=(salarioBruto-inssDesconto);
		System.out.println("O salário liquido é igual a "+salarioLiquido);
		ler.close();
		
		
	}
}
