package pl.pierwszyProjekt;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pl.pierwszyProjekt.bazaKotow.model.Kot;

public class Interfejs {
	

	static Scanner sc = new Scanner(System.in);
	
	

		public static void main(String[] args) {
			Pattern dataPattern = Pattern.compile("[0-9]{4}\\.[0-9]{2}\\.[0-9]{2}"); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			sdf.setLenient(false);
			KotDOA kot = new KotDOA();
			for(int i = 0; i<=1; i++)
			{
			
			Kot kt = new Kot();

			
			
			do
			{
				System.out.println("Podaj date urodzenia yyyy.mm.dd ");
				String st = Interfejs.getUser();
				Matcher maczer = dataPattern.matcher(st);
				if(maczer.matches())
				{
					try {
						kt.setWiek(sdf.parse(st));
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
				
			}while(kt.wiek == null);



			System.out.println("Podaj imie kotka ");
			kt.setImie(Interfejs.getUser());
			System.out.println("Podaj imie wlasciciela ");
			kt.setImieOpiekuna(Interfejs.getUser());
			System.out.println("Podaj Wage ");
			kt.setWaga(Interfejs.getFloat());		
			kot.dodajKota(kt);
			
		}
			
			kot.wypiszKota(1);

	
		}
	
	
	public static String getUser()
	{
		return sc.nextLine();
	}
	public static float getFloat()
	{
		return sc.nextFloat();
	}
	

}
