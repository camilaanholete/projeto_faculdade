
public class Pessoa{
	public String nome, email, senha;
	   public int idPessoa;
	   
	   public String getNome() { return this.nome; }
	   public String getEmail() { return this.email; }
	   public String getSenha() { return this.senha; }
	   public int getIdPessoa() { return this.idPessoa; }
	   
	   public void setNome(String _nome) { this.nome = _nome; }
	   public void setEmail(String _email) { this.email = _email; }
	   public void setSenha(String _senha) { this.senha = _senha; }
	   public void setIdPessoa(int _id) { this.idPessoa = _id; }
	   
	   public Pessoa()
	   {
	       this.setIdPessoa(0);
	       this.setNome("Sem nome");
	       this.setEmail("sem email");
	       this.setSenha("sem senha");
	   }
	   public Pessoa(int _idPessoa, String _nome, String _email, String _senha) {
	       this.setIdPessoa(_idPessoa);
	       this.setNome(_nome);
	       this.setEmail(_email);
	       this.setSenha(_senha);
	   }
	   public Pessoa(int _idPessoa, String _nome) {
	       this.setIdPessoa(_idPessoa);
	       this.setNome(_nome);
	       
	   }
	   public void MotraDados() {
	       System.out.println("------------------------------------");
	       System.out.println("Id.Pessoa: " + this.getIdPessoa());
	       System.out.println("Nome: " + this.getNome());
	       System.out.println("Email: " + this.getEmail());
	       System.out.println("Senha: " + this.getSenha());
	       System.out.println("------------------------------------");
	   }
	   
	}



	