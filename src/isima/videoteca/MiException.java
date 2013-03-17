package isima.videoteca;
import java.io.Serializable;


public class MiException extends Exception {

	public MiException(String mensaje) {
		
		super (mensaje);
	}
public MiException (String mensaje, Throwable e){
	
	super (mensaje, e);
}
}
