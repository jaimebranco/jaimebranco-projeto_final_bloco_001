package controller;

import java.util.ArrayList;
import livro.model.Obras;
import repository.LivrosRepository;

public class OperacoesController implements LivrosRepository {

	private ArrayList<Obras> listaLivros = new ArrayList<Obras>();

	@Override
	public void procurarPorNome(String nome) {

	}

	@Override
	public void listarTodas() {
		for (var livro : listaLivros) {
			livro.visualizar();

		}
	}

	@Override
	public void cadastrar(Obras livro) {
		listaLivros.add(livro);
		System.out.println("O livro " + livro.getNome() + " foi adicionado com sucesso");

	}

	@Override
	public void deletar(String nome) {
		System.out.println("Tentando deletar o livro: " + nome);
		Obras livro = buscarNaCollection(nome);
		if (livro != null) {
			if (listaLivros.remove(livro)) {
				System.out.println("O livro " + livro.getNome() + " foi deletado com sucesso");
			} else {
				System.out.println("Erro ao deletar o livro.");
			}
		} else {
			System.out.println("Livro não encontrado.");
		}
	}

	public Obras buscarNaCollection(String nome) {
		for (var livro : listaLivros) {
			System.out.println("Verificando livro: " + livro.getNome());
			if (livro.getNome().equalsIgnoreCase(nome)) {
				return livro;
			}
		}
		return null;
	}
}