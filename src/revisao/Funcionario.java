
package revisao;

public class Funcionario extends Pessoa {
    private int matricula;
    private String senha;
    private double ValorHora;
    
    
    public void setmatricula (int matricula) {
    this.matricula = matricula;
  }
  public int getmatricula() {
    return matricula;
  }
  
   public void setsenha (String senha){
    this.senha=  senha;   
   }
  public String getsenha(){
    return senha ;
        
}
  public double setValorHora( double ValorHora){
      return this.ValorHora * 30;
}

    String getcoren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcoren(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}