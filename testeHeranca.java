package heranca;

public class testeHeranca {

	public static void main(String[] args) {
		pessoa marcio = new pessoa("Marcio", 1984);
		funcionario pedro = new funcionario("Pedro", 251, "TI");
		pessoa maria = new funcionario("Maria", 526, "Infra");
		pessoa luiz = new Coordenador("Luiz", 5879, "BD");
	
		System.out.println(marcio.getNome()+ " " + marcio.getMatricula());
		System.out.println(pedro.getNome()+ " "+ pedro.getMatricula() + " " + pedro.getDepartamento());
		System.out.println(maria.getNome() + " " + maria.getMatricula());
		System.out.println(luiz.getNome() + " " + luiz.getMatricula());
	}

}