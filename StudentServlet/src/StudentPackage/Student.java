package StudentPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Stu")
public class Student extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user = request.getParameter("userName");
		String roll = request.getParameter("userroll");
		String maths = request.getParameter("eng");
		String science = request.getParameter("sci");
		String social = request.getParameter("mat");
		
		if(user.equals("Student1") && roll.equals("10")) {
			out.print(user + " Marks ---->   ");
			out.println("Eng : " + english + "  Sci : " + science + "  Mat : " + maths);
		}
		else if(user.equals("Student2") && roll.equals("20")) {
			out.println(user + " Marks ---->   ");
			out.println("Eng : " + english + "  Sci : " + science + "  Mat : " + maths);		}
		else {
			out.println("login failed.........");
		}
		out.close();
		}
}
