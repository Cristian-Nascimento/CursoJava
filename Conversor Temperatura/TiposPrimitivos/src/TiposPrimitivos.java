	// Exercicio de tipos primitivos da linquagen Java
public class TiposPrimitivos { 

	public static void main(String[] args) {
		// Informacoes do funcionario
		
		//Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 600;
		int id = 383728;
		long pontosAcumulados = 3323485462L;
		
		// Tipos numericos reais
		float salario = 11560.45F;
		double vendasAcumuladas = 2991797103.52;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'a'; // apenas UM unico caracter
		
		// Dias de empresa
		System.out.println( anosDeEmpresa * 365 + ": Dias");
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2 + " Voos");
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas + ": Relacao pontos por venda");
		
		//
		System.out.println("O usuario " + id + ": ganha " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
