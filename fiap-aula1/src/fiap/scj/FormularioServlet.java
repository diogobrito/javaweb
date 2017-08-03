package fiap.scj;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		
		PrintWriter out = resp.getWriter();
		
		out.append("Obrigado, " + nome + ".\nDados enviados com sucesso!");
		
		PrintWriter file = new PrintWriter(new File("D:\\Diogo\\contato.txt"));
		file.write("Nome: " + nome + "\n");
		file.write("E-mail: " + email + "\n");
		file.write("Nome: " + telefone + "\n");
		file.close();
	}
}
