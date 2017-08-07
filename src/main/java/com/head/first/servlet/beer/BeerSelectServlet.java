package com.head.first.servlet.beer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelectServlet extends HttpServlet
{
	public static int Counter = 0;

	/*
	 * @Override protected void doGet(HttpServletRequest req,
	 * HttpServletResponse resp) throws ServletException, IOException {
	 * PrintWriter out = resp.getWriter(); out.println("Visited Times=" +
	 * Counter++); }
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		// 从请求中获取参数
		String co = req.getParameter("color");
		BeerExpert expert = new BeerExpert();
		Beer b = expert.getBrand(co);
		
		String exp= "Jay";

		req.setAttribute("expert", exp);
		req.setAttribute("beer", b);
		//PrintWriter out = resp.getWriter();
		//out.println(req.getAttribute("styles"));
		
//		MyHttpRequestWrapper requestWrapper = new MyHttpRequestWrapper(req);
		 RequestDispatcher view = req.getRequestDispatcher("/myreslt");
		 view.forward(req, resp);

		// resp.setContentType("text/html");
		/*
		 * PrintWriter writer = resp.getWriter();
		 * 
		 * StringBuilder builder = new StringBuilder(); for (String s : brands)
		 * builder.append("<br>Expert Advice: " + s); writer.
		 * println("<html><body align=\"center\"><p>Beer Selection Advice</p><br>"
		 * + "<p>Got beer color:" + co + "</p><h4>" + builder.toString() +
		 * "</h4></body></html>");
		 */

	}

}
