import java.util.Date;

public class PaiementByCart implements Paiement{
        String cardNumber;
        String name;
        int expireDate;
        public PaiementByCart(String cardNumber, String name, int expireDate) {
         this.cardNumber = cardNumber;
         this.name = name;
         this.expireDate = expireDate;
        }
    @Override
    public void paying(int amount) {

        String encryptedCardNumber= cardNumber.replaceAll(".", "*");
        System.out.println(amount + " euros paid using CreditCard / name: " + name+ ", card number: "+encryptedCardNumber+ " (expiration date: "+expireDate+")");

    }
}
