package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private LoginService userValidationService=new LoginService();
	private TodoService todoService=new TodoService();
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		boolean isUserValid=userValidationService.isUserValid(name, password);
		if(isUserValid) {
			request.getSession().setAttribute("name", name);;
		response.sendRedirect("/list-todos.do");
		
	}
		else {
			request.setAttribute("errorMessage", "Invalid password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
}

