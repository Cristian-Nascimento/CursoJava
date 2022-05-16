package converterTemperatura;

public class temperatura {

	public static void main(String[] args) {
		// Fórmula conversor temperatura: (°F - 32) x 5/9 = °C
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		double fahrenheit = 86;
		double celsius = ( fahrenheit - AJUSTE ) * FATOR;
		System.out.println("A conversão de 86°F para °C é:" + celsius + "°C");

		// Mudança de temperatura de 86°F para 50°F !
		fahrenheit = 50;
		celsius = ( fahrenheit - AJUSTE ) * FATOR;
		System.out.println("A conversão de 86°F para °C é:" + celsius + "°C");

}
}
