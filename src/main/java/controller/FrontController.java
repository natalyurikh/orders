package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Natalya_Urikh
 */

@WebServlet(name = "Controller", urlPatterns = "/do/*")
public class FrontController extends HttpServlet
{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
/*		String pathInfo = req.getPathInfo();
		String method = req.getMethod();
		Action action = ActionFactory.getAction(method + pathInfo);

		ActionResult result = action.execute(req, resp);

		if (result.isRedirect()) {
			resp.sendRedirect("/" + result.getView());
			return;
		}



		RequestDispatcher dispatcher = req.getRequestDispatcher(result.getView());
		dispatcher.forward(req, resp);
		*/
	}
}
