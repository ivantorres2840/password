package password;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		
		int num=0;
		System.out.println("Introduce el numero de contraseñas");
		num=leer.nextInt();
		
		password [] vContra= new password[num];
		int tamaño=0;
		System.out.println("introduce la longitud de la contraseña");
		tamaño=leer.nextInt();
		
		for (int i = 0; i < vContra.length; i++) {
			password p = new password(tamaño);
			vContra[i]=p;
			System.out.println(vContra[i]);
		}
		//
	}

}
