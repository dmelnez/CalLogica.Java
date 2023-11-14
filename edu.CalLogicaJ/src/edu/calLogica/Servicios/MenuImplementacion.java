package edu.calLogica.Servicios;

import java.util.Scanner;


public class MenuImplementacion implements MenuInterfaz {

	public short menu(Scanner numerIntro)
	{
		short numElegido;
		
		System.out.println("########################");
		System.out.println("[0] -> Cerrar Menu");
		System.out.println("[1] -> Igualdad");
		System.out.println("[2] -> Desigualdad");
		System.out.println("########################");
	
		numElegido = numerIntro.nextShort();
		return numElegido;
	}
}