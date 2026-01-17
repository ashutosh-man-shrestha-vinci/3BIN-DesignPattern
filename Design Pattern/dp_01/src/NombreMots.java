public class NombreMots implements Observer {
    int nombremots = 0;
    @Override
    public void update(String ligne) {
        for (String mot : ligne.trim().split(" ")) {
            nombremots++;
        }
    }

    public void resultat() {
        System.out.println("Voici le nombre de nombreMots " + nombremots);
    }
}
