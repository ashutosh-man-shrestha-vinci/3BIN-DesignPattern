

public class SimpleAlbum {
    private final String nom;
    private final String artiste;
    private final String label;
    private final String pays;
    private final String version;
    private final String genre;
    private final int annee;
    private final int debitStandard;
    private final int debitAbonne;

    private SimpleAlbum(AlbumBuilder builder) {
        this.nom = builder.nom;
        this.artiste = builder.artiste;
        this.label = builder.label;
        this.pays = builder.pays;
        this.version = builder.version;
        this.genre = builder.genre;
        this.annee = builder.annee;
        this.debitStandard = builder.debitStandard;
        this.debitAbonne = builder.debitAbonne;
    }

    public String getNom() {
        return nom;
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

    public String getVersion() {
        return version;
    }

    public String getGenre() {
        return genre;
    }

    public int getAnnee() {
        return annee;
    }

    public int getDebitStandard() {
        return debitStandard;
    }

    public int getDebitAbonne() {
        return debitAbonne;
    }

    public static class AlbumBuilder {
        private final String nom;
        private final String artiste;
        private String label;
        private String pays;
        private String version;
        private String genre;
        private int annee;
        private int debitStandard;
        private int debitAbonne;

        public AlbumBuilder(String nom, String artiste) {
            this.nom = nom;
            this.artiste = artiste;
        }

        public AlbumBuilder label(String label) {
            this.label = label;
            return this;
        }

        public AlbumBuilder pays(String pays) {
            this.pays = pays;
            return this;
        }

        public AlbumBuilder version(String version) {
            this.version = version;
            return this;
        }

        public AlbumBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public AlbumBuilder annee(int annee) {
            this.annee = annee;
            return this;
        }

        public AlbumBuilder debitStandard(int debitStandard) {
            this.debitStandard = debitStandard;
            return this;
        }

        public AlbumBuilder debitAbonne(int debitAbonne) {
            this.debitAbonne = debitAbonne;
            return this;
        }

        public SimpleAlbum build() {
            return new SimpleAlbum(this);
        }
    }

    @Override
    public String toString() {
        return "SimpleAlbum{" +
                "nom='" + nom + '\'' +
                ", artiste='" + artiste + '\'' +
                ", label='" + label + '\'' +
                ", pays='" + pays + '\'' +
                ", version='" + version + '\'' +
                ", genre='" + genre + '\'' +
                ", annee=" + annee +
                ", debitStandard=" + debitStandard +
                ", debitAbonne=" + debitAbonne +
                '}';
    }
}