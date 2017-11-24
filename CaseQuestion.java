public class CaseQuestion extends Case{

  private Question question;
  
  public CaseQuestion(Pion p){
    super(p);
    this.question = questionRandom();
  }
  
  private Question questionRandom(){
    return ; //question aléa de la banque de question
  }
}
