package exer1_Heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void Som() {
		System.out.println("relinchar...");
	}
	
	@Override
	public void Correr() {
		System.out.println("galopando!");
	}
}
