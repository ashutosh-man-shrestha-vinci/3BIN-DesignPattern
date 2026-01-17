public class NombreLigne implements Observer {
    int nombreLigne = 0;
    @Override
    public void update(String ligne) {
            nombreLigne++;
    }

    public void resultat() {
        System.out.println("Voici le nombre de nobmreLigne " + nombreLigne);
    }
}
