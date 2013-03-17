package isima.videoteca.negocio;
import java.util.*;
import java.io.Serializable;
public class Prestamo implements Serializable {

	private int numeroPrestamo;
	private Calendar fecha;
	private ProgramaEducativo programaEducativo;
	private Usuario usuario;
	
	
	public int getNumeroPrestamo() {
		return numeroPrestamo;
	}

	public void setNumeroPrestamo(int numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}


	public ProgramaEducativo getProgramaEducativo() {
		return programaEducativo;
	}

	public void setProgramaEducativo(ProgramaEducativo programaEducativo) {
		this.programaEducativo = programaEducativo;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Prestamo() {
	}

    public String toString() {
	
	return this.numeroPrestamo+"|"+ this.programaEducativo.getNombre()+"|"+this.usuario.getClave()+"|"+fecha.get(Calendar.DAY_OF_MONTH)+"/"+fecha.get(Calendar.MONTH)+"/"+(fecha.get(Calendar.YEAR));
	

	
}



}