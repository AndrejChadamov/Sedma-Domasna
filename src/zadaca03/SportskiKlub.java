package zadaca03;

public class SportskiKlub implements Comparable<SportskiKlub>{
	private String ime;
	private String sport;
	private int brojClenovi;
	
	public SportskiKlub(String ime,String sport,int brojClenovi ) {
		this.ime= ime;
		this.sport=sport;
		this.brojClenovi=brojClenovi;
	}
public String getime() {
	return ime;
}
public void setime(String ime) {
	this.ime=ime;
}
public String getsport() {
	return sport;
}
public void setsport(String sport) {
	this.sport=sport;
}
public int getbrojClenovi() {
	return brojClenovi;
}
public void setbrojClenovi(int brojClenovi) {
	this.brojClenovi=brojClenovi;
}
public int compareTo(SportskiKlub obj) {
	SportskiKlub a = (SportskiKlub)obj;
	if (this.ime.equals(a.ime))
		return 0;
	else
		return this.ime.compareTo(a.ime);
}


}
