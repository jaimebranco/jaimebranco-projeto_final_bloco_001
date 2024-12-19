package livro.model;

public class Livro extends LivroModel {

	private String genero;

	public Livro(String nome, String editora, String autor, Integer ano, String genero) {
		super(nome, editora, autor, ano);
		this.genero = genero;
	}

}
