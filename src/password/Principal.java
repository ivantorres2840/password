package password;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		
		int num=0;
		System.out.println("Introduce el numero de contrase�as");
		num=leer.nextInt();
		
		password [] vContra= new password[num];
		password [] vContraFuerte= new password[num];
		boolean[] vFuertes = new boolean[num];
		int tama�o=0;
		System.out.println("introduce la longitud de la contrase�a");
		tama�o=leer.nextInt();
		
		for (int i = 0; i < num; i++) {
			password p = new password(tama�o);
			vContra[i]=p;
			vFuertes[i] = p.esFuerte();
			System.out.println(vContra[i]);
			if (p.esFuerte()==true) {
				vContraFuerte[i]=p;	
		}
			
		}
		//
	}

}
