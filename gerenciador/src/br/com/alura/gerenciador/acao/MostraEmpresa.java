package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class MostraEmpresa {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Integer idConvertido = Integer.valueOf(id);
		
		Banco banco  = new Banco();		
		Empresa empresa = banco.buscaPorId(idConvertido);
		request.setAttribute("empresa", empresa);

		return "forward:formMostraEmpresa.jsp";
		
	}
	
}
