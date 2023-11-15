package org.lessons.java;

public class Libro {

    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Libro(String titolo, int numeroPagine, String autore, String editore) throws Exception {

        setTitolo(titolo);
        setNumeroPagine(numeroPagine);
        setAutore(autore);
        setEditore(editore);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws Exception {
    	if (titolo == null || titolo.isEmpty()) {
    		throw new Exception("il libro deve avere un titolo");
    	}

        this.titolo = titolo; 
    }

    public int getNumeroPagine()  {
    
    		
    		
    	
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine)throws Exception {
    	if(numeroPagine <= 0) {
    		throw new Exception("il libro non può avere 0 pagine");
    		}

        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws Exception {
		
		if (autore == null || autore.isEmpty()) {
			
		throw new Exception("il nome dell'autore non può essere vuoto!");
		}
		
		this.autore = autore;
	}

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) throws Exception {
		
	if (editore == null || editore.isEmpty()) {
			
			throw new Exception("il nome dell'editore non può essere vuoto!");
		}
		
	this.editore = editore;
	}

    @Override
    public String toString() {

        return "\n------------------------\n"
                + "Libro\n"
                + "\nTitolo: " + getTitolo() + "\n"
                + "Numero pagine: " + getNumeroPagine() + "\n"
                + "Autore: " + getAutore() + "\n"
                + "Editore: " + getEditore()
                + "\n------------------------\n";
    }
}
