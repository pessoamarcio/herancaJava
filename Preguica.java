package exer1_Heranca;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	
	@Override
	public void Som() {
		System.out.println("Zzzz...");
	}
	
	@Override
	public void Correr() {
		System.out.println("dormindo!");
	}
	
}
