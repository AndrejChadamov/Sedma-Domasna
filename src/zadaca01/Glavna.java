package zadaca01;
import java.util.ArrayList;
import java.util.List;
public class Glavna {
public static void main(String[] args) {
	List<String> lista = new ArrayList<String>();
	lista.add("Paracetamol");
	lista.add("Nalgesin");
	lista.add("Paracetamol");
	lista.add("Dijazepam");
	lista.add("Fervex");
	
	if(lista.get(lista.size() - 1).equals("Paracetamol")){
		System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
	}
	else 
		System.out.println("Namenata na lekot ne e poznata");
}
}