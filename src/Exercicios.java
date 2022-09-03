import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//entrara com um numero de 3 digitos e invertelos
		int numeroInicial,c,d,u,resto;
		int numeroAtual;
		
		//entrei com o numero
		System.out.println("digite o numero ");
		numeroInicial = entrada.nextInt();
		
		//Processo, decompor o numero
		c = numeroInicial/100;
		//sobrou do resto acima
		resto = numeroInicial %100;
		d = resto / 10;
		u = resto %10;
		
		numeroAtual = u*100 + d*10 +c;
		
		System.out.println("o numero é  "+ numeroAtual);
		
		entrada.close();
	}

}
