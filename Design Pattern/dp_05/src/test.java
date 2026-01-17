
public class test {

   public static void main(String[] args) {
        SimpleAlbum.AlbumBuilder b = new SimpleAlbum.AlbumBuilder("Ashu","L'artiste ").annee(2012).genre("HipTrust");

        SimpleAlbum album = b.build();
       System.out.println(album);




   }
}
