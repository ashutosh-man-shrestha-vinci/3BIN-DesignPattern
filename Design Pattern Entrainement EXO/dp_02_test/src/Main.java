//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
           ArrayList<Strategy> strategies = new ArrayList<>();
           strategies.add(new CommenceParT("t"));
       strategies.add(new DeLongueur(4));



    ListerMots listerMots = new ListerMots("text.txt",new CommenceParT("t"));
    System.out.println("La liste de mots commencant par t :");
    listerMots.imprimer();

    ListerMots listerMots1 = new ListerMots("text.txt",new DeLongueur(4));
    System.out.println("La liste de mots commencant par listeMots1 :");
    listerMots1.imprimer();

    ListerMots listerMots2 = new ListerMots("text.txt",new OR(new CommenceParT("t"),new DeLongueur(4)));
    System.out.println("La liste de mots commencant par listeMots2:");
    listerMots2.imprimer();

    ListerMots listerMots3 = new ListerMots("text.txt",new ET(strategies));
    System.out.println("La liste de mots commencant par listeMots3 :");
    listerMots3.imprimer();
    ListerMots listerMots4 = new ListerMots("text.txt",new OU(strategies));
    System.out.println("La liste de mots commencant par listeMots4 :");

    listerMots4.imprimer();
    Strategy commenceT = new  CommenceParT("t");
    Compteur compteur = new Compteur(commenceT);
    ListerMots listerMots5 = new ListerMots("text.txt",compteur);

    System.out.println("La compteur commencant par t :");
    listerMots5.imprimer();
    System.out.println("La compteur commencant par listeMots5 :" + compteur.compteur);
}
