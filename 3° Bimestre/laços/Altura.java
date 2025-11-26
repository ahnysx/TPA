import java.util.Scanner;
public class Altura {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 0;
		double joao = 1.34, pedro = 1.45;
		
	do {
		joao = joao + 0.025 ;
		pedro = pedro + 0.020;
		i++;
		
	} while (joao <= pedro);
	System.out.println("Foram necessários " + i + " anos para João ficar mais alto que Pedro");
	
	ler.close();

	}
}
