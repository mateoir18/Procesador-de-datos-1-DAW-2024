package main;

import java.util.ArrayList;

import utilidades.FicheroReader;
import excepciones.NumeroNegativoException;

public class Start {

	public static void main(String[] args) {

		try {
			ArrayList<Integer> numeros = FicheroReader.LeerDatos("./datos.txt");
			System.out.println(numeros.toString());

		} catch (NumeroNegativoException e) {
			System.out.println(e.getMessage());

		}

	}
}
