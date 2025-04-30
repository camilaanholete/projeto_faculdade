package Portfolio;

public class usuariodados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario logar = new Usuario();
		logar.cpf = "451368-A";
		logar.nome = "Camila";
		logar.endereco = "Vila das Palmeiras,365";
		logar.email = "camila@enaic.com.br";
		logar.senha = "senhamudar";
		logar.confirmacaoSenha = "senhamudar";
		logar.tipoUsuario = "Pessoa Física ou Funcionario";
		logar.telefone = 123456;
		
		System.out.println(logar.cpf);
		System.out.println(logar.nome);
		System.out.println(logar.endereco);
		System.out.println(logar.email);
		System.out.println(logar.senha);
		System.out.println(logar.confirmacaoSenha);
		System.out.println(logar.tipoUsuario);
		System.out.println(logar.telefone);
		
		logar.CadastroUsuario();
		logar.Login();
						

	}

}
