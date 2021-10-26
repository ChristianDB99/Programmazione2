package scuola;
import java.util.Comparator;

public class MyComparator implements Comparator<Object>{
	
	public int compare(Object a, Object b)
	{
		if (!(a instanceof Prenotazione) || !(b instanceof Prenotazione)) {}
	      Prenotazione p1 = (Prenotazione)a;
	      Prenotazione p2 = (Prenotazione)b;
	      if (p1.getInizio()<p2.getInizio()) return -1;
	      else if (p1.getInizio()==p2.getInizio()) return 0;
	      else return 1;
	}
}
