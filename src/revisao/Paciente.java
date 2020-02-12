
package revisao;

public class Paciente extends Pessoa {
    private int CodPaciente;
    private String senha ;

  public int getCodPaciente(int CodPaciente) {
      return CodPaciente;
   }
 
  public void seTCodPaciente (int CodPaciente) {
    this.CodPaciente = CodPaciente;
  }
  public String getsenha(String senha) {
    return senha;
  }
 
  public void setsenha (String senha) {
    this.senha = senha;
  }
  @Override
  public String toString() {
    return "CodPaciente: "+CodPaciente+"" +
                    "\n"+"senha: "+senha+"\n";
  }
}