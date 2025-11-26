import java.util.Scanner;

public class veiculo {
public static void main (String [] args) {
		
		Scanner ler = new Scanner (System.in);
		double distanciaPercorrida, capacidadeCombustivel, gastoMedio;
		
		System.out.println ("Digite a distância percorrida em quilómetros: ");
		distanciaPercorrida = ler.nextDouble();
		
		System.out.println ("Digite a capacidade do tanque de combustível em litros: ");
		capacidadeCombustivel = ler.nextDouble();
		
		gastoMedio = distanciaPercorrida / capacidadeCombustivel;
		
		if ( gastoMedio >= 10 ) {
			System.out.println ("O veículo é econômico");
			
		} else if ( gastoMedio < 10 ) {
			System.out.println ("O veículo não é econômico");
		}
		ler.close();
		
		System.out.println("O gasto médio é "+ gastoMedio);
	}
}