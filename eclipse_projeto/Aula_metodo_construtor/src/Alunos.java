
public class Alunos extends Pessoa {
   public String Curso;
   
   public String getCurso() { return this.Curso;}
   
   public void setCurso(String _curso) {
       this.Curso = _curso;
   }
   
   public Alunos() {
       this.Curso = "sem curso";
   }
   public Alunos(int _codigo, String _nome, String _email, String _senha, String _curso) {
       super(_codigo, _nome, _email, _senha);
       // o comando supper carrega o método construtor da classe Pessoas
       this.Curso = _curso;
   }
}
