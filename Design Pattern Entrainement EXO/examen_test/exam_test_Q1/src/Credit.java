public class Credit implements  Strategy{
   private final String cardNumber;
   private final String name;
   private final String expiryDate;

    public Credit(String cardNumber, String name, String expiryDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public void paywith(int amount) {
        String encryptedCardNumber= cardNumber.replaceAll(".", "*");
        System.out.println(amount +
                " euros paid using CreditCard / name: " + name+
                ", card number: "+encryptedCardNumber+ " (expiration date: "+expiryDate+")");
    }
}
