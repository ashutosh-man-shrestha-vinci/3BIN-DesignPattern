import java.io.IOException;
import java.util.ArrayList;

public class main {
  public static void main  (String[] args) throws IOException {
          int longueur = 5;
      ArrayList<Strategy> strategies = new ArrayList<>();
        Strategy commenceParT = new CommenceParT("t");
        Strategy palindrome = new ImprimerPalandrome();
        Strategy  imprimerLongueur = new imprimerLongueur(longueur);
       Strategy and = new AND(commenceParT, palindrome);
       strategies.add(commenceParT);
       strategies.add(palindrome);
       strategies.add(and);
       Strategy et = new ET(strategies);

        ListeMots listeMots = new ListeMots("text.txt",commenceParT);
      System.out.println("La liste de mots commencant par t :");
      listeMots.imprimer();

      ListeMots listeMots1 = new ListeMots("text.txt",imprimerLongueur);
      System.out.println("La liste de mots de longueur :" + longueur);
      listeMots1.imprimer();

      ListeMots listeMots3 = new ListeMots("text.txt",palindrome);
      System.out.println("La liste de palindrome " );
      listeMots3.imprimer();

      ListeMots listeMots4 = new ListeMots("text.txt",and);
      System.out.println("La liste de palindrome et par T  " );
      listeMots4.imprimer();

      ListeMots listeMots5 = new ListeMots("text.txt",et);

      System.out.println("La liste de palindrome et par et"  );
      listeMots5.imprimer();

      Compteur compteur = new Compteur(commenceParT);
      ListeMots listeMots6 = new ListeMots("text.txt",compteur);
      listeMots6.imprimer();
      System.out.println("Le nombre de mots " + compteur.getCompteur()  );




  }
}
