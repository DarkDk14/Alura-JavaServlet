package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	Indica qual sera a Url da pagina.
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{
	
	// @Override indica que você vai sobre escrever o método.
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<Body>");
		out.println("<h1>");
		out.println("Oi mundo, parabens você escreveu o primeiro servlets.");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMundoServlet foi chamado");
		
	}

}
