package password;

import java.util.Scanner;

public class usuario {
	private String nombre;
	private password[] vContrase�as;
	
	public  usuario() {
		nombre="";
		vContrase�as= new password[50];
	
	
	}
	
	public usuario (String nombre, int numpassword) {
		this.nombre=nombre;
		vContrase�as=new password[numpassword];
	}
	
	
	public usuario(String nombre) {
		this.nombre=nombre;
		vContrase�as= new password[50];
	}
	
	
	public void a�adirContrase�a() {
		Scanner leer=new Scanner(System.in);
		int tam=0;
		System.out.println("dime e tama�o de la contrase�a");
		tam=leer.nextInt();
		
		
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i]==null) {
				vContrase�as[i]=new password(tam);
				break;
			}
		}
	}
	
	
	
}
