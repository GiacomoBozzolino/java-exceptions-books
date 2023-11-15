package org.lessons.java;

public class Libro {
	
	private String titolo;
	private String autore;
	private String editore;
	private int pagine;
	
	public Libro (String titolo, String autore, String editore, int pagine) {
		setTitolo(titolo);
		setAutore(autore);
		setEditore(editore);
		setPagine(pagine);
		
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Libro:\n"
				+ "titolo: " + getTitolo() + "\n"
				+ "autore: "+ getAutore() + "\n"
				+ "editore: "+ getEditore() + "\n"
				+ "numero pagine: "+ getPagine();
	}
	
	
	
	
	

}
