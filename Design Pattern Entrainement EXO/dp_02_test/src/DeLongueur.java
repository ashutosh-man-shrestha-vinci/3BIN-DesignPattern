public class DeLongueur implements Strategy{

        private int longueur;

    public DeLongueur(int longueur) {
        this.longueur = longueur;
    }
    @Override
    public boolean execute(String mot ) {
        return (mot.length() == longueur);

    }
}
