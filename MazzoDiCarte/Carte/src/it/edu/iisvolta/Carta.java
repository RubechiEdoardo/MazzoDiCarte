package it.edu.iisvolta;

public class Carta {
			
	private int valore;
	private String seme;
	private boolean estratta;
	
	public Carta(int valore, String seme) {
		super();
		this.valore = valore;
		this.seme = seme;
		estratta = false;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}
	//getter
	public boolean isEstratta() {
		return estratta;
	}
	//setter
	public void setEstratta(boolean estratta) {
		this.estratta = estratta;
	}
	
	
	
}
