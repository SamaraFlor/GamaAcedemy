import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		// area de um quadrado a = lado*lado
		
		double a,lado;
		
		System.out.println("Digite o valor equivalente ao lado do quadrado");
		lado = entrada.nextDouble();
		
		a = lado*lado;
				
				System.out.println("a Area é   "+ a);
		
		entrada.close();

	}

}
