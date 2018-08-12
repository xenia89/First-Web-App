package webapp;

import java.util.List;
import java.util.ArrayList;

public class TodoService {
	private static List<Todo> todos=new ArrayList<Todo>();
	static {
		todos.add(new Todo("Dune", "Frank Herbert"));
	todos.add(new Todo("Foundation","Isaac Asimov"));
	todos.add(new Todo("The Dark Tower","Stephen King"));
	}
	public List<Todo> retrieveTodos() {
		return todos;
	}
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
