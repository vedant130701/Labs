
// import java.util.Locale; 
// import java.util.TimeZone; 
import java.util.Calendar; 
import java.util.GregorianCalendar; 
  
public class gregCal { 
    public static void main(String args[]) 
    { 
       
        GregorianCalendar gcal = new GregorianCalendar(); 
  
        // displaying the date, time, time zone and locale 
        System.out.print("Date: "
                         + gcal.get(Calendar.MONTH) + " "
                         + gcal.get(Calendar.DATE) + ", "
                         + gcal.get(Calendar.YEAR) + "\n"); 
    } // end of main function 
} // end of class 
