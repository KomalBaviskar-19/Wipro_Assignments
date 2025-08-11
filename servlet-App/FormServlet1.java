import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FormServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("age", age);
        session.setAttribute("password", password);
        session.setAttribute("gender", gender);
        session.setAttribute("address", address);

        response.sendRedirect("WelcomeServlet1");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.getWriter().println("Please submit the form from index1.html");
    }
}
