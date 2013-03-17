package isima.videoteca.negocio;

import java.io.Serializable;
public class Tema implements Serializable {
	
	
		private int clave;
		private String nombre;	
	
	public int getClave(){
		return this.clave;
	}
	public void setClave(int clave){
			   this.clave=clave;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
			   this.nombre=nombre;
	}	

	public Tema (){}
	public Tema (int c, String n){
		this.clave=c;
		this.nombre=n;
	}
	
	
	
}
