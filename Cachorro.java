package exer1_Heranca;


public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}
	
	@Override
	public void Som() {
		System.out.println("latindo!");
	}
	
	@Override
	public void Correr() {
		System.out.println("Correndo... bora Bill!");
	}
	
}
