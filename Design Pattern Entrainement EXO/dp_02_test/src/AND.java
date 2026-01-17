public class AND implements  Strategy {
    Strategy str1;
    Strategy str2;

    public AND(Strategy str1, Strategy str2) {
        this.str1 = str1;
        this.str2 = str2;
    }


    @Override
    public boolean execute(String mot) {
        return str1.execute(mot) && str2.execute(mot);
    }

}
