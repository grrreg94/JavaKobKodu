package pl.pierwszyProjekt.bazaKotow.model;

import java.util.Date;

public class Kot {
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getImieOpiekuna() {
		return imieOpiekuna;
	}

	public void setImieOpiekuna(String imieOpiekuna) {
		this.imieOpiekuna = imieOpiekuna;
	}

	public float getWaga() {
		return waga;
	}

	public void setWaga(float waga) {
		this.waga = waga;
	}

	public Date getWiek() {
		return wiek;
	}

	public void setWiek(Date wiek) {
		this.wiek = wiek;
	}
	
	
	private String imie;
	private String imieOpiekuna;
	private float  waga;
	public Date wiek;
	
	public Kot() {};
	
	public Kot(String imie, String imieOpiekuna, float waga, Date wiek)
	{
		this();
		this.imie = imie;
		this.imieOpiekuna = imieOpiekuna;
		this.waga=waga;
		this.wiek=wiek;
	}
	public String przedstawSie()
	{
		return imie + " " + wiek + " " + waga+ " " + imieOpiekuna;
	}

}

