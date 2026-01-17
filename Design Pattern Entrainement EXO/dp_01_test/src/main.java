import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        AnalyseurDeTexte analyseur = new AnalyseurDeTexte();
        Observer belge = new Belgique();
        Observer ligne  = new Ligne();

        analyseur.RegisterObserver(belge);
        analyseur.RegisterObserver(ligne);

        analyseur.analyser("text.txt");
    }
}
