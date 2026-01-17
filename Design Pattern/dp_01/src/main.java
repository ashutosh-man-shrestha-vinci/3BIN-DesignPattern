import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        AnalyseurDeTexte analyseur = new AnalyseurDeTexte();
        Observer nbrBelgique = new NombreBelgique();
        Observer palindrome = new Palindrome();
        Observer nbrmots = new NombreMots();
        Observer nbrligne = new NombreLigne();

        analyseur.addObserver(nbrBelgique);
        analyseur.addObserver(nbrmots);
        analyseur.addObserver(nbrligne);
        analyseur.addObserver(palindrome);

        analyseur.anaylser("x.txt");
    }
}
