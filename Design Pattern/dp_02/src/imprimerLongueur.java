public class imprimerLongueur implements Strategy {

    private int longueur;

    public imprimerLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public boolean acceptImprimer(String mot) {
        return mot.length() == longueur;
    }
}
