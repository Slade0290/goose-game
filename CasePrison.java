public class CasePrison extends Case {
  
  private boolean prisonnier;
  
  public CasePrison(Pion pion){
    super(pion);
    this.prisonnier = true;
  }
  
  public boolean liberer(int resultatDe){
    return resultatDe % 2;
  }
  
  public boolean getPrisonnier(){
    return prisonnier; 
  }
  
  public void setPrisonnier(boolean val){
    this.prisonnier = val;
  }
}
