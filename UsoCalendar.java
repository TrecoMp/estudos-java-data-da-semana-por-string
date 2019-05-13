
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UsoCalendar {
	    public static void main(String[] args) {
	        String data = "13/05/2019";
	        
	        GregorianCalendar gc = new GregorianCalendar();
	        
	        try {
				gc.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(data));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        System.out.println("Data Agora: "+gc.get(Calendar.DAY_OF_WEEK));
		    
		///PARA PEGAR A DATA ATUAL E COLOCAR NO FORMATO ANTERIOR
		/*
		Calendar c = Calendar.getInstance();
	    	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    	System.out.println(formato.format(c.getTime()));
		*/
	}
}
