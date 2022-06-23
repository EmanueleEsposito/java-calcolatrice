package jana60helper;

public class CalcoliHelper {

	private CalcoliHelper() {
		// costruttore private
	}

	// Metodi static
	// Metodo calcolo somma di due numeri interi
	public static int sommaNumeriInteri(int numero1, int numero2) {
		return numero1 + numero2;
	}

	// Metodo differenza tra due numeri interi
	public static int differenzaNumeriInter(int numero1, int numero2) {
		return numero1 - numero2;
	}

	// Metodo moltiplicazione di due numeri interi
	public static int moltiplicazionneNumeriInteri(int numero1, int numero2) {
		return numero1 * numero2;
	}

	// Metodo valore assoluto di un numero intero
	public static int valoreAssolutoNumeroIntero(int numeroInt) {
		return (numeroInt < 0) ? -numeroInt : numeroInt;
	}

	// Metodo minimo tra due numeri interi
	public static int minimoNumeriIntero(int numero1, int numero2) {
		int numeroMinimo = 0;
		if (numero1 < numero2) {
			return numeroMinimo = numero1;
		} else if (numero2 < numero1) {
			return numeroMinimo = numero2;
		} else
			numeroMinimo = 0;
		return numeroMinimo;
	}

	// Metodo massimo tra due numeri interi
	int numeroMassimo = 0;

	public static int massimoNumeriIntero(int numero1, int numero2) {
		int numeroMassimo = 0;
		if (numero1 > numero2) {
			return numeroMassimo = numero1;
		} else if (numero2 > numero1) {
			return numeroMassimo = numero2;
		}
		return numeroMassimo;
	}
}
