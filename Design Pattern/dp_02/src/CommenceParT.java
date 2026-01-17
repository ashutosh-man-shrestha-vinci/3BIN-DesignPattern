public class CommenceParT implements Strategy {

    String prefixe;

    public CommenceParT(String prefixe) {
        this.prefixe = prefixe;
    }
    @Override
    public boolean acceptImprimer(String mots) {
        return mots.startsWith(prefixe);
    }
}
