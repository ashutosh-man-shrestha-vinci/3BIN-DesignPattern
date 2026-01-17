import java.util.ArrayList;

public class ET implements Strategy {
    ArrayList<Strategy> strategies;


    public ET(ArrayList<Strategy> strategies) {
         this.strategies = strategies;
    }
    @Override
    public boolean execute(String mot) {
        for (Strategy strategy : strategies) {
            if (!strategy.execute(mot))
                return false;
        }
      return true;
        }
}
