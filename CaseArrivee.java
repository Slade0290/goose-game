
public class CaseArrivee extends Case {

	public CaseArrivee(int type) {
		super(type);
	}
	
	public CaseArrivee(int type, Pion pion) {
		super(type,pion);
	}
	
	public boolean finDuJeu() {
		return estVide();
	}

}
