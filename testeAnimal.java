package exer1_Heranca;

public class testeAnimal {
	
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Bill", 3);
		Animal cavalo = new Cavalo("Pégaso", 5);
		Animal preguica = new Preguica("Preguiçosa", 2);

		System.out.println("Nome do cachorro é " + cachorro.getNome() + " e sua idade é " + cachorro.getIdade() + " anos.");
		cachorro.Som();
		cachorro.Correr();
		System.out.println("\nNome do cavalo é " + cavalo.getNome() + " e sua idade é " + cavalo.getIdade() + " anos.");
		cavalo.Som();
		cavalo.Correr();
		System.out.println("\nNome da preguiça é " + preguica.getNome() + " e sua idade é " + preguica.getIdade() + " anos.");
		preguica.Som();
		preguica.Correr();
		
	}
}
