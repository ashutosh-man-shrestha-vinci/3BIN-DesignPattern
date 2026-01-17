import java.util.ArrayList;

public class PaiementbyPaypal implements Paiement {
        private final String password;
    private final String email;


        public PaiementbyPaypal( String password, String email) {
            this.password = password;
            this.email = email;
        }
    @Override
    public void paying(int amount) {

        String encryptedPassword= password.replaceAll(".", "*");
        System.out.println(amount + " euros paid using Paypal / email: " + email+ ", password: "+encryptedPassword);

    }
}
