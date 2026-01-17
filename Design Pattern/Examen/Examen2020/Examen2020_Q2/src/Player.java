
import java.util.ArrayList;
import java.util.List;

public class Player {
    private Mode etat;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
     public enum Mode{
         READY{
             @Override
             public String onPlay(Player p){
                 String action = p.startPlayback();
                  p.setEtat(Mode.PLAYING);
                  return action;
             }

             @Override
             public String onLock(Player p) {
                 p.setEtat(Mode.LOCKED);
                 return "Locked...";
             }


         },
         PLAYING{
             @Override
             public String onPlay(Player p){
                p.setEtat(Mode.READY);
                return "Pauses....";
             }

             @Override
             public String onLock(Player p) {
                 p.setEtat(Mode.LOCKED);
                 p.setCurrentTrackAfterStop();
                 return "Stop playing";
             }
             @Override
             public String onNext(Player p) {
                 return p.nextTrack();
             }

             @Override
             public String onPrevious(Player p) {
                 return p.previousTrack();

             }
         },
         LOCKED {
             @Override

             public String onPlay(Player p) {
                 p.setEtat(Mode.READY);
                 return "Ready";
             }

             @Override
             public String onLock(Player p) {
                 return "Locked...";
             }


         };

         public String onPlay(Player player){
             throw new RuntimeException();
         }

         public String onLock(Player player){
             throw new RuntimeException();
         }

         public String onNext(Player player) {
             return "Locked...";
         }

         public String onPrevious(Player player) {
             return "Locked...";
         }


     }

    public void setEtat(Mode etat) {
        this.etat = etat;
    }

    public Player() {
        this.etat = Mode.READY;
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }
    }


    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }
        return "Playing " + playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

    public String onPlay() {
        return etat.onPlay(this);
    }

    public String onLock() {
        return etat.onLock(this);
    }

    public String onNext() {
        return etat.onNext(this);
    }

    public String onPrevious() {
        return etat.onPrevious(this);
    }
}



