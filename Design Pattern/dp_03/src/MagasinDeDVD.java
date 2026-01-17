import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin{

    @Override
    public Produit creerProduit(String name, int anneeDeParution, double prix) {
        return new DVD(name,anneeDeParution);
    }
}
