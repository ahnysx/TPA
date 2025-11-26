import java.util.Scanner;

public class ordemCrescente {
	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int maior, menor, meio, a, b, c;

	        System.out.println("Insira o valor de A:");
	        a = ler.nextInt();

	        System.out.println("Insira o valor de B:");
	        b = ler.nextInt();

	        System.out.println("Insira o valor de C:");
	        c = ler.nextInt();

	        if (a <= b) {
	            if (a <= c) {
	                menor = a;
	                if (b <= c) {
	                    meio = b;
	                    maior = c;
	                } else {
	                    meio = c;
	                    maior = b;
	                }
	            } else { 
	                menor = c;
	                meio = a;
	                maior = b;
	            }
	        } else if (b <= c) {
	            menor = b;
	            if (a <= c) {
	                meio = a;
	                maior = c;
	            } else {
	                meio = c;
	                maior = a;
	            }
	        } else {
	            menor = c;
	            if (a <= b) {
	                meio = a;
	                maior = b;
	            } else {
	                meio = b;
	                maior = a;
	            }
	        }

	       
	        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

	        ler.close();
	    }
	}
