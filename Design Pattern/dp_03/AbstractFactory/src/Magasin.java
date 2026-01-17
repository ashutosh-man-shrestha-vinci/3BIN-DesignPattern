import java.util.HashMap;
import java.util.Map;

public  class Magasin {
    private Map<String,Produit> bac= new HashMap<>();
     Factory factory;


      public Magasin(Factory factory){
          this.factory = factory;
      }
    public Produit ajouterProduit(String name, int anneeDeParution ){
         Produit p = factory.creerProduit(name,anneeDeParution);
         bac.put(name,p);
        return p;

    }

    public Produit retourneProduit(String  name){
        return bac.get(name);
    }



}
