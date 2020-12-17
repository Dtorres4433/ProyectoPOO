package Caramel_and_Coffee;

import java.util.Scanner;

public class Usuario {
	Scanner sn = new Scanner(System.in);
	private String nombre;
	private String direccion;
	
	public Usuario() {
		nombre = " ";
		direccion = " ";
	}
	public Usuario(String unnombre, String undireccion) {
		nombre = unnombre;
		direccion = undireccion;
	}
	public Usuario(Usuario U) {
		nombre = U.nombre;
		direccion = U.direccion;
	}
	public Usuario clone() {
		return new Usuario(this.nombre, this.direccion);
		
	}
	public void leerUsuario() {
		System.out.println("Ingrese su Nombre: ");
		nombre = sn.nextLine();
		System.out.println("Ingrese su Direccion: ");
		direccion = sn.nextLine();
	}
	public void mostrarUsuario() {
		System.out.println("Nombre: " +nombre);
		System.out.println("Direccion: " +direccion);
	}
	boolean equals(Usuario U) {
		return ((this.equals(U.nombre))&&(this.equals(U.direccion)));
		
	}
	public String getNombre() {
		return nombre;	
	}
	public String getDireccion() {
		return direccion;
	}
	public void setNombre(String unnombre) {
		nombre = unnombre;
	}
	public void setDireccion(String undireccion) {
		nombre = undireccion;
	}
	
}
