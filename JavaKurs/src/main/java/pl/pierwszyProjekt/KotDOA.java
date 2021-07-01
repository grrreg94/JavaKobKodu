package pl.pierwszyProjekt;


import java.util.ArrayList;
import java.util.List;


import pl.pierwszyProjekt.KotDOA;
import pl.pierwszyProjekt.bazaKotow.model.Kot;



public class KotDOA {
	
	static List<Kot> lk = new ArrayList<Kot>();
	
	public void dodajKota(Kot kt)
	{
		lk.add(kt);
	}
	public void wypiszKota(int nr)
	{
		System.out.println(lk.get(nr).przedstawSie());
	}


	
}
