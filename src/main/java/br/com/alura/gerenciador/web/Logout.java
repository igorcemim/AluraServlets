package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	private static final long serialVersionUID = 697426254938121928L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    	req.getSession().removeAttribute("usuario.logado");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>Logout efetuado</body></html>");
    }
}