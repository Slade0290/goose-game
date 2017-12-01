public class CaseSaut extends Case{
  
  private int destination;
  
  public CaseSaut(Pion p, int d){
    super(p);
    this.destination = d;
  }
  
  public CaseSaut(){
    this.destination = rand.nextInt(à partir de la position de la case jusqu'a taille du tableau - position actuelle); 
  }
  
}
