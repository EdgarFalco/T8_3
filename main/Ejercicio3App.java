package main;

import objetos.Colores;
import objetos.Electrodomestico;
import objetos.Letras;

public class Ejercicio3App {

	public static void main(String[] args) {
		//Creamos un objeto electrodomesto con valores por defecto
		Electrodomestico electro1 = new Electrodomestico();
		//Mostramos el objeto por defecto
		System.out.println(electro1.toString());
		
		//Creamos un segundo objeto electrodomestico con 2 parametros
		Electrodomestico electro2 = new Electrodomestico(150, 500);
		//Mostramos el segundo electrodomestico creado
		System.out.println(electro2.toString());
		
		//Creamos un tercer objeto electrodomestico con todos los parametros
		Electrodomestico electro3 = new Electrodomestico(2, Colores.azul, Letras.B, 500);
		System.out.println(electro3.toString());
	}
}
