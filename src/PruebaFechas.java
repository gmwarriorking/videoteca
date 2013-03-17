

	import java.util.*;
		
	
	public class PruebaFechas {
		
	public static void main(String arg[]) {
	Date d = new Date();
	GregorianCalendar gc = new GregorianCalendar();
	gc.setTime(d);
	System.out.println("Era: "+gc.get(Calendar.ERA));
	System.out.println("Year: "+gc.get(Calendar.YEAR));
	System.out.println("Month: "+gc.get(Calendar.MONTH));
	System.out.println("Dia del mes: "+gc.get(Calendar.DAY_OF_MONTH));
	System.out.println("D de la S en mes:"
	+gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println("No de semana: "+gc.get(Calendar.WEEK_OF_YEAR));
	System.out.println("Semana del mes: "+gc.get(Calendar.WEEK_OF_MONTH));
	System.out.println("Fecha: "+gc.get(Calendar.DATE));
	System.out.println("Hora: "+gc.get(Calendar.HOUR));
	System.out.println("Tiempo del dia: "+gc.get(Calendar.AM_PM));
	System.out.println("Hora del dia: "+gc.get(Calendar.HOUR_OF_DAY));
	System.out.println("Minuto: "+gc.get(Calendar.MINUTE));
	System.out.println("Segundo: "+gc.get(Calendar.SECOND));
	System.out.println("Dif. horaria: "+gc.get(Calendar.ZONE_OFFSET));
	}
	}

