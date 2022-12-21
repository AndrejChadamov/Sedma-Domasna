package zadaca03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Glavna {

	public static void main (String[] args) {
		List<SportskiKlub> lista = new ArrayList<SportskiKlub>();
			lista.add(new SportskiKlub("Arsenal", "Fudbal", 16));
		    lista.add(new SportskiKlub("Liverpool", "Fudbal", 16));
		    lista.add(new SportskiKlub("PSG", "Fudbal", 16));
		    
		    Collections.sort(lista);
		    for (SportskiKlub a : lista) {
		    	System.out.println(a.getime());
		    	System.out.println(a.getsport());
		    	System.out.println(a.getbrojClenovi());
		    	System.out.println();
		    }
	}
}
