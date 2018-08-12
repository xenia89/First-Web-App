package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet{
	
private TodoService todoService=new TodoService();


@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
	
	request.setAttribute("todos",todoService.retrieveTodos());
	request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
}

}
