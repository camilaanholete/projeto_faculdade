package Portfolio;

public class denunciadados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Denuncia acessar = new Denuncia();
		acessar.assunto = "ocorrencia";
		acessar.tipo = "saude,transporte, iluminacao,...";
		acessar.local = "endereco da denuncia";
		acessar.descricao ="detalhes sobre a denuncia";
		acessar.status = "andamaento da denuncia";
		acessar.descricao_solucao = "retorno sobre a ocorrencia";
		acessar.protocolo = 123;
		acessar.pessoaCli = 4238985;
		acessar.pessoaFunc = 22556489;
		
							
		
		System.out.println(acessar.assunto);
		System.out.println(acessar.tipo);
		System.out.println(acessar.local);
		System.out.println(acessar.descricao);
		System.out.println(acessar.status);		
		System.out.println(acessar.descricao_solucao);
		System.out.println(acessar.protocolo);
		System.out.println(acessar.pessoaCli);
		System.out.println(acessar.pessoaFunc);
		
		
		
		acessar.cadastrarDenuncia();
		acessar.consultarDenuncia();
		acessar.atualizarDenuncia();
		
									

	}

}
