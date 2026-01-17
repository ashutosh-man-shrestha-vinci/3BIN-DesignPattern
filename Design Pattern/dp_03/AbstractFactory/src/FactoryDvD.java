public class FactoryDvD implements Factory {

    @Override
    public Produit creerProduit(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
