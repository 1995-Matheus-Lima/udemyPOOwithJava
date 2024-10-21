import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String todaLinha;
		
		//Temos que usar o next line apos um sc.next.. que n seja nextLine.
		//Pois fica um \n pendente na estrada padrão e quando utilizarmos next line ele será consumido
		
		System.out.print("Digite a linha que você gostaria de salvar: ");
		todaLinha = sc.nextLine();
		System.out.println(todaLinha);
	}
}
