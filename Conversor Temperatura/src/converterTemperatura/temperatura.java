package converterTemperatura;

public class temperatura {

	public static void main(String[] args) {
		// F�rmula conversor temperatura: (�F - 32) x 5/9 = �C
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		double fahrenheit = 86;
		double celsius = ( fahrenheit - AJUSTE ) * FATOR;
		System.out.println("A convers�o de 86�F para �C �:" + celsius + "�C");

		fahrenheit = 50;
		celsius = ( fahrenheit - AJUSTE ) * FATOR;
	System.out.println("A convers�o de 86�F para �C �:" + celsius + "�C");

}
}