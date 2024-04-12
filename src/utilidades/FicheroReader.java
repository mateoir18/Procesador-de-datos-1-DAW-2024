package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import excepciones.NumeroNegativoException;

public class FicheroReader {

	public static ArrayList<Integer> LeerDatos(String fichero) throws NumeroNegativoException {

		BufferedReader ficheroEntrada;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		try {
			// enlaza con un fichero
			ficheroEntrada = new BufferedReader(new FileReader(fichero));
			// leo la linea a ver si existe y hay algo
			String linea = ficheroEntrada.readLine();

			//procesamos la linea
			DataProcessor d = new DataProcessor();

			// mientras que las lineas existan
			while (linea != null) {
				// convertimos la línea a un numero entero
				int numero = Integer.parseInt(linea);
				try {
				//procesamos el numero
				numeros = d.procesarDatos(numero);
				}
				catch(NumeroNegativoException e){
					System.out.println(e.getMessage());
				}
				// leemos otra linea
				linea = ficheroEntrada.readLine();
			}

			ficheroEntrada.close();
		} catch (IOException e) {
			System.out.println("Problemas: " + e.getMessage());
		} catch (Exception e) {
			// Otros fallos
			e.printStackTrace();
		}

		return numeros;
	}
}
