import java.util.Scanner;

public class veiculo {
public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		double distanciaPercorrida, capacidadeCombustivel, gastoMedio;
		
		System.out.println ("Digite a dist�ncia percorrida em quil�metros: ");
		distanciaPercorrida = ler.nextDouble();
		
		System.out.println ("Digite a capacidade do tanque de combust�vel em litros: ");
		capacidadeCombustivel = ler.nextDouble();
		
		gastoMedio = distanciaPercorrida / capacidadeCombustivel;
		
		if ( gastoMedio >= 10 ) {
			System.out.println ("O ve�culo � econ�mico");
			
		} else if ( gastoMedio < 10 ) {
			System.out.println ("O ve�culo n�o � econ�mico");
		}
		ler.close();
		
		System.out.println("O gasto m�dio � igual � "+ gastoMedio);
	}
}