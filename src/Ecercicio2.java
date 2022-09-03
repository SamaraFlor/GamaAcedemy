import java.util.Scanner;

public class Ecercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//volume de um cilindro dado o seu diametro  e considerado pi=3.14
		//v=3.14 *raio*raio*altura

		double altura,raio, v;
		
		System.out.println("digite o valor do raio : ");
		raio = entrada.nextDouble();
		System.out.println("digite a altura do raio : ");
		altura = entrada.nextDouble();
		
		v = 3.14 * raio * raio *  altura;
		
		System.out.println("volume do cilindro é:  " + v);
		
		entrada.close();
	}

}
