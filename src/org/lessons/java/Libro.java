package org.lessons.java;

public class Libro {

    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Libro(String titolo, int numeroPagine, String autore, String editore) {

        setTitolo(titolo);
        setNumeroPagine(numeroPagine);
        setAutore(autore);
        setEditore(editore);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {

        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {

        this.numeroPagine = numeroPagine;
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
