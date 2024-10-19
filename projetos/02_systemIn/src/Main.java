import java.util.Locale;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é seu nome? : ");
		String name =  sc.next();
		System.out.printf("Olá %s , eu sou oswaldo eu assistente virtual!%n",name);
		
		System.out.print("Quantos Anos você tem?: ");
		int idade = sc.nextInt();
		
		System.out.printf("Nossa %d, que legal, eu tenho 78 anos, meus circuitos ja estão meio cansados mais podemos ser amigos :%n)",idade);
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual o valor de PI?: ");
		double pi = sc.nextDouble();
		
		System.out.printf("suas resposta foi %f, o valor de pi é tipo 3,14159265358979323846.... nem eu sei ele completo%n",pi);
		
		sc.close();
	}
}
