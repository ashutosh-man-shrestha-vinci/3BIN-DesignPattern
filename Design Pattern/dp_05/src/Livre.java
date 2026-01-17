public class   Livre{


    private final String artiste;
    private final String label;
    private final String pays;


    public Livre(Builder builder){
        this.artiste = builder.artiste;
        this.label = builder.label;
        this.pays = builder.pays;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getLabel() {
        return label;
    }

    public String getPays() {
        return pays;
    }

    public static class Builder{
        private final String artiste;
        private final String label;
        private  String pays;


        public Builder(String artiste, String label){
            this.artiste = artiste;
            this.label = label;
        }

        public Builder pays(String pays) {
            this.pays = pays;
            return this;
        }

        public Livre build() {
            return new Livre(this);
        }
    }

    @Override
    public String toString() {
        return "Livre{" +
                "artiste='" + artiste + '\'' +
                ", label='" + label + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}