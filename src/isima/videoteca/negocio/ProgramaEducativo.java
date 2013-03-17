package isima.videoteca.negocio;
import java.io.Serializable;

public class ProgramaEducativo implements Serializable {

	private String nombre;
	private Tema tema;
	private int copias;
	private String ubicacion;
	private int clave;

	public String getUbicacion(){
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion){
			   this.ubicacion=ubicacion;
		   }
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
			   this.nombre=nombre;
		   } 
	public Tema getTema(){
		return this.tema;
	}
	public void setTema(Tema tema){
			   this.tema=tema;
		   }
	public int getCopias(){
		return this.copias;
	}
	public void setCopias(int copias){
			   this.copias=copias;
		   }
	public int getClave(){
		return this.clave;
	}
	public void setClave(int clave){
			   this.clave=clave;
		   }
	public ProgramaEducativo (){}
	public ProgramaEducativo(int c, String n, Tema t, int cop, String ub){
		this.clave=c;
		this.nombre=n;
		this.tema=t;
		this.copias=cop;
		this.ubicacion=ub;
	}	
	
	
	}
	
	





