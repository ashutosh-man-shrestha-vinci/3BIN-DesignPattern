import java.util.ArrayList;

public class ET implements Strategy{

    ArrayList<Strategy> strategies = new ArrayList<>();

    public ET(ArrayList<Strategy> strategies) {
        this.strategies = strategies;
    }
    @Override
    public boolean acceptImprimer(String mots) {
        for (Strategy strategy : strategies) {
            if(!strategy.acceptImprimer(mots)){
                return  false;
            }

        }
        return true;
    }
}
