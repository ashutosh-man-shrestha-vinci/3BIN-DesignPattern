import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
    private Map<String,Produit> bac= new HashMap<>();


    public Produit ajouterProduit(String name, int anneeDeParution, double prix){
         Produit p = creerProduit(name,anneeDeParution,prix);
         bac.put(name,p);
        return p;

    }

    public Produit retourneProduit(String  name){
        return bac.get(name);
    }


    public abstract Produit  creerProduit(String name,int anneeDeParution, double prix);

}
