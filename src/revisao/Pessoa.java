
package revisao;
	
import java.util.Scanner;

public abstract class Pessoa {
 


  private String nome;
  private String RG;
  private int idade;
  private String CPF;
 
 
 
  public String getNome() {
    return nome;
  }
 
  public void setNome(String nome) {
    this.nome = nome;
  }
 
  public String getRG() {
    return RG;
  }
 
  public void setRG(String l) {
    this.RG = RG;
  }
 
  public int getIdade() {
    return idade;
  }
 
  public void setIdade (int idade) {
    this.idade = idade;
  }
  public String getCPF() {
    return CPF;
  }
 
  public void setCPF(String CPF) {
    this.CPF = CPF;
  }
 
  @Override
  public String toString() {
    return "CPF: "+CPF+ "" +
            "\n"+ "Nome: "+nome+"" +
                "\n"+"RG: "+RG+"" +
                    "\n"+"Idade: "+idade+"\n";
  }
  }
 

