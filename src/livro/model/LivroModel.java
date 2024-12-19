package livro.model;

public abstract class LivroModel {
	
	private String nome;
	private String editora;
	private String autor;
	private Integer ano;
	
	public LivroModel(String nome, String editora, String autor, Integer ano) {
		this.nome = nome;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	

}
