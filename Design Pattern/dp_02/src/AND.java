public class AND implements Strategy{
    Strategy s1;
    Strategy s2;
    public AND(Strategy s1,Strategy s2){
        this.s1=s1;
        this.s2=s2;
    }

    @Override
    public boolean acceptImprimer(String mots) {
        return s1.acceptImprimer(mots) && s2.acceptImprimer(mots);
    }
}
