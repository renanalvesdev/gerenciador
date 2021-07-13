package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");

		switch (paramAcao) {
			case "ListaEmpresa": {
				
				ListaEmpresas acao = new ListaEmpresas();
				acao.executa(request, response);
								
				System.out.println("Listando empresa");
				break;
			}
			case "RemoveEmpresa": {
				RemoveEmpresa acao = new RemoveEmpresa();
				acao.executa(request, response);
				break;
			}
			case "NovaEmpresa": {
				NovaEmpresa acao = new NovaEmpresa();
				acao.executa(request, response);
				System.out.println("Mostrando empresa");
				break;
			}
			case "MostraEmpresa": {
				MostraEmpresa acao = new MostraEmpresa();
				acao.executa(request, response);
				System.out.println("Mostrando empresa");
				break;
			}
			case "AlteraEmpresa": {
				AlteraEmpresa acao = new AlteraEmpresa();
				acao.executa(request, response);
				System.out.println("Alterando empresa");
				break;
			}

		}

	}

}
