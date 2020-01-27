package zadatak;





public class Osoba {
	
	private int sifra;
	private String ime;
	private float placa;
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public float getPlaca() {
		return placa;
	}
	public void setPlaca(float placa) {
		this.placa = placa;
	}
	public Osoba(int sifra, String ime, float placa) {
		this.sifra = sifra;
		this.ime = ime;
		this.placa = placa;
	}
	public Osoba() {
	
	}
	
	

}
