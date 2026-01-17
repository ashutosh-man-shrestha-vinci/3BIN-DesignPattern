public class MachineACafe {

    public enum State{
        IDLE{
          @Override
          public void selectionnerBoisson(MachineACafe m , ToucheBoisson toucheBoisson) {
              m.afficherPasAssez(toucheBoisson);
          }
            public void rendreMonnaie(MachineACafe m){
               m.setState(State.IDLE);
            }
        },
        COLLECT{
            @Override
            public void selectionnerBoisson(MachineACafe m , ToucheBoisson toucheBoisson) {
                if (toucheBoisson.getPrix() > m.montantEnCours) {
                    m.boisson = toucheBoisson;
                    m.afficherPasAssez(toucheBoisson);
                    m.boisson = toucheBoisson;
                    m.setState(State.PAS_ASSEZ);
                    return;
                }
                m.montantEnCours -= toucheBoisson.getPrix();
                m.afficherBoisson(toucheBoisson);
                m.afficherMontant();
                if(m.montantEnCours ==0) {
                     m.setState(State.IDLE);
                } else{
                    m.setState(State.COLLECT);

                }
            }



        },
        PAS_ASSEZ{
            @Override
            public void selectionnerBoisson(MachineACafe m , ToucheBoisson toucheBoisson) {
                throw new IllegalStateException();

            }
            public void entrerMonnaie(MachineACafe m , Piece piece) {
                m.montantEnCours += piece.getValeur();
                m.afficherMontant();
                if (  m.boisson.getPrix() >   m.montantEnCours) {
                    m.afficherPasAssez(  m.boisson);
                } else {
                    m.montantEnCours -=   m.boisson.getPrix();
                    m.afficherBoisson(  m.boisson);
                    m.boisson = null;
                    m.afficherMontant();
                    if (  m.montantEnCours == 0)
                        m.setState(State.IDLE);
                    else
                        m.setState(State.COLLECT);
                }
            }

        };

        public void entrerMonnaie(MachineACafe machine, Piece piece){
            machine.montantEnCours += piece.getValeur();
            machine.afficherMontant();
            machine.setState(State.COLLECT);
        };
        public abstract void selectionnerBoisson(MachineACafe m, ToucheBoisson toucheBoisson);
        public void rendreMonnaie(MachineACafe machine){
            machine.afficherRetour();
            machine.montantEnCours = 0;
            machine.boisson = null;
            machine.setState(State.IDLE);
        };

    }

    private int montantEnCours = 0;
    private State etatCourant = State.IDLE;
    private ToucheBoisson boisson = null;


     public void setState(State state) {
         this.etatCourant=state;
     }
    public void afficherMontant() {
        System.out.println(montantEnCours + " cents disponibles");
    }

    public void afficherRetour() {
        System.out.println(montantEnCours + " cents rendus");
    }

    public void afficherPasAssez(ToucheBoisson toucheBoisson) {
        System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
        System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
    }

    public void afficherBoisson(ToucheBoisson toucheBoisson) {
        System.out.println("Voici un " + toucheBoisson);

    }

    public void entrerMonnaie(Piece piece) {
      this.etatCourant.entrerMonnaie(this,piece);
    }

    public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
        this.etatCourant.selectionnerBoisson(this,toucheBoisson);

    }

    public void rendreMonnaie() {
        this.etatCourant.rendreMonnaie(this);

    }
}
