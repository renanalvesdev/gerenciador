package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;

public class RemoveEmpresa implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("id");

		Integer idConvertido = Integer.valueOf(id);

		Banco banco = new Banco();
		banco.remove(idConvertido);

		return "redirect:entrada?acao=ListaEmpresa";
	}

}
