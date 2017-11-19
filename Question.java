
public class Question {

	private String question;
	private int reponse;
	private final int score;
	
	public Question(String question, int reponse, int score) {
		this.question = question;
		this.reponse = reponse;
		this.score = score;
	}
	
	public boolean estCorrect(int reponseDonnee) {
		return (reponse == reponseDonnee);
	}
	
	public void afficherQuestion() {
		System.out.println(question);
	}
	
	public void afficherReponse() {
		System.out.println(reponse);
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public int getReponse() {
		return reponse;
	}
	
	public void setReponse(int reponse) {
		this.reponse = reponse;
	}
	
	public int getScore() {
		return score;
	}
	
}
