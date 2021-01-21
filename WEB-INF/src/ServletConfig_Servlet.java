import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig_Servlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ServletConfig config=getServletConfig();
		String Uname=config.getInitParameter("uname");
		String pwd=config.getInitParameter("pwd");

		PrintWriter out = res.getWriter();
		out.println(Uname +" ");
		out.println(pwd +" ");
		//out.println(address + "<br>");
	}

}