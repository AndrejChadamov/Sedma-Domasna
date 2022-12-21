package zadaca05.b;

import java.util.Set;
import java.util.TreeSet;
public class Glavna {
public static void main (String [] args) {
	Set<String> mnozestvo1 = new TreeSet<String> ();
	mnozestvo1.add("Kafena");
	mnozestvo1.add("Sina");
	mnozestvo1.add("Zolta");
	
	Set<String> mnozestvo2 = new TreeSet<String> ();
	mnozestvo2.add("Kafena");
	mnozestvo2.add("Crna");
	mnozestvo2.add("Portokalova");
	
	System.out.println("Unija od dvete mnozestva");
	mnozestvo1.addAll(mnozestvo2);
	System.out.println(mnozestvo1);
}
}