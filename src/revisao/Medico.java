
package revisao;


public class Medico extends Funcionario{
    private String CRM;
    private String  especialidade;

    
     public void setCRM (String CRM){
    this.CRM=  CRM;   
   }
  public String getCRM(String CRM){
    return CRM ;
  }
   public void setespecialidade (String especialidade){
    this.especialidade=especialidade  ;   
   }
  public String getsenha(String especialidade){
    return especialidade ;
} 
  
   public String toString() {
    return "CRM: "+CRM+"" +
                    "\n"+"especialidade: "+especialidade+"\n";
  }
}