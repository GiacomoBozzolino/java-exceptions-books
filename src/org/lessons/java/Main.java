package org.lessons.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final File myFile = new File("./my-file.txt");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Quanti libri vuoi inserire? ");
        int BOOK_COUNT = Integer.parseInt(in.nextLine());

        Libro[] books = new Libro[BOOK_COUNT];
        int booksIndex = 0;

        while (booksIndex < BOOK_COUNT) {

            System.out.println("\nLibro " + (booksIndex + 1));
            System.out.print("Inserisci il titolo: ");
            String strTitolo = in.nextLine();

            System.out.print("Inserisci il numero di pagine: ");
            int numeroPagine = Integer.parseInt(in.nextLine());

            System.out.print("Inserisci il nome dell'autore: ");
            String strAutore = in.nextLine();

            System.out.print("Inserisci il nome dell'editore: ");
            String strEditore = in.nextLine();

            Libro b= null;
			try {
				b = new Libro(strTitolo, numeroPagine, strAutore, strEditore);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("\nError in book: " + e.getMessage());
			}
            books[booksIndex++] = b;
        }

        in.close();

       // scrittura su file
        
FileWriter myWriter = null;
		
		try {
			
			myWriter = new FileWriter(myFile);
			
			for (int i = 0; i < books.length; i++) {
				
				Libro b = books[i];
				
				myWriter.write("Libro " + (i+1) + "\n"
						+ "\nTitolo: " + b.getTitolo() + "\n"
						+ "Numero pagine: " + b.getNumeroPagine() + "\n"
						+ "Autore: " + b.getAutore() + "\n"
						+ "Editore: " + b.getEditore()
						+ "\n-----------------------------\n"
						);
			}
			
		} catch (IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
			
		} finally {
			
			if (myWriter != null) {
				try {
					myWriter.close();
				} catch (IOException e) { }
			}
		}
		
		
        
    }
}

