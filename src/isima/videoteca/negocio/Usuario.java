package isima.videoteca.negocio;

import java.io.Serializable;

public class Usuario extends Persona implements Serializable {
	
		private int clave;
		
	public int getClave(){
		return this.clave;
	}
	public void setClave(int clave){
			   this.clave=clave;

	}

	public Usuario (){}
	public Usuario (int c){
		this.clave=c;
		

	}
	

}



