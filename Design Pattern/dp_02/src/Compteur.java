public class Compteur implements Strategy {

    Strategy strategy;
    private int compteur = 0;

    public Compteur(Strategy strategy ) {
        this.strategy = strategy;
    }

    @Override
    public boolean acceptImprimer(String mots) {
        if(strategy.acceptImprimer(mots)){
            compteur++;
            return true;
        }
        return false;
    }

    public int getCompteur() {
        return compteur;
    }


}
