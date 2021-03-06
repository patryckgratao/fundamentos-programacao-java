package lista10;

public class Exercicio09 {

	public static void main(String[] args) {
		System.out.println("Quantidade de dias ==> "+quantDias(1994, 2020));
	}

	public static int quantDias(int anoInicial, int anoFinal) {
		int dias = 0;
		while (anoInicial < anoFinal) {
			if ((anoInicial % 4 == 0 && anoInicial % 100 != 0) || (anoInicial % 400 == 0)) {
				dias += 366;
			}
			else {
				dias += 365;
			}
			anoInicial++;
		}
		return dias;
	}
}
