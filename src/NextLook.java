

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NextLook
 */

public class NextLook extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NextLook() {
        // TODO Auto-generated constructor stub
    }
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    try {
			String nextLookNumber = LookAndSay.nextLook(request.getParameter("seq"));
			PrintWriter out = response.getWriter();
			
			RequestDispatcher rs=request.getRequestDispatcher("/index.jsp");
			rs.include(request, response);
			out.println("<div><label> Output:</label></div>");
			out.println("<div><textarea rows=5 cols=100>" + nextLookNumber + "</textarea></div>");
			out.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}

}
