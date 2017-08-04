package br.com.alura.gerenciador.web.tarefas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

public class Login implements Tarefa {

	public String executa(HttpServletRequest request, HttpServletResponse response) {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		if (usuario != null) {
			HttpSession session = request.getSession();
            session.setAttribute("usuarioLogado", usuario);
		}
		
		request.setAttribute("usuario", usuario);
		return "login.jsp";
	}
	
}
