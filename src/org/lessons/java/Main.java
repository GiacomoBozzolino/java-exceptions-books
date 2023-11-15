package org.lessons.java;

import java.util.Scanner;

public class Main {

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

            Libro b = new Libro(strTitolo, numeroPagine, strAutore, strEditore);
            books[booksIndex++] = b;
        }

        in.close();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
