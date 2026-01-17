import java.io.*;
import java.util.*;

public class ListeMots { // mal foutu
    private String fichier;
    private Strategy strategy;

    public ListeMots(String fichier, Strategy strategy) {
        this.fichier = fichier;
        this.strategy = strategy;
    }

    public void imprimer() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(this.fichier));
        String buffer = null;
        while ((buffer = input.readLine()) != null) {
            StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
            while (mots.hasMoreTokens()) {
                String mot = mots.nextToken();
                if (strategy.acceptImprimer(mot)) {
                    System.out.println(mot);
                }

            }
        }


    }
}
