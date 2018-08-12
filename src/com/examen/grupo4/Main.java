package com.examen.grupo4;

import java.io.BufferedReader;

import java.io.FileReader;

public class Main {
	/**
	 * INSTRUCCIONES PARA EL PRIMER EXAMEN PRACTICO 
	 * 1.- Cree un proyecto nuevo de Java SE, nombrelo como ExamenPractico1 
	 * 2.- Cree un paquete con el nombre com.examen1.grupo4 
	 * 3.- Cree clase Main, agregue su nombre en un comentario.
	 * 4.- Dentro de la clase Main cree un metodo llamado leerArchivo que reciba de
	 * parametro una cadena que sea la ruta del archivo. 
	 * 5.- Cree un archivo de prueba facil de encontrar. 
	 * 6.- Lea ese archivo con su programa.
	 * 
	 * Tiempo de termino: 45 minutos.
	 */
	public static void main(String[] args) {
		// TODO Como requisito del examen agrego mi nombre: Francisco Javier Gonzalez Ruano

		leerArchivo("src/Text1.txt"); // Se manda a llamar el metodo
	}

	public static boolean leerArchivo(String archivo) // Se crea el metodo que recive 
	//como parametro un archivo
	{
		try {
			BufferedReader bfrd = new BufferedReader( // Leer bytes del archivo
					new FileReader(archivo)); // Del archivo que se te indica
			String s = new String(); // Variable en la que se guardara el string
			while ((s = bfrd.readLine()) != null) // Mientras que lo que se lea sea 
				//diferente de null
			{
				System.out.println(s); // Imprimir s
			}
			bfrd.close(); // Se dejan de leer los bytes del archivo
			return true; // Se regresa boolean
		} catch (Exception e) { // Exepcion para manejar error
			e.printStackTrace();
			return false;
		}

	}

}

//14/11/2017
