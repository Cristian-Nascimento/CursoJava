import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// Abertura do Scanner, para leitura de valores inseridos atraves do teclado.
		Scanner  numero = new Scanner (System.in);
		
        //inserção de valores do tipo String
		System.out.println("Informe o primeiro salario:");
		String valor1 = numero.next().replace(",",".");
		
		System.out.println("Informe o primeiro salario:");
		String valor2 = numero.next().replace(",",".");		
		
		System.out.println("Informe o primeiro salario:");
		String valor3 = numero.next().replace(",",".");
		
		//Conversor do tipo String para tipo Double
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
        //Calculo da media
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("A media dos salarios e: " + media);
	
		numero.close();
	}

}
