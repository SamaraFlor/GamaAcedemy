import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		// Area de retangula a = base* altura
		
		double base,altura,a;
		
		System.out.println("por favor digite o valor da base");
		base = entrada.nextDouble();
		System.out.println("Por favor digite o valor da altura");
		altura = entrada.nextDouble();
		
		a = base * altura;
		
		System.out.println("valor da area é : " + a);
		entrada.close();
	}
}
