import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//volume de um cubo v =lado*lado*lado
		
		double v, lado;
		
		System.out.println("digite o valor do lado ");
		lado = entrada.nextDouble();
		
		v = lado*lado*lado;
		
		System.out.println("Valor do volume e:  "  + v);
		
		entrada.close();
	}

}
