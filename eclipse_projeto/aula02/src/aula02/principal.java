package aula02;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro kimi = new Cachorro();
		kimi.altura = 30;
		kimi.peso = 15;
		
		System.out.print(kimi.comida);
		kimi.comida = "Salmão";
		System.out.print(kimi.comida);

		kimi.Correr();
		
		Cachorro bob = new Cachorro();
		bob.altura = 15;
		bob.peso = 20;
		bob.comida ="Frango";
		System.out.print(bob.comida);
		
		bob.Latir();
		Cachorro.Morder();
	}

}
