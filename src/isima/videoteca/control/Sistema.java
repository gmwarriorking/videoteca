package isima.videoteca.control;

import isima.videoteca.MiException;
import isima.videoteca.negocio.Prestamo;
import isima.videoteca.negocio.ProgramaEducativo;
import isima.videoteca.negocio.Tema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sistema implements ISistema {

	
	
	
	
	private List <ProgramaEducativo> lista;
	
	public Sistema (List<ProgramaEducativo> lista){
		this.lista = lista;
	}
	
	
	
	

	public List<ProgramaEducativo> buscar(String nombre) {
		List<ProgramaEducativo> aux = new ArrayList <ProgramaEducativo>();
			for(Iterator<ProgramaEducativo> it = lista.iterator(); it.hasNext();){
				ProgramaEducativo pe = it.next();
				if(pe.getNombre().equals(nombre))
					aux.add(pe);
					
			}
		return aux;
	}


	public List<ProgramaEducativo> buscar(Tema tema) {
		List <ProgramaEducativo> aux = new ArrayList <ProgramaEducativo>();
		for(Iterator <ProgramaEducativo>it = lista.iterator(); it.hasNext();){
			ProgramaEducativo pe = it.next();
			if(pe.getTema().getClave()== tema.getClave())
			aux.add(pe);
		}
		
		
		return aux;
	}

	
	public void registroPrestamo(Prestamo prestamo) {
		File archivo =new File ("C:\\eclipse\\archivo.txt");
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter(archivo));
			out.println(prestamo.toString());
			out.close();
			
		}
		catch (IOException roe){
System.out.println("Ocurrio un error al registrar el prestamo");
		}
			
	}
	
	}
