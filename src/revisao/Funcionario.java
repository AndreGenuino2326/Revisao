
package revisao;

public class Funcionario extends Pessoa {
    private int matricula;
    private String senha;
    
    
    public void setmatricula (int matricula) {
    this.matricula = matricula;
  }
  public int getmatricula( int matricula) {
    return matricula;
  }
  
   public void setsenha (String senha){
    this.senha=  senha;   
   }
  public String getsenha(String senha){
    return senha ;
        
}
  
}