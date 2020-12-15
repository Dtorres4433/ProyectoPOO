/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caramel_and_Coffee;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Tarjeta {
    static Scanner sn = new Scanner(System.in);
    private String Card;
    private String Nombre;
    public Tarjeta() {
		Card = "";
		Nombre = "";
	}
	public Tarjeta(String uncard, String unnombre) {
		Card = uncard;
		Nombre = unnombre;
	}
	public Tarjeta(Tarjeta T) {
		Card = T.Card;
		Nombre = T.Nombre;
	}
	public Tarjeta clone() {
		return new Tarjeta(this.Card, this.Nombre);
	}
	public void leer() {
		System.out.println("Introducir el Nombre");
		Nombre = sn.nextLine();
		System.out.println("Introducir el numero de tarjeta");
		Card = sn.nextLine();
	}
}
