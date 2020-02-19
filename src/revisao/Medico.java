
package revisao;


public class Medico extends Funcionario{
    private String CRM;
    private String  especialidade;

    
     public void setCRM (String CRM){
    this.CRM=  CRM;   
   }
  public String getCRM(){
    return CRM ;
  }
   public void setespecialidade (String especialidade){
    this.especialidade=especialidade  ;   
   }
  public String getespecialidade(){
    return especialidade ;
} 
  
   
}