package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logInServlet")
public class logInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Build HTML code
		response.setContentType("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html>";
		htmlResponse +="<h2> your username is " + name + "<br/>";
		htmlResponse +="your password is" + password + "</h2>";
		htmlResponse +="</html>";
		
		out.println(htmlResponse);
		
	}

}
