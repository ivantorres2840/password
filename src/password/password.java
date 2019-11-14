package password;

import java.util.Random;

public class password {
	private String contraseña;
	private int longitud;
	
	public password() {
		longitud=8;
		generarpassword(longitud);
	}
	
	public password(int longitud) {
		this.longitud=longitud;
		generarpassword(longitud);
	}
	
	private void generarpassword(int longitud) {
		String contraseña="";
		int num =0;
		Random r = new Random();
		
			
		
		for (int i=0; i<longitud;i++) {
			num = r.nextInt(3);
			switch (num) {
			case 0:
				
					contraseña += (char) (r.nextInt(26)+65);
				
				break;
			case 1:
				
					contraseña += (char) (r.nextInt(10)+48);
					
				
				break;
			case 2:
				
					contraseña += (char) (r.nextInt(26)+97);
					
				
				break;
			}
		}
		this.contraseña=contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String toString() {
		return "password [contraseña=" + contraseña + ", esFuerte()=" + esFuerte() + "]";
	}
	
	public boolean esFuerte() {
		int numcaracter=0;
		int nummayus=0;
		int numminus=0;
		int nums=0;
		
		for (int i = 0; i < this.contraseña.length(); i++) {
			numcaracter=this.contraseña.codePointAt(i);
			
			if (numcaracter<58) {
				nums++;
			}else if (numcaracter>96) {
				numminus++;
			}else {
				nummayus++;
			}
		}
		
		if ((nums>5) && (numminus>1) && (nummayus>2)) {
			return true;
		}
			return false;
		}
		
		
		
		
	}
	
	
	

