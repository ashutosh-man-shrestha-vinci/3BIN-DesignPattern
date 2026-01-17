public class FactoryLivre implements Factory {

    @Override
    public Produit creerProduit(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
