package isima.videoteca.control;
import java.util.*;

import isima.videoteca.MiException;
import isima.videoteca.negocio.*;
public interface ISistema {


List<ProgramaEducativo>buscar(String nombre);
List<ProgramaEducativo>buscar(Tema tema);
void registroPrestamo(Prestamo prestamo)throws MiException;

}
