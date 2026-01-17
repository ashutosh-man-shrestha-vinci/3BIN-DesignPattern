public class Compteur implements Strategy {
  int compteur = 0;
  Strategy strategy;
  public Compteur(Strategy strategy) {
      this.strategy = strategy;
  }
    @Override
    public boolean execute(String mot) {
        if(strategy.execute(mot)) {
            compteur++;
            return true;
        }
        return false;
    }

    public int Compteur(){
        return compteur;
    }
}
