public class NombreBelgique implements Observer {
    int nbrBelgique = 0;
    @Override
    public void update(String ligne) {
        if (ligne.contains("Belgique")) {
            nbrBelgique++;
        }
    }

    public void resultat() {
        System.out.println("Voici le nombre de nbrBelgique " + nbrBelgique);
    }
}
