package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

/**
 * Servlet implementation class AlteraEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = (String) request.getParameter("nome");
		String data = (String) request.getParameter("data");
		String id = (String) request.getParameter("id");
		
		Integer idConvertido = Integer.valueOf(id);
		Date dataConvertida = null;
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			dataConvertida = format.parse(data);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Banco banco = new Banco();
		
		Empresa empresaBuscada = banco.buscaPorId(idConvertido);
		empresaBuscada.setNome(nome);
		empresaBuscada.setDataCadastro(dataConvertida);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
