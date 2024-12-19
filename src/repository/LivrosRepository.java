package repository;

import livro.model.Obras;

public interface LivrosRepository {
	
	// CRUD da conta
	public void procurarPorNome(String nome);
	public void listarTodas();
	public void cadastrar(Obras livro);
	public void deletar(String nome);

	

	
	

}
