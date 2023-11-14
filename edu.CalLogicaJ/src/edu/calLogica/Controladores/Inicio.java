package edu.calLogica.Controladores;


import java.util.Scanner;

import edu.calLogica.Servicios.MenuImplementacion;
import edu.calLogica.Servicios.MenuInterfaz;


public class Inicio {

	public static void main(String[] args) {

		short opcionIntro;
		
		Scanner numerIntroUsu = new Scanner (System.in);
		MenuInterfaz mi = new MenuImplementacion();
		boolean cerrarMenu = false;
		
		
		while (!cerrarMenu)
		{
			opcionIntro = mi.menu(numerIntroUsu);
			String palabra01;
			String palabra02;
		
		switch (opcionIntro)	
		{
			case 0:
				
				System.out.println("Seleccion Cerrar Menu");
				cerrarMenu = true;
				break;
				
				
			case 1:
				
				System.out.println("Seleccion Igualdad");
				System.out.println("Introduzca una palabra");
				palabra01 = numerIntroUsu.next(); 
				System.out.println("Introduzca una palabra");
				palabra02 = numerIntroUsu.next(); 
				System.out.println(palabra01.equalsIgnoreCase(palabra02));
				break;
				
				
			case 2:			
			
				System.out.println("Seleccion Desigualdad");
				System.out.println("Introduzca una palabra");
				palabra01 = numerIntroUsu.next(); 
				System.out.println("Introduzca una palabra");
				palabra02 = numerIntroUsu.next(); 
				System.out.println(!palabra01.equalsIgnoreCase(palabra02));
				break;
			default:
				System.out.println("Seleccion NO valida");
				break;
			
		}
		}
	}

}