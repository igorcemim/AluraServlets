package br.com.alura.gerenciador.web.tarefas;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class BuscaEmpresa implements Tarefa {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		String filtro = request.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		request.setAttribute("empresas", empresas);
		return "buscaEmpresa.jsp";
	}

}
