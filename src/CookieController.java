

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/controller")
public class CookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CookieController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		String pass = request.getParameter("pass");
		
		// Cookie
		
		Cookie ck = new Cookie("Username", name);
		response.addCookie(ck);
		
		// Session
		
		HttpSession session = request.getSession();
		session.setAttribute("Password", pass);
		
		response.sendRedirect("result.jsp");
		
		
	}

}
