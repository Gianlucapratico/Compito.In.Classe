
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchivioBibliotecario {

    private List<ElementoCatalogo> catalogo;

    public ArchivioBibliotecario() {
        catalogo = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoCatalogo elemento) {
        catalogo.add(elemento);
    }

    public ElementoCatalogo ricercaPerIsbn(String isbn) {
        return catalogo.stream()
                .filter(e -> e.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    public List<ElementoCatalogo> ricercaPerAnnoPubblicazione(int anno) {
        return catalogo.stream()
                .filter(e -> e.getAnnoPubblicazione() == anno)
                .collect(Collectors.toList());
    }

    public List<Libro> ricercaPerAutore(String autore) {
        return catalogo.stream()
                .filter(e -> e instanceof Libro && ((Libro) e).getAutore().equals(autore))
                .map(e -> (Libro) e)
                .collect(Collectors.toList());
    }

   /* public void salvaSuFile(String nomeFile) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(nomeFile));
        output.writeObject(catalogo);
        output.close();
    }

    public void caricaDaFile(String nomeFile) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(nomeFile));
        catalogo = (List<ElementoCatalogo>) input.readObject();
        input.close();
    }*/
}
