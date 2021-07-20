package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private static Integer idSequencial = 1;

	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();

	// esse código é executado quando a aplicação sobe

	static {
		listaUsuarios.addAll(Arrays.asList(new Usuario("Renan", "1234"), new Usuario("Blenda", "12345")));
	}

	// Empresa
	public void adiciona(Empresa empresa) {
		empresa.setId(idSequencial++);
		empresas.add(empresa);
	}

	public Empresa buscaPorId(Integer id) {
		return empresas.stream().filter(empresa -> empresa.getId().equals(id)).findFirst().get();
	}

	public void remove(Integer id) {
		empresas = empresas.stream().filter(empresa -> empresa.getId() != id).collect(Collectors.toList());
	}

	public List<Empresa> getEmpresas() {
		return Banco.empresas;
	}

	// Usuario
	public Usuario buscaUsuario(Usuario usuario) {
		return listaUsuarios.stream()
				.filter(u -> u.getLogin().equals(usuario.getLogin()) && u.getSenha().equals(usuario.getSenha()))
				.findFirst().get();
	}

}
