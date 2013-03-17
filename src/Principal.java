import isima.videoteca.control.Sistema;
import isima.videoteca.gui.GUI;
import isima.videoteca.negocio.*;
import java.util.Calendar;
import java.io.Serializable;
import java.util.*;
public class Principal implements Serializable {
	
	
	public static void main(String[] args) {
		
		

 Tema tema1=new Tema(1,"Formacion Basica");
 Tema tema2=new Tema(2,"Automotriz");
 Tema tema3=new Tema(3,"Salud");
 Tema tema4=new Tema(4,"Turismo");
 Tema tema5=new Tema(5,"Electronica y Telecomunicaciones");
 Tema tema6=new Tema(6,"Comercio y Administracion");
 
 ProgramaEducativo pe1=new ProgramaEducativo(1,"Ensamblado de calculadores portatiles", tema5,3,"ET1");
 ProgramaEducativo pe2=new ProgramaEducativo(2,"Transmicion Automatica", tema2,3,"A2");
 ProgramaEducativo pe3=new ProgramaEducativo(3,"Direccion Hidraulica", tema2,3,"A3");
 ProgramaEducativo pe4=new ProgramaEducativo(4,"Fabricacion de motores electrico", tema5,3,"ET4");
 ProgramaEducativo pe5=new ProgramaEducativo(5,"Alerta al Sida", tema1,3,"FB5");
 ProgramaEducativo pe6=new ProgramaEducativo(6,"Simulacro de Evacuacion", tema1,3,"FB6");
 ProgramaEducativo pe7=new ProgramaEducativo(7,"Organizacion de Bar", tema4,3,"T7");
 ProgramaEducativo pe8=new ProgramaEducativo(8,"La vida y la Salud: Cancer", tema3,3,"S8");
 ProgramaEducativo pe9=new ProgramaEducativo(9,"Valoracion Oftometrica", tema3,3,"S9");
 ProgramaEducativo pe10=new ProgramaEducativo(10,"ABC de la Economica: Indice Dow Jones", tema6,3,"CA10");
 ProgramaEducativo pe11=new ProgramaEducativo(11,"¿Que es la calidad total?", tema6,3,"CA11");
 ProgramaEducativo pe12=new ProgramaEducativo(12,"Zonas, Complejos y Centros Turisticos", tema4,3,"T12");
 ProgramaEducativo pe13=new ProgramaEducativo(13,"La planeacion del menu", tema4,3,"T13");
 ProgramaEducativo pe14=new ProgramaEducativo(14,"Vigilancia en un Hotel", tema4,3,"T14");
 ProgramaEducativo pe15=new ProgramaEducativo(15,"Controladores Programables", tema5,3,"ET15");
 ProgramaEducativo pe16=new ProgramaEducativo(16,"Camiones Mercedez Benz", tema2,3,"A16");
 ProgramaEducativo pe17=new ProgramaEducativo(17,"Biografias de Poder: Porfirio Diaz", tema1,3,"FB17");
 ProgramaEducativo pe18=new ProgramaEducativo(18,"Ajuste de Motores a Gasolina", tema2,3,"A18");
 ProgramaEducativo pe19=new ProgramaEducativo(19,"Rabia (Documental)", tema3,3,"S19");
 ProgramaEducativo pe20=new ProgramaEducativo(20,"Planta Termoelectrica", tema5,3,"ET20");

 /*
 System.out.println("Programa Educativo " +pe1.getClave()+ ": Nombre: "+pe1.getNombre()+ " Tema: "+pe1.getTema()+"Copias: "+pe1.getCopias()+"Ubicacion: "+pe1.getUbicacion());
 System.out.println("Programa Educativo " +pe2.getClave()+ ": Nombre: "+pe2.getNombre()+ " Tema: "+pe2.getTema()+"Copias: "+pe2.getCopias()+"Ubicacion: "+pe2.getUbicacion());
 System.out.println("Programa Educativo " +pe3.getClave()+ ": Nombre: "+pe3.getNombre()+ " Tema: "+pe3.getTema()+"Copias: "+pe3.getCopias()+"Ubicacion: "+pe3.getUbicacion());
 System.out.println("Programa Educativo " +pe4.getClave()+ ": Nombre: "+pe4.getNombre()+ " Tema: "+pe4.getTema()+"Copias: "+pe4.getCopias()+"Ubicacion: "+pe4.getUbicacion());
 System.out.println("Programa Educativo " +pe5.getClave()+ ": Nombre: "+pe5.getNombre()+ " Tema: "+pe5.getTema()+"Copias: "+pe5.getCopias()+"Ubicacion: "+pe5.getUbicacion());
 System.out.println("Programa Educativo " +pe6.getClave()+ ": Nombre: "+pe6.getNombre()+ " Tema: "+pe6.getTema()+"Copias: "+pe6.getCopias()+"Ubicacion: "+pe6.getUbicacion());
 System.out.println("Programa Educativo " +pe7.getClave()+ ": Nombre: "+pe7.getNombre()+ " Tema: "+pe7.getTema()+"Copias: "+pe7.getCopias()+"Ubicacion: "+pe7.getUbicacion());
 System.out.println("Programa Educativo " +pe8.getClave()+ ": Nombre: "+pe8.getNombre()+ " Tema: "+pe8.getTema()+"Copias: "+pe8.getCopias()+"Ubicacion: "+pe8.getUbicacion());
 System.out.println("Programa Educativo " +pe9.getClave()+ ": Nombre: "+pe9.getNombre()+ " Tema: "+pe9.getTema()+"Copias: "+pe9.getCopias()+"Ubicacion: "+pe9.getUbicacion());
 System.out.println("Programa Educativo " +pe10.getClave()+ ": Nombre: "+pe10.getNombre()+ " Tema: "+pe10.getTema()+"Copias: "+pe10.getCopias()+"Ubicacion: "+pe10.getUbicacion());
 System.out.println("Programa Educativo " +pe11.getClave()+ ": Nombre: "+pe11.getNombre()+ " Tema: "+pe11.getTema()+"Copias: "+pe11.getCopias()+"Ubicacion: "+pe11.getUbicacion());
 System.out.println("Programa Educativo " +pe12.getClave()+ ": Nombre: "+pe12.getNombre()+ " Tema: "+pe12.getTema()+"Copias: "+pe12.getCopias()+"Ubicacion: "+pe12.getUbicacion());
 System.out.println("Programa Educativo " +pe13.getClave()+ ": Nombre: "+pe13.getNombre()+ " Tema: "+pe13.getTema()+"Copias: "+pe13.getCopias()+"Ubicacion: "+pe13.getUbicacion());
 System.out.println("Programa Educativo " +pe14.getClave()+ ": Nombre: "+pe14.getNombre()+ " Tema: "+pe14.getTema()+"Copias: "+pe14.getCopias()+"Ubicacion: "+pe14.getUbicacion());
 System.out.println("Programa Educativo " +pe15.getClave()+ ": Nombre: "+pe15.getNombre()+ " Tema: "+pe15.getTema()+"Copias: "+pe15.getCopias()+"Ubicacion: "+pe15.getUbicacion());
 System.out.println("Programa Educativo " +pe16.getClave()+ ": Nombre: "+pe16.getNombre()+ " Tema: "+pe16.getTema()+"Copias: "+pe16.getCopias()+"Ubicacion: "+pe16.getUbicacion());
 System.out.println("Programa Educativo " +pe17.getClave()+ ": Nombre: "+pe17.getNombre()+ " Tema: "+pe17.getTema()+"Copias: "+pe17.getCopias()+"Ubicacion: "+pe17.getUbicacion());
 System.out.println("Programa Educativo " +pe18.getClave()+ ": Nombre: "+pe18.getNombre()+ " Tema: "+pe18.getTema()+"Copias: "+pe18.getCopias()+"Ubicacion: "+pe18.getUbicacion());
 System.out.println("Programa Educativo " +pe19.getClave()+ ": Nombre: "+pe19.getNombre()+ " Tema: "+pe19.getTema()+"Copias: "+pe19.getCopias()+"Ubicacion: "+pe19.getUbicacion());
 System.out.println("Programa Educativo " +pe20.getClave()+ ": Nombre:  "+pe20.getNombre()+ " Tema: "+pe20.getTema()+"Copias: "+pe20.getCopias()+"Ubicacion: "+pe20.getUbicacion());
 
*/
 
 
List<ProgramaEducativo> lista = new ArrayList <ProgramaEducativo>();
 
	lista.add(pe1);
	lista.add(pe2);
	lista.add(pe3);
	lista.add(pe4);
	lista.add(pe5);
	lista.add(pe6);
	lista.add(pe7);
	lista.add(pe8);
	lista.add(pe9);
	lista.add(pe10);
	lista.add(pe11);
	lista.add(pe12);
	lista.add(pe13);
	lista.add(pe14);
	lista.add(pe15);
	lista.add(pe16);
	lista.add(pe17);
	lista.add(pe18);
	lista.add(pe19);
	lista.add(pe20);

	System.out.println("Aqui empieza la lista");
	
	for(Iterator<ProgramaEducativo>it = lista.iterator(); it.hasNext();){
		
		ProgramaEducativo p = it.next();
		
		System.out.println("Programa Educativo " +p.getClave()+ ": Nombre:  "+p.getNombre()+ " Tema: "+p.getTema().getNombre()+"Copias: "+p.getCopias()+"Ubicacion: "+p.getUbicacion());
	}
	
	
		
 Persona per1=new Persona("Simon","Almazan","Sanchez");
 
	
 System.out.println(per1.getNombre()+" "+per1.getApellido1()+" "+per1.getApellido2());	
 System.out.println(per1.getNombre("Hola ")+" "+per1.getApellido1()+" "+per1.getApellido2());		
 System.out.println(per1.getNombre(2)+" "+per1.getApellido1()+" "+per1.getApellido2());

// Usuario user1= new Usuario();
//user1 =	 (Usuario)per1;	
//System.out.println(user1.getNombre()+" "+user1.getApellido1()+" "+user1.getApellido2());	
	

	Usuario usuario = new Usuario();
	usuario.setClave(123);

	Sistema sistema =new Sistema(lista);

    Prestamo prestamo = new Prestamo();
	prestamo.setNumeroPrestamo(1);
	prestamo.setFecha(Calendar.getInstance());
	prestamo.setUsuario(usuario);
	prestamo.setProgramaEducativo(pe11);

	sistema.registroPrestamo(prestamo);
	List<ProgramaEducativo> listaNombre = sistema.buscar("¿Que es la calidad total?");
 System.out.println("Aqui empieza la busqueda por nombre");
	
	for(Iterator<ProgramaEducativo>it = listaNombre.iterator(); it.hasNext();){
		
		ProgramaEducativo p = it.next();
		
		System.out.println("Programa Educativo " +p.getClave()+ ": Nombre:  "+p.getNombre()+ " Tema: "+p.getTema().getNombre()+"Copias: "+p.getCopias()+"Ubicacion: "+p.getUbicacion());
	}
	
	List<ProgramaEducativo> listaTema = sistema.buscar(tema2);
	 System.out.println("Aqui empieza la busqueda por Tema");
		
		for(Iterator<ProgramaEducativo>it = listaTema.iterator(); it.hasNext();){
			
			ProgramaEducativo p = it.next();
			
			System.out.println("Programa Educativo " +p.getClave()+ ": Nombre:  "+p.getNombre()+ " Tema: "+p.getTema().getNombre()+"Copias: "+p.getCopias()+"Ubicacion: "+p.getUbicacion());
		}
	
	
	GUI grafico = new GUI();
	grafico.inizializar();
	GUI grafico2 = new GUI();
	grafico2.setSistema(sistema);
	
	
	}
	
	
	
	
	
} 