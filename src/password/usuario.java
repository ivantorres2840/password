package password;

import java.util.Scanner;

public class usuario {
	private String nombre;
	private password[] vContraseñas;
	
	public  usuario() {
		nombre="";
		vContraseñas= new password[50];
	
	
	}
	
	public usuario (String nombre, int numpassword) {
		this.nombre=nombre;
		vContraseñas=new password[numpassword];
	}
	
	
	public usuario(String nombre) {
		this.nombre=nombre;
		vContraseñas= new password[50];
	}
	
	
	public void añadirContraseña() {
		Scanner leer=new Scanner(System.in);
		int tam=0;
		System.out.println("dime e tamaño de la contraseña");
		tam=leer.nextInt();
		
		
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i]==null) {
				vContraseñas[i]=new password(tam);
				break;
			}
		}
	}
	
	
	
}
