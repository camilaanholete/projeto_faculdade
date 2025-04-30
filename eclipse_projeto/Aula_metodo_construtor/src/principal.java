
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Pessoa pes1 = new Pessoa();
	       pes1.MotraDados();        
	       
	       pes1.setIdPessoa(1);
	       pes1.setNome("Astrogildo");
	       pes1.setEmail("Astrogildo@teste.com");
	       pes1.setSenha("123@123");
	       pes1.MotraDados();
	       
	       Pessoa pes2 = new Pessoa(2,"João","Joao@teste.com","123@troca");
	       pes2.MotraDados();
	       
	       Pessoa pes3 = new Pessoa(3,"Joaquim");
	       pes3.MotraDados();
	       
	       Alunos alu1 = new Alunos(4,"Joaquim","joaquim@teste.com","123", "ADS");
	       System.out.println("Nome:" + alu1.getNome());
	       System.out.println("Curso:" + alu1.getCurso());
	       
	   }

	}
	       
