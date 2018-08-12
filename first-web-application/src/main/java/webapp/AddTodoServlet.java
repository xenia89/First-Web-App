package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet{
private TodoService todoService=new TodoService();

@Override
protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
	request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
	String newTodo=request.getParameter("todo");
	String newCategory=request.getParameter("category");
	todoService.addTodo(new Todo(newTodo,newCategory));
	
	response.sendRedirect("/list-todos.do");
}

}
