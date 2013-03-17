package isima.videoteca.negocio;
import java.io.Serializable;

public class Persona implements Serializable {

	protected String nombre;
	protected String apellido1;
	protected String apellido2;
		
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
			   this.nombre=nombre;
	}
	public String getApellido1(){
		return this.apellido1;
	}
	public void setApellido1(String apellido1){
			   this.apellido1=apellido1;
	}
	public String getApellido2(){
		return this.apellido2;
	}
	public void setApellido2(String apellido2){
			   this.apellido2=apellido2;
	}
	
	public Persona (){}
	public Persona (String n, String ap1, String ap2){
		
		this.nombre=n;
		this.apellido1=ap1;
		this.apellido2=ap2;
	
	}

public String getNombre(String cadena){
	return cadena+this.nombre;
}
public String getNombre(int numero){
		String cadena="";
	for (int i=0; i< numero; i++)
	cadena+=nombre;
	return cadena;

}


}
