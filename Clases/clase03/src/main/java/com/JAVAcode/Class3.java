package com.JAVAcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*import java.util.Arrays;*/

public class Class3 {

	public static void main(String[] args) {

		/*
		 * int[] arrayInt = new int[6]; arrayInt[0] = 1; arrayInt[1] = 2; arrayInt[2] =
		 * 3; arrayInt[3] = 4; arrayInt[4] = 5; arrayInt[5] = 6; //arrayInt[6] = 7;
		 * 
		 * System.out.println("La cantidad de elementos del Array es: " +
		 * arrayInt.length); // ¿Cuantos elementos tiene el array?
		 * System.out.println("El elemento del Array con indice 0 es: " + arrayInt[0]);
		 * System.out.println("El elemento del Array con indice 3 es: " + arrayInt[3]);
		 * System.out.println("El elemento del Array con indice 5 es: " + arrayInt[5]);
		 * 
		 * System.out.println(Arrays.toString(arrayInt));
		 * 
		 * String[] palabras = { "Hola", "Mundo", "Coder", "Chau" };
		 * System.out.println("La cantidad de elementos del Array es: " +
		 * palabras.length); // ¿Cuantos elementos tiene el array?
		 * System.out.println(Arrays.toString(palabras));
		 */

		/********************* Listas *********************/

		List<String> listaDeNombres = new ArrayList<>();

		listaDeNombres.add("Bruno"); // 0
		listaDeNombres.add("Alejandro"); // 1
		listaDeNombres.add("Federico"); // 2

		System.out.println("Antes de Agregar listaDeNombres2" + listaDeNombres);
		List<String> listaDeNombres2 = new ArrayList<>();

		System.out.println(listaDeNombres.containsAll(listaDeNombres2)); // true?
		listaDeNombres2.add("Ana");
		listaDeNombres2.add("Valentin");
		listaDeNombres2.add("Gabriel");

		System.out.println(listaDeNombres2);

		listaDeNombres.addAll(listaDeNombres2);
		List<String> listaDeNombres3 = new ArrayList<>();
		System.out.println("Despues de agregar listaDeNombres2" + listaDeNombres);

		System.out.println(listaDeNombres.containsAll(listaDeNombres2)); // true

		/****************** Ciclo por Conteo *******************/

		for (String nombre : listaDeNombres) {
			System.out.println("Nombre: " + nombre);
		}
		for (String nombre : listaDeNombres2) {
			System.out.println("Nombre en listaDeNombres2: " + nombre);
		}

		if (listaDeNombres.isEmpty()) { // false
			System.out.println("El Array listaDeNombres esta vacio");
		}

		if (listaDeNombres2.isEmpty()) { // false
			System.out.println("El Array listaDeNombres2 esta vacio");
		}

		if (listaDeNombres3.isEmpty()) { // true
			System.out.println("El Array listaDeNombres3 esta vacio");
		}

		System.out.println(listaDeNombres.isEmpty());
		System.out.println(listaDeNombres2.isEmpty());
		System.out.println(listaDeNombres3.isEmpty());

		int indice = 5;
		System.out.println("El nombre en la posicion " + indice + " es el " + listaDeNombres.get(indice));

		listaDeNombres.set(indice, "Jonathan");
		System.out.println(listaDeNombres);

		listaDeNombres.remove(3);
		System.out.println(listaDeNombres);
		listaDeNombres.removeAll(listaDeNombres2);
		System.out.println(listaDeNombres);

		String fede = "Federico";
		System.out.println(listaDeNombres.indexOf(fede));
		listaDeNombres.add("Federico");
		System.out.println(listaDeNombres.lastIndexOf(fede));

		System.out.println(listaDeNombres);

		/********************* Ciclos por condicion Iterator *********************/

		System.out.println("La cantidad de elmentos de listaDeNombres antes de es: " + listaDeNombres.size());

		Iterator<String> iterator = listaDeNombres.iterator();

		while (iterator.hasNext()) {
			String nombre = iterator.next(); // Arranca de 0
			System.out.println("Nombre: " + nombre);
			iterator.remove();
		}
		System.out.println("La cantidad de elmentos de listaDeNombres luego de Iterar es: " + listaDeNombres.size());

		/********************* Ciclos por conteo *********************/

		for (String nombre : listaDeNombres) {
			System.out.println("Nombre: " + nombre);
		}

		/********************* Ciclos While *********************/

		int contador = 0;

		System.out.println("Ya entre al While");

		while (contador < 0) { // false
			System.out.println("El contador actual vale: " + contador);
			contador++;
			// contador = contador + 1; // Se incremente
		}

		System.out.println("Ya sali del While");

		/********************* Do-While *********************/
		System.out.println("Ya entre al doWhile");
		do {
			System.out.println("El contador actual vale: " + contador);
			contador++;
		} while (contador < 0); // false
		System.out.println("Ya sali del doWhile");

		/********************* For *********************/

		for (int contador1 = 1; contador1 <= 3; contador1++) {
			System.out.println("El contador actual vale: " + contador1);
		}
		
		/********************* ForEach *********************/

		List<String> listaDeNombres1 = new ArrayList<>();

		listaDeNombres1.add("Bruno"); // 0
		listaDeNombres1.add("Alejandro"); // 1
		listaDeNombres1.add("Federico"); // 2
		listaDeNombres1.add("Gabriel"); // 3
		System.out.println("\n Usando ForEach");
		listaDeNombres1.forEach(nombre -> {
			System.out.println("Nombre: " + nombre);
		});

		System.out.println("\n Usando Iterable:");
		for (String nombre : listaDeNombres1) {
			System.out.println("Nombre: " + nombre);
		}

		System.out.println("\n Usando for:");
		for (int i = 0; i < listaDeNombres1.size(); i++) {
			System.out.println("Nombre: " + listaDeNombres1.get(i));
		}

		System.out.println("\n Usando Iterator:");

		Iterator<String> iterator1 = listaDeNombres1.iterator();

		while (iterator1.hasNext()) {
			System.out.println("Nombre: " + iterator1.next());
		}
 
	}

}
