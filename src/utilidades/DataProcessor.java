package utilidades;

import java.util.ArrayList;

import excepciones.NumeroNegativoException;

public class DataProcessor {

	private ArrayList<Integer> numeros;

	public DataProcessor() {
		numeros = new ArrayList<Integer>();
	}

	public ArrayList<Integer> procesarDatos(int numero) throws NumeroNegativoException {
		if(numero<0) {
			throw new NumeroNegativoException("Número negativo");
		}
		else {
			numeros.add(numero);
		}
		return numeros;
	}

	@Override
	public String toString() {
		return "DataProcessor [numeros=" + numeros + "]";
	}
}
