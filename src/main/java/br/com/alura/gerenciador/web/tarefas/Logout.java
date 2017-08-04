package br.com.alura.gerenciador.web.tarefas;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout implements Tarefa {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("usuarioLogado");
    	return "logout.html";
	}
}