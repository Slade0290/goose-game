public class JoueurNumeri extends Joueur {
    
    private Pion tab[];
    
    public JoueurNumeri(String nom){
        super(nom);
        this.tab = new Pion[6];
        //initialisé les pions avec les coefs de 1 à 6
    }
}
