package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/tarefas")
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 3819288112777322410L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {

			String tarefa = req.getParameter("tarefa");
			if (tarefa == null || tarefa.isEmpty()) {
				throw new IllegalArgumentException("Tarefa não informada.");
			}

			String nomeDaClasse = "br.com.alura.gerenciador.web." + tarefa;
			Class<?> classe = Class.forName(nomeDaClasse);
			Tarefa instancia = (Tarefa) classe.newInstance();

			String pagina = instancia.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/" + pagina);
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
