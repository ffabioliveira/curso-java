package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // Por convenção é bom utilizar constantes com letras maiúculas

		raio = PI * raio * raio;

		System.out.println("Área = " + raio + "m2.");
	}
}
