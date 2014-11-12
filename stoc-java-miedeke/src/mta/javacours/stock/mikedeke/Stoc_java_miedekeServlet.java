package mta.javacours.stock.mikedeke;
import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Stoc_java_miedekeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		int num1;
		int num2;
		int num3;
		num1 = 3;
		num2 = 4;
		num3 = 7;
		int result = num3*(num1+num2); 
		System.out.println("num3(num1+num2)= +reusult");
	}
}
