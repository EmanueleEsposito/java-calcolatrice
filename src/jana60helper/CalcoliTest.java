package jana60helper;

public class CalcoliTest {

	public static void main(String[] args) {
		// Test somma di due numeri interi
		System.out.println("La somma � = " + CalcoliHelper.sommaNumeriInteri(5, 10));

		// Test differenza tra due numeri interi
		System.out.println("La differenza � = " + CalcoliHelper.differenzaNumeriInter(150, 25));

		// Test Moltiplicazione di due numeri interi
		System.out.println("Il prodotto � = " + CalcoliHelper.moltiplicazionneNumeriInteri(5, 27));

		// Test Valore assoluto di un numero intero
		System.out.println("Il valore assoluto � = " + CalcoliHelper.valoreAssolutoNumeroIntero(-96));

		// Test Minimo tra due numeri interi
		System.out.println("Il minimo � = " + CalcoliHelper.minimoNumeriIntero(80, -100));

		// Test Massimo tra due numeri interi
		System.out.println("Il massimo � = " + CalcoliHelper.massimoNumeriIntero(-150, -125));
	}

}
