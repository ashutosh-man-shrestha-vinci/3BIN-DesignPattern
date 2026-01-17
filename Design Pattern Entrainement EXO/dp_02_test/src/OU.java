import java.util.ArrayList;

public class OU implements Strategy {
    ArrayList<Strategy> strategies;


    public OU(ArrayList<Strategy> strategies) {
        this.strategies = strategies;
    }
    @Override
    public boolean execute(String mot) {
        for (Strategy strategy : strategies) {
            if (strategy.execute(mot))
                return true;
        }
        return false;
    }
}
