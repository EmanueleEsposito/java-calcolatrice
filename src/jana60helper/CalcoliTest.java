package jana60helper;

public class CalcoliTest {

	public static void main(String[] args) {
		// Test somma di due numeri interi
		System.out.println("La somma � = " + CalcoliHelper.sommaNumeri(5, 50));

		// Test differenza tra due numeri interi
		System.out.println("La differenza � = " + CalcoliHelper.differenzaNumeri(100, 25));

		// Test Moltiplicazione di due numeri interi
		System.out.println("Il prodotto � = " + CalcoliHelper.moltiplicazioneNumeri(5, 27));

		// Test Valore assoluto di un numero intero
		System.out.println("Il valore assoluto � = " + CalcoliHelper.valoreAssolutoNumero(-150));

		// Test Minimo tra due numeri interi
		System.out.println("Il minimo � = " + CalcoliHelper.minimoNumeri(25, -50));

		// Test Massimo tra due numeri interi
		System.out.println("Il massimo � = " + CalcoliHelper.massimoNumeri(-150, -125));
		// Test elevazione alla potenza
		System.out.println("Il risultato dell'elelazione alla potenza �= " + CalcoliHelper.CalcoloPotenza(2, 8));
	}

}
