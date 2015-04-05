package locadora;

import java.util.Calendar;

public class Item {
	
	private int id;
	private Midia midia;
	private Calendar diaEntregue;
	private Calendar diaPrevisto;
	
	public Item(){
		
	}
	
	public Item(int id, Midia midia, Calendar diaEntregue, Calendar diaPrevisto) {
		this.id = id;
		this.midia = midia;
		this.diaEntregue = diaEntregue;
		this.diaPrevisto = diaPrevisto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public Calendar getDiaEntregue() {
		return diaEntregue;
	}

	public void setDiaEntregue(Calendar diaEntregue) {
		this.diaEntregue = diaEntregue;
	}

	public Calendar getDiaPrevisto() {
		return diaPrevisto;
	}

	public void setDiaPrevisto(Calendar diaPrevisto) {
		this.diaPrevisto = diaPrevisto;
	}



	
}
