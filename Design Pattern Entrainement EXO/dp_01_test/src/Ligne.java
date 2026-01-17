public class Ligne extends Observer{

    int nbLigne= 0;
    @Override
    public void update(String ligne) {
        nbLigne++;
    }

    @Override
    public void resultat() {
        System.out.println("Voici le nombre de ligne : " + nbLigne);
    }
}
