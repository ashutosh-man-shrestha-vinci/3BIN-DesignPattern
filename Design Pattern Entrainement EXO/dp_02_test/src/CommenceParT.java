public class CommenceParT implements Strategy{
        private String prefixe;


      public  CommenceParT(String prefixe){
          this.prefixe = prefixe;
      }
    @Override
    public boolean execute(String mot) {
    return  mot.startsWith(prefixe);

    }
}

