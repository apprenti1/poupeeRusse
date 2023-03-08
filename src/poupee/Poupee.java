package poupee;

public class Poupee {
    private int taille = 1;
    private Poupee poupeeEnfante;
    private Poupee poupeeParante;
    private boolean opened = false;


    public Poupee(int taille){
        if (taille>0) {
            this.taille = taille;
        }
    }
    public boolean ouvrir(){
        if (poupeeParante == null){
            this.opened = true;
            return true;
        } else if (poupeeParante.opened) {
            this.opened = true;
            return true;
        } else {
            return false;
        }
    }
    public boolean fermer(){
        if (poupeeEnfante == null){
            this.opened = false;
            return true;
        } else if (!poupeeEnfante.opened) {
            this.opened = false;
            return true;
        } else {
            return false;
        }
    }
    public boolean placerDans(Poupee p){
        if (this.opened == false && this.poupeeParante == null && p.opened && p.poupeeEnfante == null && this.taille < p.taille){
            this.poupeeParante = p;
            p.poupeeEnfante = this;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean sortirDe(Poupee p){
        if (this.opened == false && this.poupeeParante == p && p.opened){
            this.poupeeParante = null;
            p.poupeeEnfante = null;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOpened() {return opened;}
}
