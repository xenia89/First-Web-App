package com.in28minutes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name=request.getParameter("name");
		request.setAttribute("name",name);
		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		dispatcher.forward(request, response);
		
	}
		
	}

