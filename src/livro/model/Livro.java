package livro.model;

public class Livro extends Obras {

	private String genero;

	public Livro(String nome, String editora, String autor, Integer ano, String genero) {
		super(nome, editora, autor, ano);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static void cadastrar(Livro livro) {
		// TODO Auto-generated method stub
		
	}
	
	

}
