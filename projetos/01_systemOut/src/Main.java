import java.util.Locale;

public class Main {
	public static void main(String[] args){
		float y  = (float) 32.233223;
		int x = 12;
		Double i = (double) 243.0456765432;
		
		System.out.print("O valor do inteiro double vale: ");
		System.out.println(i);
		System.out.print("O valor da variavel x é: ");
		System.out.println(x);
		System.out.print("O valor do float y com 2 casas decimais é: ");
		System.out.printf("%.2f%n",y);
		Locale.setDefault(Locale.FRANCE); // Imprime com o padrão frança que utiliza , ao inves de . 
		System.out.printf("%.2f%n",y);
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 23;
		float salario = (float) 1542.23;
		
		System.out.printf("%s de %d anos tem salario de %.2f", nome, idade , salario);
	}
}