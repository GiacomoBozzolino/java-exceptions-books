package org.lessons.java;

import java.io.File;
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

        for (int booksIndex = 0; booksIndex < BOOK_COUNT; booksIndex++) {
            System.out.println("\nLibro " + (booksIndex + 1));
            System.out.print("Inserisci il titolo: ");
            String strTitolo = in.nextLine();

            System.out.print("Inserisci il numero di pagine: ");
            int numeroPagine = Integer.parseInt(in.nextLine());

            System.out.print("Inserisci il nome dell'autore: ");
            String strAutore = in.nextLine();

            System.out.print("Inserisci il nome dell'editore: ");
            String strEditore = in.nextLine();

            Libro l = null;
            try {
               l = new Libro(strTitolo, numeroPagine, strAutore, strEditore);
                books[booksIndex] = l;
            } catch (Exception e) {
                System.out.println("\nError in book: " + e.getMessage());
                booksIndex--; // Se c'è un errore, decrementa l'indice per reinserire i dati corretti
            }
        }

        in.close();

        // Scrittura su file
        try (FileWriter myWriter = new FileWriter(myFile)) {
            for (int i = 0; i < BOOK_COUNT; i++) {
                Libro b = books[i];
                myWriter.write("Libro " + (i + 1) + "\n"
                        + "\nTitolo: " + b.getTitolo() + "\n"
                        + "Numero pagine: " + b.getNumeroPagine() + "\n"
                        + "Autore: " + b.getAutore() + "\n"
                        + "Editore: " + b.getEditore()
                        + "\n\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Lettura da file e stampa a console
        try (Scanner reader = new Scanner(myFile)) {
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
