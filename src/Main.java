
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creazione dell'archivio bibliotecario
        ArchivioBibliotecario archivio = new ArchivioBibliotecario();

        // Aggiunta di alcuni elementi
        Libro l1 = new Libro("9788804708518", "Il nome della rosa", 1980, 550, "Umberto Eco", "Giallo storico");
        Rivista r1 = new Rivista("9788833571887", "Le Scienze", 2021, 100, "mensile");
        Libro l2 = new Libro("9788804726321", "Il pendolo di Foucault", 1988, 700, "Umberto Eco", "Romanzo");

        archivio.aggiungiElemento(l1);
        archivio.aggiungiElemento(r1);
        archivio.aggiungiElemento(l2);

        // Ricerca per ISBN
        ElementoCatalogo elemento = archivio.ricercaPerIsbn("9788804708518");
        if (elemento != null) {
            System.out.println("Elemento trovato: " + elemento.getTitolo());
        } else {
            System.out.println("Elemento non trovato");
        }

        // Ricerca per anno di pubblicazione
        List<ElementoCatalogo> elementiPerAnno = archivio.ricercaPerAnnoPubblicazione(1980);
        System.out.println("Elementi trovati per anno di pubblicazione:");
        for (ElementoCatalogo e : elementiPerAnno) {
            System.out.println("- " + e.getTitolo());
        }

        // Ricerca per autore (solo libri)
        List<Libro> libriPerAutore = archivio.ricercaPerAutore("Umberto Eco");
        System.out.println("Libri trovati per autore:");
        for (Libro l : libriPerAutore) {
            System.out.println("- " + l.getTitolo());
        }

        // Salvataggio su file
       /* try {
            archivio.salvaSuFile("archivio.dat");
            System.out.println("Archivio salvato su file");
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio su file: " + e.getMessage());
        }

        // Caricamento da file
        try {
            archivio.caricaDaFile("archivio.dat");
            System.out.println("Archivio caricato da file");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Errore durante il caricamento da file: " + e.getMessage());
    }*/
        }
}
