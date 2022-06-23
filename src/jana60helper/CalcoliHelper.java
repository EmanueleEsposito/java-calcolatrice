package jana60helper;

public class CalcoliHelper {

	private CalcoliHelper() {
		// costruttore private
	}

	// Metodi static
	// Metodo calcolo somma di due numeri interi
	public static int sommaNumeri(int numero1, int numero2) {
		return numero1 + numero2;
	}

	// Overload del metodo somma
	public static double sommaNumeri(double numero1, double numero2) {
		return numero1 + numero2;
	}

	// Metodo differenza tra due numeri interi
	public static int differenzaNumeri(int numero1, int numero2) {
		return numero1 - numero2;
	}

	// Overload metodo differenza
	public static double differenzaNumeri(double numero1, double numero2) {
		return numero1 - numero2;
	}

	// Metodo moltiplicazione di due numeri interi
	public static int moltiplicazioneNumeri(int numero1, int numero2) {
		return numero1 * numero2;
	}

	// Overload metodo prodotto
	public static double moltiplicazioneNumeri(double numero1, double numero2) {
		return numero1 * numero2;
	}

	// Metodo valore assoluto di un numero intero
	public static int valoreAssolutoNumero(int numeroInt) {
		return (numeroInt < 0) ? -numeroInt : numeroInt;
	}

	// Overload metodo valore assoluto
	public static double valoreAssolutoNumero(double numeroDecimale) {
		return (numeroDecimale < 0) ? -numeroDecimale : numeroDecimale;
	}

	// Metodo minimo tra due numeri interi
	public static int minimoNumeri(int numero1, int numero2) {
		int numeroMinimo = 0;
		if (numero1 < numero2) {
			return numeroMinimo = numero1;
		} else if (numero2 < numero1) {
			return numeroMinimo = numero2;
		}
		return numeroMinimo;
	}

	// Overload metodo minimo
	public static double minimoNumeri(double numero1, double numero2) {
		double numeroMinimoDecimale = 0.0;
		if (numero1 < numero2) {
			return numeroMinimoDecimale = numero1;
		} else if (numero2 < numero1) {
			return numeroMinimoDecimale = numero2;
		}
		return numeroMinimoDecimale;
	}

	// Metodo massimo tra due numeri interi
	int numeroMassimo = 0;

	public static int massimoNumeri(int numero1, int numero2) {
		int numeroMassimo = 0;
		if (numero1 > numero2) {
			return numeroMassimo = numero1;
		} else if (numero2 > numero1) {
			return numeroMassimo = numero2;
		}
		return numeroMassimo;
	}

	// Overload metodo massimo
	int numeroMassimoDecimale = 0;

	public static double massimoNumeri(double numero1, double numero2) {
		double numeroMassimoDecimale = 0.0;
		if (numero1 > numero2) {
			return numeroMassimoDecimale = numero1;
		} else if (numero2 > numero1) {
			return numeroMassimoDecimale = numero2;
		}
		return numeroMassimoDecimale;
	}

	// Metodo per l'elevamento alla potenza
	public static int CalcoloPotenza(int base, int esponente) {
		int potenza = 1;
		if (base > 0 && esponente == 0) {
			return potenza;
		} else if (base == 0 && esponente >= 0) {
			return 0;
		} else {
			for (int i = 1; i <= esponente; i++) {
				potenza = potenza * base;
			}
			return potenza;
		}

	}
}
