package com.sooriya.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sooriya.web.dao.ActorDao;
import com.sooriya.web.model.Actor;

/**
 * Servlet implementation class GetActorController
 */
public class GetActorController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		int aid = Integer.parseInt(request.getParameter("aid"));

		ActorDao adao = new ActorDao();
		Actor a = adao.getActor(aid);
		
		request.setAttribute("Actor", a);
		
		RequestDispatcher rd = request.getRequestDispatcher("ShowActor.jsp");
		rd.forward(request, response);
	
	}
}
