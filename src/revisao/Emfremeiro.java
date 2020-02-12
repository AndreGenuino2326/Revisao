
package revisao;



public class Emfremeiro extends Funcionario{
    private String coren;
    
    
    public void setsenha (String coren){
    this.coren=  coren;   
   }
  public String getsenha(String coren){
    return coren ;
        
}
    @Override
  public String toString() {
    return "Coren: "+coren+"\n";
  }
}
