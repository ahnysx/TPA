import java.util.Scanner;
public class PlacaSp {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Entre com o último número inteiro da placa para saber que dia seu veículo :");
		n = in.nextInt();
		switch (n) {
		case 1:
		case 2: 
			System.out.println("Segunda-feira o seu veículo não pode circular em São Paulo");
			break;
		case 3:
		case 4:
			System.out.println("Terça-feira o seu veículo não pode circular em São Paulo");
			break;
		case 5:
		case 6:
			System.out.println("Quarta-feira o seu veículo não pode circular em São Paulo");
			break;
		case 7:
		case 8:
			System.out.println(" Quinta-feira o seu veículo não pode circular em São Paulo");
			break;
		case 9:
		case 0:
			System.out.println("Sexta-feira o seu veículo não pode circular em São Paulo");
			break;
		default:
			System.out.println("Placa inválida");
			
		
		}
		in.close();
		
	}
}
