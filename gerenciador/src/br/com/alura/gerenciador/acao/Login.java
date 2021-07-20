package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando .." + login);
		
		Banco banco = new Banco();
		
		Usuario usuarioBuscado = banco.buscaUsuario(new Usuario(login, senha));
		
		if(usuarioBuscado != null) {
			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuarioBuscado);
			
			return "redirect:entrada?acao=ListaEmpresas";
		}
		
		else {
			return "redirect:entrada?acao=LoginForm"; 
		}
		
		
	}

}
