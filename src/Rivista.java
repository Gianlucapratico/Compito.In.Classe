
public class Rivista extends ElementoCatalogo {
    private String periodicità;

    public Rivista() {
    }

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numPagine, String periodicità) {
        super(isbn, titolo, annoPubblicazione, numPagine);
        this.periodicità = periodicità;
    }

    public String getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(String periodicità) {
        this.periodicità = periodicità;
    }
}