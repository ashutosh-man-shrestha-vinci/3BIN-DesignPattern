public class Palindrome implements Observer {
    int nbrPalindromes = 0;
    public void update(String ligne) {
        for (String mot : ligne.trim().split(" ")) {

            StringBuffer temp = new StringBuffer(mot);
            if (mot.equals(temp.reverse().toString())) {
                nbrPalindromes++;
            }
        }
    }
    public void resultat() {
        System.out.println("Voici le nombre de palindromes " + nbrPalindromes);
    }
}
