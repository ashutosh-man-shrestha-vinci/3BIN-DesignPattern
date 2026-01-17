public class ImprimerPalandrome implements Strategy{

    @Override
    public boolean acceptImprimer(String mots) {
        if (mots == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mots);
        return mots.equals(stringbuffer.reverse().toString());

    }
}
