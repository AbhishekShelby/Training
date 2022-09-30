package infinite.ServletAbhishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user, passcode ;
		PrintWriter out = response.getWriter();
		user =request.getParameter("UserName");
		passcode =request.getParameter("Passcode");
		if (user.equals("Infinite")&& passcode.equals("Infinite")){
			RequestDispatcher disp = request.getRequestDispatcher("Menu.html");
			disp.forward(request,response);
			
			out.println(" Correct Credentials... " );
	}else{
		RequestDispatcher disp = request.getRequestDispatcher("Login.html");
		disp.include(request,response);
		out.println(" Invalid Credentials... " );
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
