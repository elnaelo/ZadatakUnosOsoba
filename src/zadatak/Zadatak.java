package zadatak;

//Kreirajte klasu Osoba s svojstvima sifra int, ime String i placa float
//Program unosi 10 osoba
//Program osigurava da se svi podaci moraju unijeti
//program ispisuje sumu plaća svih osoba

import javax.swing.JOptionPane;

public class Zadatak {

	public Zadatak(){
		Osoba osobe[]=new Osoba[10];
		
		for(int i=0; i<10;i++) {
			osobe[i]=unosOsobe(i+1);
		}
		JOptionPane.showConfirmDialog(null, sumaPlaca(osobe));
		
	}
	
	
	
	private float sumaPlaca(Osoba[] osobe) {
		float suma=0;
		for (Osoba osoba: osobe) {
			suma=suma+osoba.getPlaca();
		}
		return suma;
	}



	private Osoba unosOsobe(int i) {
		return new Osoba(unosSifra("Unesi sifru" + i), unosImena("unesi ime" + i), unosPlace("unesi placu" + i));
	}

	

	private float unosPlace(String string) {
		for(;;) {
			try {	
				return Float.parseFloat(JOptionPane.showInputDialog(string));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Morate unijeti placu float!");
				
			}
			
		}
		
	}



	private String unosImena(String string) {
		String string2;
		for(;;) {
			try {
				string2=JOptionPane.showInputDialog(string);
				if(string2.length()>0) {
						return string2;
						}
				
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Morate unijeti ime string!");
			}
		}
	
	}



	private int unosSifra(String string) {
		for(;;) {
			try {	
				return Integer.parseInt(JOptionPane.showInputDialog(string));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Morate unijeti sifru int!");
				
			}
			
		}
	
	}



	public static void main(String[] args) {
		
		new Zadatak();
		
	}
	
}
 