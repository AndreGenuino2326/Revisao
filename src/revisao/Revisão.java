
package revisao;      

 public class Revisão {
       public static void main(String[] args) {
          Funcionario f = new Emfremeiro();
          f.setNome("João");
          f.setCPF("111.111.111.11");
          f.setIdade(16);
          f.setRG ("54.319.228.3");
          f.setcoren("154");
          
           System.out.println("Nome: " + f.getNome());
           System.out.println("CPF: " + f.getCPF());
            System.out.println("Idade: " + f.getIdade());
              System.out.println("RG: " + f.getRG());
              System.out.println("Coren: " + f.getcoren());
                
           
           Medico m = new Medico();
           m.setNome("Mario");
           m.setCPF("222.222.222.22");
           m.setIdade(18);
           m.setRG("54.319.228.4");
           m.setCRM("145");
           m.setespecialidade("clinico geral");
           
           System.out.println("Nome: " + m.getNome());
           System.out.println("CPF: " + m.getCPF());
           System.out.println("Idade: " + m.getIdade());
           System.out.println("RG: " + m.getRG());
           System.out.println("CRM: " + m.getCRM());
           System.out.println("Especialidade: " + m.getespecialidade());
           
           
           
           
           
                          
       }
    
 
 }


 
