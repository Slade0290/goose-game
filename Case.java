
public class Case {
	
	private static int QUESTION = 0;
	private static int SAUT = 1;
	private static int PRISON = 2;
	private static int LIBERATION = 3;
	private static int REJOUER = 4;
	private static int NORMAL = 5;
	private int type;
	private Pion pion;
	
	public Case(int type) {
		this.type = type;
	}
	
	public Case(int type, Pion pion) {
		this.type = type;
		this.pion = pion;
	}
	
	public Pion getPion() {
		return pion;
	}
	
	public boolean estVide() {
		return (pion == null);
	}
	
	public void remplirCase(Pion pion) {
		this.pion = pion;
	}
	
	public void enleverPion() {
		pion = null;
	}
	
}

}