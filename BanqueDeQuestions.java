import java.util.LinkedList;

public class BanqueDeQuestions {
	
	private LinkedList<Question> listeDeQuestions;
	
	public BanqueDeQuestions() {
		listeDeQuestions = new LinkedList<Question>();
	}
	
	public LinkedList<Question> getListeDeQuestions(){
		return listeDeQuestions;
	}
	
	public void ajouter(Question q) {
		listeDeQuestions.add(q);
	}
	
	public void supprimer(int position) {
		listeDeQuestions.remove(position);
	}
	
	public void getAllQuestion() {
		for(int i = 0; i < listeDeQuestions.size(); i++) {
			listeDeQuestions.get(i).afficherQuestion();
		}
	}
	
	public void getQuestion(int position) {
		listeDeQuestions.get(position);
	}
	
	
}gzgzgz
