public class Belgique  extends Observer{

    int nbrBelgique = 0;
    @Override
    public void update(String ligne ) {
        if (ligne.contains("Belgique")) {
            nbrBelgique++;
        }
    }

    @Override
    public void resultat() {
        System.out.println("Nombre Belgique  : "+nbrBelgique);
    }
}
