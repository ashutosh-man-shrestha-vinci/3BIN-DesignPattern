import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre  extends Magasin {

    @Override
    public Produit creerProduit(String name, int anneeDeParution, double prix) {
        return new Livre(name,anneeDeParution);
    }


}
