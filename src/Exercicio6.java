import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		/*100kw = 1/7 salario minimo
		 1kw = x
		 x *100 = salarioMinimo/7 => x = salarioMinimo/7/100
		*/ 
		double salarioMinimo, valorKw, qtdKw,valorTotal,valorDesconto;
		
		System.out.println("Digite o valor do salario ");
		salarioMinimo = entrada.nextDouble();
		System.out.println("Digite a quantidade de kw gastos ");
		qtdKw = entrada.nextDouble();
		
		valorKw = salarioMinimo / 7.0 /100.0;
		
		valorTotal = qtdKw * valorKw;
		
		valorDesconto = valorTotal * 0.9;
		
		System.out.println("O valor de 1 kw e igual  "  +  valorKw    +   "    o valor total da conta "    + valorTotal     + "      o valor total com desconto: "    +     valorDesconto);
		
		
		entrada.close();

	}

}
