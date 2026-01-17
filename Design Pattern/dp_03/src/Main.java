public class Main {
    public static void main(String[] args) {

        Magasin magasinLivre = new MagasinDeLivre();
        magasinLivre.ajouterProduit("Dune", 1965, 0);
        magasinLivre.ajouterProduit("1984", 1949, 0);

        Magasin magasinDVD = new MagasinDeDVD();
        magasinDVD.ajouterProduit("Inception", 2010, 0);
        magasinDVD.ajouterProduit("Interstellar", 2014, 0);
    }
}
